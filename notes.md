# NOTES – TUẦN 4: KIỂM THỬ ỨNG DỤNG DI ĐỘNG BẰNG APPIUM VÀ JAVA

## 1. Kiến thức đã học

Qua bài thực hành tuần 4, em đã tìm hiểu và thực hiện được những nội dung sau:

- **Java:** Sử dụng Java để viết mã kiểm thử tự động cho ứng dụng Android.
- **Appium:** Sử dụng Appium để điều khiển ứng dụng di động thông qua mã nguồn Java.
- **Android Emulator:** Sử dụng máy ảo Android để chạy ứng dụng và thực hiện kiểm thử.
- **UiAutomator2:** Sử dụng driver UiAutomator2 để tự động hóa kiểm thử trên Android.
- **TestNG:** Sử dụng TestNG để tổ chức và thực thi các bài kiểm thử.
- **Gradle:** Sử dụng Gradle để quản lý thư viện, biên dịch và chạy chương trình kiểm thử.
- **Smoke Test:** Kiểm tra nhanh những chức năng cơ bản nhằm xác nhận ứng dụng có thể khởi chạy và các thành phần quan trọng có thể hiển thị.

## 2. Quy trình thực hiện

1. Cài đặt và cấu hình Java JDK 17.
2. Cài đặt Appium Server và driver UiAutomator2.
3. Khởi động máy ảo Android bằng Android Studio.
4. Kiểm tra ứng dụng Swag Labs đã được cài đặt trên máy ảo.
5. Khởi động Appium Server.
6. Viết mã kiểm thử bằng Java trong file `SmokeTest.java`.
7. Sử dụng Gradle để chạy bài kiểm thử.
8. Kiểm tra kết quả thực thi và xác nhận bài kiểm thử thành công.

## 3. Kết quả thực hiện

Bài kiểm thử Smoke Test đã chạy thành công trên máy ảo Android.

Các kết quả đã xác nhận:

- Kết nối thành công với Appium Server.
- Khởi chạy được ứng dụng Swag Labs.
- Tìm thấy ô Username trên màn hình đăng nhập.
- Xác nhận ô Username đang hiển thị.
- Gradle hoàn thành quá trình kiểm thử với kết quả `BUILD SUCCESSFUL`.

## 4. Một số vấn đề gặp phải và cách giải quyết

### 4.1. Không nhận diện được lệnh ADB

**Nguyên nhân:** Đường dẫn `platform-tools` của Android SDK chưa được thêm vào biến môi trường PATH của cửa sổ PowerShell đang sử dụng.

**Cách giải quyết:** Gọi ADB bằng đường dẫn đầy đủ hoặc bổ sung thư mục `platform-tools` vào PATH.

### 4.2. Appium không kết nối được với Android SDK

**Nguyên nhân:** Cửa sổ chạy Appium Server chưa có các biến môi trường cần thiết.

**Cách giải quyết:** Thiết lập `JAVA_HOME`, `ANDROID_HOME`, `ANDROID_SDK_ROOT` và PATH trước khi khởi động Appium Server.

### 4.3. Gradle không thực thi bài kiểm thử

**Nguyên nhân:** Cần kiểm tra file Java có nội dung, được lưu đúng vị trí và có tên phù hợp với cấu hình dự án hay không.

**Cách giải quyết:** Kiểm tra file `SmokeTest.java`, cấu trúc thư mục kiểm thử và cấu hình `build.gradle`, sau đó chạy lại lệnh Gradle.

## 5. Câu hỏi ôn tập

### Câu 1. Appium là gì?

Appium là công cụ mã nguồn mở hỗ trợ tự động hóa kiểm thử ứng dụng di động. Công cụ cho phép sử dụng mã nguồn để tương tác với ứng dụng trên các thiết bị thật hoặc máy ảo.

### Câu 2. Vì sao cần sử dụng Android Emulator?

Android Emulator mô phỏng thiết bị Android trên máy tính, giúp chạy ứng dụng và thực hiện kiểm thử mà không nhất thiết phải có điện thoại thật.

### Câu 3. Vai trò của UiAutomator2 là gì?

UiAutomator2 là driver được sử dụng trong dự án để Appium tự động hóa và tương tác với ứng dụng Android.

### Câu 4. Smoke Test là gì?

Smoke Test là một nhóm kiểm thử cơ bản nhằm xác nhận những chức năng chính có thể hoạt động ở mức ban đầu trước khi thực hiện các kiểm thử chi tiết hơn.

### Câu 5. Vì sao cần sử dụng assertion trong kiểm thử?

Assertion dùng để so sánh kết quả thực tế với kết quả mong đợi. Nếu điều kiện kiểm tra không thỏa mãn, bài kiểm thử sẽ báo thất bại thay vì chỉ chạy mà không xác nhận kết quả.

### Câu 6. Vai trò của Gradle và TestNG là gì?

Gradle hỗ trợ quản lý thư viện, biên dịch và thực thi dự án. TestNG hỗ trợ tổ chức các test case, chạy kiểm thử và ghi nhận kết quả như thành công hoặc thất bại.

## 6. Ghi nhận việc sử dụng AI

Em sử dụng AI để hỗ trợ giải thích lỗi cấu hình môi trường, hướng dẫn thiết lập Appium, xây dựng mã kiểm thử Java và hoàn thiện tài liệu dự án.

Các nội dung do AI đề xuất được đối chiếu bằng cách chạy chương trình thực tế. Qua đó, em hiểu rõ hơn quy trình kết nối Appium với Android Emulator, cách viết assertion và cách đọc kết quả kiểm thử.

## 7. Bài học rút ra

Qua bài thực hành, em hiểu rằng kiểm thử tự động không chỉ là viết mã để mở ứng dụng mà còn cần xác định kết quả mong đợi, kiểm tra kết quả thực tế và ghi nhận bằng chứng. Việc cấu hình đúng môi trường Java, Android SDK và Appium là điều kiện quan trọng để bài kiểm thử hoạt động ổn định.