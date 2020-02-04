import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import org.junit.jupiter.api.Test;


import java.io.*;

public class TextConvertor {


    @Test
    public void testcItextSevenConvertor() throws Exception{
        File pdfDest = new File("/Users/betwar/Documents/itext_output.pdf");
        // pdfHTML specific code
        InputStream asInput = new ByteArrayInputStream(getHtml().getBytes());
        ConverterProperties converterProperties = new ConverterProperties();
        HtmlConverter.convertToPdf(asInput, new FileOutputStream(pdfDest), converterProperties);


    }


    public String getHtml(){

        return  "<html>\n" +
                "<head>\n" +
                "<title>Mobility and Transfer Assessment</title>\n" +
                "<style>" + getCss() + "</style>"+
                "</head>\n" +
                "<body>\n" +
                "\u200B\n" +
                "<section class=\"gentle\">\n" +
                "\u200B\n" +
                "<h1><span>All Aged Care</span> <br />Mobility and Transfer Assessment</h1>\n" +
                "<p class=\"instructions\">(To be completed for relevant consumers on admission and as required)</p>\n" +
                "&nbsp;\n" +
                "<table border=\"1\" cellpadding=\"1\" cellspacing=\"1\" class=\"borderless\" style=\"width:100%;\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td><strong>First Name:</strong> <span contenteditable=\"false\" th:if=\"${linkedclientdto.firstname != null && !#strings.isEmpty(linkedclientdto.firstname)}\" th:text=\"${linkedclientdto.firstname}\">[ linkedclientdto firstname ] </span></td>\n" +
                "<td><strong>Surname:</strong> <span contenteditable=\"false\" th:if=\"${linkedclientdto.lastname != null && !#strings.isEmpty(linkedclientdto.lastname)}\" th:text=\"${linkedclientdto.lastname}\">[ linkedclientdto lastname ] </span></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>Date of Assessment:</strong></td>\n" +
                "<td><strong>Date of Birth:</strong> <span contenteditable=\"false\" th:if=\"${linkedclientdto.dateofbirth != null && !#strings.isEmpty(linkedclientdto.dateofbirth)}\" th:text=\"${linkedclientdto.dateofbirth}\">[ linkedclientdto dateofbirth ] </span></td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "&nbsp; &nbsp;\n" +
                "\u200B\n" +
                "<table border=\"1\" cellpadding=\"1\" cellspacing=\"1\" style=\"width:100%;\">\n" +
                "<thead>\n" +
                "<tr>\n" +
                "<th scope=\"col\">Activity</th>\n" +
                "<th colspan=\"4\" scope=\"col\">Ability / Supports</th>\n" +
                "</tr>\n" +
                "</thead>\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<th rowspan=\"5\" scope=\"row\">Walking</th>\n" +
                "<th>Independent</th>\n" +
                "<td>Yes</td>\n" +
                "<td>No</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">Assistance required</th>\n" +
                "<td colspan=\"3\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">No. of assistants:</th>\n" +
                "<td>One person</td>\n" +
                "<td>Two persons</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"2\" scope=\"row\">Type of aid:</th>\n" +
                "<td>Walking stick</td>\n" +
                "<td>Wheeled frame</td>\n" +
                "<td>Frame</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Wheelchair</td>\n" +
                "<td>Walk belt</td>\n" +
                "<td>Other ___________________</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"5\" scope=\"row\">Lying to sitting on edge of bed</th>\n" +
                "<th>Independent</th>\n" +
                "<td>Yes</td>\n" +
                "<td>No</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">Assistance required</th>\n" +
                "<td colspan=\"3\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">No. of assistants:</th>\n" +
                "<td>One person</td>\n" +
                "<td>Two persons</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"2\" scope=\"row\">Type of aid:</th>\n" +
                "<td>Walking stick</td>\n" +
                "<td>Wheeled frame</td>\n" +
                "<td>Frame</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Wheelchair</td>\n" +
                "<td>Walk belt</td>\n" +
                "<td>Other ___________________</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"5\" scope=\"row\">Bed to bed/chair to bed</th>\n" +
                "<th>Independent</th>\n" +
                "<td>Yes</td>\n" +
                "<td>No</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">Assistance required</th>\n" +
                "<td colspan=\"3\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">No. of assistants:</th>\n" +
                "<td>One person</td>\n" +
                "<td>Two persons</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"2\" scope=\"row\">Type of aid:</th>\n" +
                "<td>Walking stick</td>\n" +
                "<td>Wheeled frame</td>\n" +
                "<td>Frame</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Wheelchair</td>\n" +
                "<td>Walk belt</td>\n" +
                "<td>Other ___________________</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"5\" scope=\"row\">Toileting</th>\n" +
                "<th>Independent</th>\n" +
                "<td>Yes</td>\n" +
                "<td>No</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">Assistance required</th>\n" +
                "<td colspan=\"3\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">No. of assistants:</th>\n" +
                "<td>One person</td>\n" +
                "<td>Two persons</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"2\" scope=\"row\">Type of aid:</th>\n" +
                "<td>Walking stick</td>\n" +
                "<td>Wheeled frame</td>\n" +
                "<td>Frame</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Wheelchair</td>\n" +
                "<td>Walk belt</td>\n" +
                "<td>Other ___________________</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"5\" scope=\"row\">Sitting to standing</th>\n" +
                "<td>&nbsp;</td>\n" +
                "<th>Independent</th>\n" +
                "<td>Yes</td>\n" +
                "<td>No</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">Assistance required</th>\n" +
                "<td colspan=\"3\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">No. of assistants:</th>\n" +
                "<td>One person</td>\n" +
                "<td>Two persons</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"2\" scope=\"row\">Type of aid:</th>\n" +
                "<td>Walking stick</td>\n" +
                "<td>Wheeled frame</td>\n" +
                "<td>Frame</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Wheelchair</td>\n" +
                "<td>Walk belt</td>\n" +
                "<td>Other ___________________</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"5\" scope=\"row\">Positioning in bed</th>\n" +
                "<th>Independent</th>\n" +
                "<td>Yes</td>\n" +
                "<td>No</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">Assistance required</th>\n" +
                "<td colspan=\"3\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">No. of assistants:</th>\n" +
                "<td>One person</td>\n" +
                "<td>Two persons</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"2\" scope=\"row\">Type of aid:</th>\n" +
                "<td>Walking stick</td>\n" +
                "<td>Wheeled frame</td>\n" +
                "<td>Frame</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Wheelchair</td>\n" +
                "<td>Walk belt</td>\n" +
                "<td>Other ___________________</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"5\" scope=\"row\">Showering</th>\n" +
                "<th>Independent</th>\n" +
                "<td>Yes</td>\n" +
                "<td>No</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">Assistance required</th>\n" +
                "<td colspan=\"3\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th scope=\"row\">No. of assistants:</th>\n" +
                "<td>One person</td>\n" +
                "<td>Two persons</td>\n" +
                "<td>&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<th rowspan=\"2\" scope=\"row\">Type of aid:</th>\n" +
                "<td>Walking stick</td>\n" +
                "<td>Wheeled frame</td>\n" +
                "<td>Frame</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>Wheelchair</td>\n" +
                "<td>Walk belt</td>\n" +
                "<td>Other ___________________</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "&nbsp;\n" +
                "\u200B\n" +
                "<table border=\"1\" cellpadding=\"1\" cellspacing=\"1\" class=\"borderless\" style=\"width:100%;\">\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<th>Assessor&#39;s Signature: .........................................................................</td>\n" +
                "<th>Date: .........................................................................</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n" +
                "\u200B\n" +
                "</section>\n" +
                "\u200B\n" +
                "</body>\n" +
                "</html>";

    }



    public String getCss(){
      return "body {\n" +
              "margin: 0.5in; \n" +
              "line-height: 140%;\n" +
              "}\n" +
              "* { \n" +
              "font-size: 13px;\n" +
              "font-family: Verdana, Arial, sans-serif;\n" +
              "}\n" +
              "div.title { \n" +
              "font-size: 26px;\n" +
              "line-height: 130%;\n" +
              "padding: 1em;\n" +
              "text-align: center;\n" +
              "font-weight: bold;\n" +
              "text-transform: uppercase;\n" +
              "border-top-style: double;\n" +
              "border-bottom-style: double;\n" +
              "}\n" +
              "h2 { \n" +
              "text-align: center;\n" +
              "font-size: 20px;\n" +
              "}\n" +
              "h2.subhead { \n" +
              "font-size: 13px;\n" +
              "}\n" +
              "\u200B\n" +
              "li, dt, dd { \n" +
              "margin-bottom: 1rem;\n" +
              "}\n" +
              "dt {\n" +
              "font-weight: bold;\n" +
              "}\n" +
              "table { \n" +
              "border: 1px solid black;\n" +
              "width: 100%;\n" +
              "border-collapse: collapse;\n" +
              "margin: 1em 0;\n" +
              "}\n" +
              "th, td {\n" +
              "border: 1px solid black;\n" +
              "text-align: left;\n" +
              "padding: 5px;\n" +
              "vertical-align: top;\n" +
              "}\n" +
              "\u200B\n" +
              "\u200B\n" +
              "\u200B\n" +
              "table.rows-only-bordered td { \n" +
              "border-bottom: 1px solid black;\n" +
              "border-left: 0;\n" +
              "border-right: 0;\n" +
              "}\n" +
              "\u200B\n" +
              "\u200B\n" +
              "/* Often instructions follow the document title */\n" +
              "\u200B\n" +
              ".instructions { \n" +
              "text-align: center;\n" +
              "font-size: 15px;\n" +
              "}\n" +
              ".centered { \n" +
              "text-align: center;\n" +
              "}\n" +
              "\u200B\n" +
              ".left { \n" +
              "text-align: left;\n" +
              "}\n" +
              "\u200B\n" +
              "\u200B\n" +
              "/* \n" +
              "Tables come in blue, black, lightgrey and darkgrey,\n" +
              "which each have different th colours.\n" +
              "*/\n" +
              "\u200B\n" +
              ".bluetable thead th { \n" +
              "background-color: #356091; \n" +
              "color: #FFF;\n" +
              "}\n" +
              "\u200B\n" +
              "/* Forgive me father for I have sinned... nesting tables inside other tables */\n" +
              ".gentle table table.borderless {\n" +
              "margin: 0;\n" +
              "}\n" +
              ".gentle table table.borderless th {\n" +
              "text-align: left;\n" +
              "vertical-align: top;\n" +
              "}\n" +
              "\n" +
              ".borderless, .borderless td, .borderless th { \n" +
              "border: 0;\n" +
              "padding-left: 0;\n" +
              "}\n" +
              "\u200B\n" +
              ".borderless th { \n" +
              "background: none;\n" +
              "}\n" +
              ".lightgreytable thead th { \n" +
              "background-color: #ccc;\n" +
              "}\n" +
              "\u200B\n" +
              ".darkgreytable th { \n" +
              "background-color: #333; \n" +
              "color: #FFF;\n" +
              "}\n" +
              "\u200B\n" +
              ".blacktable th { \n" +
              "background-color: #000; \n" +
              "color: #FFF;\n" +
              "}\n" +
              "\u200B\n" +
              "/* \n" +
              " \"Gentle\" sections (forms whose originals used pastel blues)\n" +
              " h1s are grey and blue.\n" +
              " tables have pastel blue headers which are centre-aligned except for the first in each row.\n" +
              "*/\n" +
              "\u200B\n" +
              ".gentle th { \n" +
              "background:#b5cde8;\n" +
              "text-align: center;\n" +
              "vertical-align: middle;\n" +
              "}\n" +
              "\u200B\n" +
              ".gentle table.borderless th {\n" +
              "background: none;\n" +
              "}\n" +
              "\u200B\n" +
              ".gentle h1 {\n" +
              "color: #4372c4;\n" +
              "text-transform: uppercase;\n" +
              "font-weight: normal;\n" +
              "font-size: 24px;\n" +
              "text-align: center;\n" +
              "line-height: 140%;\n" +
              "}\n" +
              ".gentle h1 span {\n" +
              "color: gray;\n" +
              "font-size: inherit;\n" +
              "}\n" +
              "\u200B\n" +
              ".gentle h2 {\n" +
              "font-size: 13px;\n" +
              "background: #b5cde8;\n" +
              "text-align: left;\n" +
              "padding: 2px 5px;\n" +
              "border-top: 1px solid black;\n" +
              "border-bottom: 1px solid black;\n" +
              "}\n" +
              "\u200B\n" +
              ".gentle h3 {\n" +
              "font-size: 13px;\n" +
              "font-style: italic;\n" +
              "margin-top: 20px;\n" +
              "}\n" +
              "\u200B\n" +
              "\u200B\n" +
              ".gentle .notice-block { \n" +
              "text-align: center;\n" +
              "font-weight: bold;\n" +
              "background: #b5cde8;\n" +
              "padding: 2px 5px;\n" +
              "border-top: 1px solid black;\n" +
              "border-bottom: 1px solid black;\n" +
              "}\n" +
              "\u200B\n" +
              ".note { \n" +
              "font-weight: normal; \n" +
              "font-size: 90%;\n" +
              "}\n" +
              "\u200B\n" +
              "\u200B\n" +
              "/* \n" +
              "These table have rowgroups too, so here are some widths \n" +
              "to maintain a bit of horizontal th consistency.\n" +
              "*/\n" +
              "\u200B\n" +
              "\u200B\n" +
              ".col_lvl1 { \n" +
              "width: 20%;\n" +
              "}\n" +
              ".col_lvl2 { \n" +
              "width: 15%;\n" +
              "}\n" +
              ".fillable {\n" +
              "border-bottom: 2px dotted black !important;\n" +
              "}";

    }


}
