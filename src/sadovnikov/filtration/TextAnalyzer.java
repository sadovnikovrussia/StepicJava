package sadovnikov.filtration;

interface TextAnalyzer {
    Label processText(String text);

    default Label processText(String text, String levelOK){
        Label lbl = processText(text);
        return levelOK == "OK"? Label.OK : Label.SPAM;
    }
}
