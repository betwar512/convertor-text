package net.abbas;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.font.FontProvider;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

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


    /**
     *
     * @return
     * @throws URISyntaxException
     */
    private FontProvider getFontProviders() throws URISyntaxException {
        FontProvider fontProvider = new DefaultFontProvider(true, true, false);
        URL folderUrl = ContalPdfConvertor.class.getResource("/fonts");
        if (folderUrl != null) {
            File folder = new File(folderUrl.toURI());
            File[] files = folder.listFiles();
            if (files != null)
            for (File file : files) {
                if(file.isDirectory())
                      fontProvider.addDirectory(file.getAbsolutePath());
            }
        }
        return fontProvider;
    }

    /**
     *
     * @throws IOException
     * @throws URISyntaxException
     */
    public void testcItextSevenConvertor() throws IOException, URISyntaxException {
        // pdfHTML specific code
        InputStream asInput = new ByteArrayInputStream(html.getBytes());
        PdfWriter pdfWriter = new PdfWriter(new FileOutputStream(this.outputFile));
        PdfDocument     pdf = new PdfDocument(pdfWriter);
        pdf.setTagged();

        if(this.pageHeight > 0 ) {
            PageSize pageSize = new PageSize(this.pageWidth, this.pageHeight);
            pdf.setDefaultPageSize(pageSize);
        }

        this.converterProperties.setFontProvider(this.getFontProviders());
        HtmlConverter.convertToPdf(asInput, pdf, this.converterProperties);
    }


}
