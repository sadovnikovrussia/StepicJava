package sadovnikov.filtration;

public class Main {

    private static Label checkLabels(TextAnalyzer[] analyzers, String text, String lvlOK) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        String comment = "Дальше, вам необходимо реализовать три класса, которые реализуют данный интерфейс: SpamAnalyzer, NegativeTextAnalyzer и TooLongTextAnalyzer.\n" +
                "SpamAnalyzer должен конструироваться от массива строк с ключевыми словами. Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.\n" +
                "NegativeTextAnalyzer должен конструироваться конструктором по-умолчанию.\n" +
                "TooLongTextAnalyzer должен конструироваться от int'а с максимальной допустимой длиной комментария. Объект этого класса должен сохранять в своем состоянии это число в приватном поле maxLength.\n" +
                "Наверняка вы уже заметили, что SpamAnalyzer и NegativeTextAnalyzer во многом похожи – они оба проверяют текст на наличие каких-либо ключевых слов (в случае спама мы получаем их из конструктора, в случае негативного текста мы заранее знаем набор грустных смайликов) и в случае нахождения одного из ключевых слов возвращают  Label (SPAM и NEGATIVE_TEXT соответственно), а если ничего не нашлось – возвращают OK.\n" +
                "Давайте эту логику абстрагируем в абстрактный класс KeywordAnalyzer следующим образом:\n" +
                " Выделим два абстрактных метода getKeywords и getLabel, один из которых будет возвращать набор ключевых слов, а второй метку, которой необходимо пометить положительные срабатывания. Нам незачем показывать эти методы потребителям классов, поэтому оставим доступ к ним только для наследников.\n" +
                "Реализуем processText таким образом, чтобы он зависел только от getKeywords и getLabel.\n" +
                "Сделаем SpamAnalyzer и NegativeTextAnalyzer наследниками KeywordAnalyzer и реализуем абстрактные методы.\n" +
                "\n" +
                "Последний штрих – написать метод checkLabels, который будет возвращать метку для комментария по набору анализаторов текста. checkLabels должен возвращать первую не-OK метку в порядке данного набора анализаторов, и OK, если все анализаторы вернули OK.\n" +
                "Используйте, пожалуйста, модификатор доступа по-умолчанию для всех классов.\n" +
                "В итоге, реализуйте классы KeywordAnalyzer, SpamAnalyzer, NegativeTextAnalyzer и TooLongTextAnalyzer и метод checkLabels. TextAnalyzer и Label уже подключены, лишние импорты вам не потребуются";
        String[] words = new String[] {"Дальше", "вам"};

        TextAnalyzer[] textAnalyzers = {new TooLongTextAnalyzer(100), new NegativeTextAnalyzer()};

        System.out.println(checkLabels(textAnalyzers, comment, "OK"));


    }



}
