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

    private boolean isLandscape = false;

    public ContalPdfConvertor(String html, File outputFile) {
        this.html = html;
        this.outputFile = outputFile;
        this.converterProperties = new ConverterProperties();
        this.dfp = new DefaultFontProvider(true, true, false);
    }


    public void isMobile(){
        pageHeight = 2000;
         pageWidth =  440;
    }


    public void setLandscape(){
    this.isLandscape = true;
    }

    public void addFont(byte[] font){
        this.dfp.addFont(font);
    }

    /**
     *
     * @throws IOException
     */
    public void testcItextSevenConvertor() throws IOException {
        // pdfHTML specific code
        InputStream asInput = new ByteArrayInputStream(html.getBytes());
        PdfWriter pdfWriter = new PdfWriter(new FileOutputStream(this.outputFile));
        PdfDocument     pdf = new PdfDocument(pdfWriter);
        if(this.isLandscape){ pdf.setDefaultPageSize(PageSize.A4.rotate()); }

        pdf.setTagged();
        if(this.pageHeight > 0 ) {
            PageSize pageSize = new PageSize(this.pageWidth, this.pageHeight);
            pdf.setDefaultPageSize(pageSize);
        }
        this.converterProperties.setFontProvider(this.dfp);
        HtmlConverter.convertToPdf(asInput, pdf, this.converterProperties);
    }


}
