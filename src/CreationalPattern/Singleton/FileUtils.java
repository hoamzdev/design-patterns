package CreationalPattern.Singleton;

public class FileUtils {
    private static volatile FileUtils instance;
    //private cons
    private FileUtils() {

    }

    public static FileUtils getInstance(){
        if(instance == null){
            synchronized (FileUtils.class){
                if(instance == null){
                    instance = new FileUtils();
                }
            }
        }
        return instance;
    }

    /// save file
    public void show(){
        System.out.println("Hello world");
    }
}
