package Question5;

public class Camera {
    private Camera() {};
    private static Camera camera1;
    private static Object obj = new Object();

    public static Camera getInstance() {
        if (camera1 == null) {
            synchronized (obj) {
                if (camera1 == null) {
                    camera1 = new Camera();
                }
            }
        }
        return camera1;
    }

    public void photo() {
        System.out.println("Camera photos.");
    }
}
