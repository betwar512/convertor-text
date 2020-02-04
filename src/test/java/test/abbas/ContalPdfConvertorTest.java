package test.abbas;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.layout.font.FontProvider;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContalPdfConvertorTest {
    Logger logger = LoggerFactory.getLogger(ContalPdfConvertorTest.class);

    @Tag("slow")
    @Test
    public void testAddFontstoProvider() throws URISyntaxException {
        URL folderUrl = ContalPdfConvertorTest.class.getResource("/fonts");
        assertNotNull(folderUrl);
        File folder = new File(folderUrl.toURI());
        // Check files
        File[] files = folder.listFiles();
         assertNotNull(files);
         // Check files count
         assertTrue(files.length > 0 );
    }


    @Test
    public void testFontProvider() throws URISyntaxException {
        ConverterProperties properties = new ConverterProperties();
        URL folderUrl = ContalPdfConvertorTest.class.getResource("/fonts");
        assertNotNull(folderUrl);
        File folder = new File(folderUrl.toURI());
        assertNotNull(folder);
        assertTrue(folder.listFiles().length > 0 );

        FontProvider fontProvider = new DefaultFontProvider(
                true,
                true,
                false);

        for (File file : folder.listFiles()) {
            if(file.isDirectory()){
                fontProvider.addDirectory(file.getAbsolutePath());
            }
        }

        properties.setFontProvider(fontProvider);
        properties.getFontProvider().getFontSet().getFonts().forEach(t-> logger.debug(t.getFontName()));

    }





}
