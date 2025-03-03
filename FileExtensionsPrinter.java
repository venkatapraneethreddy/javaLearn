package learnprogramming;

public class FileExtensionsPrinter {
    public static void main(String[] args) {
        String[] files = {"document.txt", "image.jpg", "video.mp4", "script.js", "archive.zip"};
        
        for (String file : files) {
            int dotIndex = file.lastIndexOf('.');
            if (dotIndex != -1 && dotIndex != file.length() - 1) {
                System.out.println("Extension: " + file.substring(dotIndex + 1));
            }
        }
    }
}

