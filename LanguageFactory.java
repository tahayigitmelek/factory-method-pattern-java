abstract class LanguageFactory {
  
  abstract Language createLanguage(String name);

  Language chooseLanguage(String name){
      Language language = createLanguage(name);
      if (language == null) {
        System.out.println("Error!");
        return null;
      }
      System.out.println("Wait..!!");
      System.out.println("System is configuring..");
      language.selectLanguage();
      return language;
  }

}