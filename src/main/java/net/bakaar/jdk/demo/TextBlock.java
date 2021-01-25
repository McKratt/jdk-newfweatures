package net.bakaar.jdk.demo;

public class TextBlock {
    private void stringBlock() {
        //tag::blockString[]
        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";
        //end::blockString[]
        System.out.println(html);
    }

    private void formatedString() {
        //tag::formatedString[]
        String name = "toto";
        String type = "type";
        String.format("{"+
                      "\"type\":\"%s\"," +
                      "\"name\":\"%s\"" +
                      "}", 
        type, name);
        //end::formatedString[]
    }


    private void textBlock() {
        //tag::textBlock[]
        String html = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;
                //end::textBlock[]
    }

    private void formatedTextBlock(){
        //tag::formatedTextBlock[]
        String name = "toto";
        String type = "type";
        """
                        {
                          "type": "%s",
                          "name": "%s"
                        }""".formatted(type, name);
                        //end::formatedTextBlock[]
    }
}
