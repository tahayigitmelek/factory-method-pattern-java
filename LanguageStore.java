public class LanguageStore extends LanguageFactory {
  @Override
  Language createLanguage(String name){
    name = name.toLowerCase();
    if (name.equals("python")) return new Python();
    if (name.equals("js")) return new JS();
    if (name.equals("java")) return new Java();
    if (name.equals("c")) return new C();
    return null;
  }
}