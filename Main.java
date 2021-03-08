class Main {
  public static void main(String[] args) {
    LanguageStore languageStore = new LanguageStore();
    Language java = languageStore.chooseLanguage("Java");
    System.out.println();
    Language c = languageStore.chooseLanguage("C");
    System.out.println();
    Language python = languageStore.chooseLanguage("PYTHON");
    System.out.println();
    Language js = languageStore.chooseLanguage("JS");
  }
}