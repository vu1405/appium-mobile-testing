# Ghi chú tuần 04 – Nhóm App

## 1. Các thành phần của Appium

- **Appium Client:** Thư viện được sử dụng trong chương trình kiểm thử Python để gửi các lệnh điều khiển.
- **Appium Server:** Chạy trên máy tính, tiếp nhận yêu cầu từ Appium Client.
- **UiAutomator2 Driver:** Driver được Appium Server sử dụng để điều khiển ứng dụng Android.

Luồng hoạt động:

Python Test → Appium Client → Appium Server → UiAutomator2 Driver → Android Emulator → Swag Labs.

## 2. Android Emulator và AVD

AVD là cấu hình thiết bị Android ảo được tạo trong Android Studio. Emulator cho phép chạy thiết bị Android ảo trên máy tính.

Cấu hình sử dụng:
- Thiết bị: Pixel 3a
- Android API: 36
- Device ID dự kiến: `emulator-5554`

Có thể kiểm tra thiết bị bằng lệnh `adb devices`. Thiết bị cần có trạng thái `device` trước khi chạy bài kiểm thử.

## 3. Cài đặt ứng dụng APK

Sử dụng ADB để cài ứng dụng vào máy ảo:

`adb install "C:\Users\ADMIN\Downloads\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk"`

Thông tin ứng dụng:
- Package: `com.swaglabsmobileapp`
- Activity: `.SplashActivity`

## 4. Smoke Test

File `test_smoke.py` thực hiện các công việc:
1. Kết nối Python với Appium Server.
2. Mở ứng dụng Swag Labs trên Android Emulator.
3. Tìm ô Username bằng accessibility id `test-Username`.
4. Nhập username `standard_user`.
5. Đóng phiên kiểm thử.

Kết quả thực tế: Smoke test đã chạy thành công trên máy tính của em.

## 5. Trả lời câu hỏi phần đọc

**Appium Client, Appium Server và Driver chạy ở đâu?**

Appium Client chạy trong chương trình kiểm thử trên máy tính. Appium Server cũng chạy trên máy tính. UiAutomator2 Driver hoạt động bên trong Appium Server để giao tiếp với thiết bị Android.

**Làm thế nào để cài APK vào máy ảo?**

Sử dụng lệnh `adb install <đường_dẫn_file.apk>`, sau đó kiểm tra package để xác nhận ứng dụng đã được cài.

## 6. Điều em học được

Em đã thực hành kết nối Python với Appium, khởi động ứng dụng Android trên Emulator và tìm phần tử giao diện bằng accessibility id. Em cũng biết cần kiểm tra kết nối ADB khi Appium không tìm thấy thiết bị.

## 7. Việc sử dụng AI

Em đã hỏi AI cách xử lý lỗi Appium không tìm thấy Android device. Hướng dẫn giúp em kiểm tra trạng thái Emulator và ADB. Em đã tự chạy lại bài kiểm thử để xác nhận kết quả trên máy của mình.