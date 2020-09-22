package net.bakaar.jdk.demo;

public class TextBlock {
    private void stringBefore() {
        //tag::blockString[]
        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";
        //end::blockString[]
        System.out.println(html);
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
    }
    //end::textBlock[]
}
