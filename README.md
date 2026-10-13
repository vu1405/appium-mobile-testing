# Tuần 04 – Smoke Test với Appium

## Mục tiêu

Kiểm tra kết nối giữa Python, Appium Server, UiAutomator2 Driver, Android Emulator và ứng dụng Swag Labs.

## Yêu cầu môi trường

- Python 3.13
- Appium Server 3.8.0
- UiAutomator2 Driver 8.7.0
- Appium-Python-Client 6.0.7
- Android Studio và Android Emulator
- Ứng dụng Swag Labs Sample App 2.7.1

## Cách chạy

### 1. Khởi động Emulator

Mở Android Studio → Device Manager → khởi động máy ảo.

### 2. Khởi động Appium Server

Mở PowerShell và thiết lập biến môi trường:

```powershell
$env:JAVA_HOME="C:\Program Files\Java\jdk-17"
$env:ANDROID_HOME="C:\Users\ADMIN\AppData\Local\Android\Sdk"
$env:ANDROID_SDK_ROOT="C:\Users\ADMIN\AppData\Local\Android\Sdk"
$env:Path="$env:JAVA_HOME\bin;$env:ANDROID_HOME\platform-tools;$env:Path"
appium
```

Giữ cửa sổ Appium Server mở trong khi kiểm thử.

### 3. Kiểm tra thiết bị

Mở Terminal khác:

```powershell
adb devices
```

Xác nhận Emulator có trạng thái `device`.

### 4. Chạy Smoke Test

Tại thư mục `tuan-04`, chạy:

```powershell
py test_smoke.py
```

## Kết quả mong đợi

- Kết nối Appium và Emulator thành công.
- Mở ứng dụng Swag Labs.
- Tìm được ô Username.
- Nhập username `standard_user`.
- Đóng phiên kiểm thử thành công.