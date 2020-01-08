package net.abbas;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.font.FontProvider;

import java.io.*;

public class ContalPdfConvertor {

    private String html ;

    private File outputFile;

    private String footerLeft , headerLeft , headerMiddle , headerRight;

    private int pageWidth = 0 , pageHeight = 0;

    private boolean addPageNumber = true;

    private boolean isMobile = false;

    private FontProvider dfp;

    private ConverterProperties converterProperties ;


    public ContalPdfConvertor(String html, File outputFile) {
        this.html = html;
        this.outputFile = outputFile;
        this.converterProperties = new ConverterProperties();

    }


    public void isMobile(){
        pageHeight = 2000;
         pageWidth =  440;
    }



    public void addFont(String font){

        if(font != null && !font.isEmpty()) {
            if (dfp == null) {
                this.dfp = new DefaultFontProvider(true, true, false);
            }
            dfp.addFont(font);
            this.converterProperties.setFontProvider(dfp);
        }
    }




    // style="page-break-after: always; width: 320pt;"


    public void testcItextSevenConvertor() throws IOException {
        // pdfHTML specific code
        InputStream asInput = new ByteArrayInputStream(html.getBytes());
        PdfWriter pdfWriter = new PdfWriter(new FileOutputStream(this.outputFile));
        PdfDocument     pdf = new PdfDocument(pdfWriter);
        pdf.setTagged();

        if(this.pageHeight > 0 ) {
            PageSize pageSize = new PageSize(this.pageWidth, this.pageHeight);
            pdf.setDefaultPageSize(pageSize);
        }

        HtmlConverter.convertToPdf(asInput, pdf, this.converterProperties);
    }


}
