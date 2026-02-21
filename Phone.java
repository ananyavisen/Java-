interface Phone {
    void makeCall();
    void sendSMS();
}
interface Camera {
    void takePhoto();
    void recordVideo();
}
class SmartPhone implements Phone, Camera {
    public void makeCall() {
        System.out.println("Making a phone call...");
    }

    public void sendSMS() {
        System.out.println("Sending an SMS...");
    }
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public void recordVideo() {
        System.out.println("Recording a video...");
    }
}
class PhoneFeatures {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.makeCall();
        sp.sendSMS();
        sp.takePhoto();
        sp.recordVideo();
    }
}
