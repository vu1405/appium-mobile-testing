# TUẦN 4 – KIỂM THỬ ỨNG DỤNG DI ĐỘNG BẰNG APPIUM VÀ JAVA

## 1. Giới thiệu dự án

Dự án thực hiện kiểm thử tự động ứng dụng di động Swag Labs bằng Java, Appium và TestNG trên máy ảo Android.

Mục tiêu là làm quen với quy trình kiểm thử ứng dụng di động, thiết lập kết nối giữa Appium và Android Emulator, đồng thời thực hiện một bài kiểm thử cơ bản (Smoke Test).

## 2. Công nghệ sử dụng

- Java JDK 17: Ngôn ngữ lập trình.
- Appium Server 3.8.0: Công cụ tự động hóa kiểm thử ứng dụng di động.
- Appium Java Client 9.3.0: Thư viện kết nối Java với Appium.
- TestNG 7.10.2: Framework tổ chức và thực thi các bài kiểm thử.
- Gradle 8.6: Công cụ quản lý thư viện và chạy dự án.
- Android Studio Emulator: Môi trường giả lập thiết bị Android.
- UiAutomator2: Công cụ tự động hóa kiểm thử trên Android.

## 3. Mục tiêu kiểm thử

Bài kiểm thử Smoke Test thực hiện các bước:

1. Kết nối Appium với máy ảo Android.
2. Khởi chạy ứng dụng Swag Labs.
3. Tìm kiếm ô nhập Username trên màn hình đăng nhập.
4. Kiểm tra ô Username có đang hiển thị hay không.

## 4. Cấu trúc dự án

```text
tuan-04/
├── README.md
├── notes.md
├── build.gradle
├── gradlew
├── gradlew.bat
├── settings.gradle
├── test_smoke.py
├── anh/
└── src/
    └── test/
        └── java/
            └── SmokeTest.java
```

## 5. Điều kiện cần thiết

Trước khi chạy kiểm thử, cần chuẩn bị:

- Cài đặt Java JDK 17.
- Cài đặt Node.js và Appium.
- Cài đặt driver UiAutomator2 cho Appium.
- Cài đặt Android Studio và khởi động máy ảo Android.
- Cài đặt ứng dụng Swag Labs trên máy ảo.
- Cấu hình các biến môi trường cần thiết cho Java và Android SDK.

## 6. Khởi động Appium Server

Mở một cửa sổ PowerShell riêng và chạy:

```powershell
$env:JAVA_HOME = "C:\Program Files\Java\jdk-17"
$env:ANDROID_HOME = "$env:LOCALAPPDATA\Android\Sdk"
$env:ANDROID_SDK_ROOT = "$env:LOCALAPPDATA\Android\Sdk"
$env:Path = "$env:JAVA_HOME\bin;$env:ANDROID_HOME\platform-tools;$env:Path"
appium
```

Giữ cửa sổ này mở trong suốt quá trình chạy kiểm thử.

## 7. Cách chạy kiểm thử

Mở một cửa sổ Terminal khác trong VS Code, tại thư mục dự án, sau đó chạy:

```powershell
.\gradlew.bat clean test
```

Gradle sẽ biên dịch mã nguồn, thực thi bài kiểm thử và xuất kết quả.

## 8. Kết quả kiểm thử

Kết quả mong đợi:

- Appium kết nối thành công với máy ảo Android.
- Ứng dụng Swag Labs được mở.
- Ô Username được tìm thấy và hiển thị trên màn hình.
- Bài kiểm thử hoàn thành mà không có lỗi.

Khi kiểm thử thành công, Gradle hiển thị `BUILD SUCCESSFUL`.

## 9. Ảnh minh chứng

Lưu ảnh chụp kết quả kiểm thử và màn hình ứng dụng vào thư mục `anh/`.

Các ảnh phải phản ánh kết quả chạy thực tế của chương trình.

## 10. Kết luận

Qua bài thực hành, đã làm quen với việc sử dụng Java, Appium, TestNG và Gradle để kiểm thử tự động ứng dụng Android. Bài Smoke Test giúp xác nhận khả năng kết nối giữa các công cụ và kiểm tra sự xuất hiện của thành phần Username trên màn hình đăng nhập.