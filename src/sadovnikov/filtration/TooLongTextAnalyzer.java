package sadovnikov.filtration;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int length) {
        this.maxLength = length;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength){
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
