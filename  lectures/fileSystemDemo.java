
/**
 * fileSystemDemo
 */
// import java.io.File;
import java.util.logging.*;

// public class fileSystemDemo {
//     public static void main(String[] args) {
//         String pathProject = System.getProperty("user.dir");
//         String pathFile = pathProject.concat("/file.txt");
//         File f3 = new File(pathFile);
//         System.out.println(f3.getAbsolutePath());
//         // /Users/sk/vscode/java_projects/file.txt
//         // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
//     }
// }

// public class fileSystemDemo {
//     public static void main(String[] args) {
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File file = new File(pathFile);
//             if (file.createNewFile()) {
//                 System.out.println("file.created");
//             } else {
//                 System.out.println("file.existed");
//             }
//         } catch (Exception e) {
//             System.out.println("catch");
//         } finally {
//             System.out.println("finally");

//         }
//     }}

//     String line = "empty";try
//     {
//         File file = new File(pathFile);
//         if (file.createNewFile()) {
//             System.out.println("file.created");
//         } else {
//             BufferedReader bufReader = new BufferedReader(new FileReader(file));
//             System.out.println("file.existed");
//             line = bufReader.readLine();
//             bufReader.close();
//         }
//     }catch(
//     Exception e)
//     {
//         // e.printStackTrace();
//     }finally
//     {
//         System.out.println(line);
//     }

    // КАТАЛОГИ:=================================================
    // public class fileSystemDemo {
    //     public static void main(String[] args) {
    //         String pathProject = System.getProperty("user.dir");
    //         String pathDir = pathProject.concat("/files");
    //         File dir = new File(pathDir);
    //         System.out.println(dir.getAbsolutePath());
    //         if (dir.mkdir()) {
    //             System.out.println("+");
    //         } else {
    //             System.out.println("-");
    //         }
    //         for (String fname : dir.list()) {
    //             System.out.println(fname);
    //         }
    //     }
    // }

    // ЛОГИРОВАНИЕ:===============================================

    // public class fileSystemDemo {
    // public static void main(String[] args) {
    // Logger logger = Logger.getLogger(Ex0043.class.getName());
    // logger.setLevel(Level.INFO);
    // ConsoleHandler ch = new ConsoleHandler();
    // logger.addHandler(ch);
    // SimpleFormatter sFormat = new SimpleFormatter();
    // ch.setFormatter(sFormat);
    // logger.log(Level.WARNING, "Тестовое логирование");
    // logger.info("Тестовое логирование");

    // }
    // }

public class fileSystemDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(fileSystemDemo.class.getName());
       logger.setLevel(Level.INFO);
       ConsoleHandler ch = new ConsoleHandler();
       logger.addHandler(ch);
       //SimpleFormatter sFormat = new SimpleFormatter();
       XMLFormatter xml = new XMLFormatter();
       //ch.setFormatter(sFormat);
       ch.setFormatter(xml);
       logger.log(Level.WARNING, "Тестовое логирование");
       logger.info("Тестовое логирование");
       } 
    }
