package sadovnikov.filtration;

public class NegativeTextAnalyzer
        extends KeywordAnalyzer
        implements TextAnalyzer {

    private String[] keywords = {":(", "=(", ":|"};

    @Override
    public Label processText(String text) {
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
