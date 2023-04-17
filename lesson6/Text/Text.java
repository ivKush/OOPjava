package lesson6.Text;

public class Text {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
       this.text = text;
    }

    @Override
    public String toString() {

        return  String.format("Измененный текст: %s", text);
    }

}
