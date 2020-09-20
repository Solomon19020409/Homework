public class Word {
    String word_target;
    String word_explain;

    /**
     * Default constructor.
     */
    public Word(String eng, String vie) {
        this.word_target = eng;
        this.word_explain = vie;
    }

    /**
     * getWord_target.
     */
    public String getWord_target() {
        return word_target;
    }

    /**
     * getWord_explain.
     */
    public String getWord_explain() {
        return word_explain;
    }

    /**
     * SetWord_target.
     */
    public void setWord_target() { this.word_target = word_target; }

    /**
     * SetWord_target.
     */
    public void setWord_explain() { this.word_explain = word_explain; }

}
