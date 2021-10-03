package com.gryffindor.frontend.scenes.mainscene.field.translate;

import com.gryffindor.backend.entities.Word;
import com.gryffindor.frontend.scenes.mainscene.field.IController;

public class TranslateController implements IController {
  private Word word;

  private TranslateField translateField;

  /** Khởi tạo controller của vùng dịch. */
  public TranslateController(TranslateField translateField) {
    this.translateField = translateField;

    translateField.getPane().setVisible(false); // mặc định ẩn
  }

  void onClickPronouncedButton() {
    translateField.getPronouncedButton().setOnAction(event -> {
      System.out.println(word.getWordTarget());
    });
  }

  /**
   * Khởi tạo các thuộc tính liên quan đến {@link Word}.
   * 
   * @param word từ muốn đặt
   */
  public void setWord(Word word) {
    this.word = word;

    translateField.getPane().setVisible(true);
    translateField.getPronouncedText().setText("'Phiên âm IPA'");
    translateField.getWordTarget().setText(word.getWordTarget());
  }

  public Word getWord() {
    return word;
  }
}
