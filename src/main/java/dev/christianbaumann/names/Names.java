package dev.christianbaumann.names;

public class Names {

    // foo doesn’t mean anything at all, nor does bar.
    // The solution to meaningless names like foo lies in the realisation
    // that people find concrete examples easier to understand than abstract examples.
    // Rename foo to a concrete real-world concept, such as food or foot.
    String foo;
    Integer bar;

    // data and object lack precision.
    // No doubt they do name data and objects, but you already knew that without the vague name.
    // Rename data and object to a more descriptive name that identifies what kind of data it is.
    String object;
    Integer data;

    // acc and pos look like abbreviated forms of words,
    // which causes problems when you realise that you have to choose
    // between words like "accumulator" and "accuracy",
    // or "between position" and "point of sale".
    // Abbreviations tend to suffer from ambiguity
    // since multiple words often share the same abbreviation.
    // Refactor abbreviations to the complete word,
    // which is easy as long as you know which word that is.
    Object acc;
    Object poc;

}
