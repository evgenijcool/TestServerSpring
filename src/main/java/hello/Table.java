package hello;

/**
 * Created by Evgeny on 08.12.2016.
 */
public class Table {
    private Integer row;
    private Integer columns;
    private String header;
    private String color;

    public Table(Integer row, Integer columns, String header, String color) {
        this.row = row;
        this.columns = columns;
        this.header = header;
        this.color = color;
    }

    public String createHtmlTable(){
        StringBuilder builder = new StringBuilder();
        builder.append("<html>\n" +
                "<head>\n" +
                    "<meta charset=\"utf-8\">\n" +
                    "<title>Таблица</title>\n" +
                "</head>\n" +
                "<body>\n"+
                    "<table bgcolor=\"#"+ color +"\"" +
                " border = \"1\" " +
                "width=\"100\" " +
                "hight=\"100\">\n");
        builder.append("<caption>" + header + "</caption>\n");
        for (Integer i = 0; i < row; i++) {
            builder.append("<tr>\n");
            for (Integer integer = 0; integer < columns; integer++) {
                builder.append("<td>__</td>\n");
            }
            builder.append("</tr>\n");
        }
        builder.append("</table>\n" +
                "</body>\n" +
                "</html>");
        return builder.toString();
    }
}
