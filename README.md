BỘ CÔNG THƯƠNG
TRƯỜNG ĐẠI HỌC CÔNG NGHIỆP TP.HCM
Khoa Công nghệ Thông tin









LẬP TRÌNH WWW JAVA
Đề tài: LAB WEEK 5




Sinh viên thực hiện	: Ao Công Hiếu
MSSV		: 21026511
Lớp			: DHKTPM17A




TP.Hồ Chí Minh, Ngày 15 tháng 12 năm 2024 
I.	Mở Đầu
Bài thực hành tuần 5 tập trung vào việc xây dựng một ứng dụng web sử dụng Spring Boot, hướng đến các chức năng quản lý tuyển dụng. Mục tiêu chính bao gồm thiết kế cơ sở dữ liệu, phát triển các tầng backend (entities, repositories, services), và xây dựng giao diện web thân thiện với người dùng. Ứng dụng cung cấp khả năng gợi ý công việc phù hợp cho ứng viên, hỗ trợ các công ty tìm kiếm ứng viên tiềm năng, và gửi email mời phỏng vấn. Đồng thời, bài thực hành cũng hướng dẫn cách phân trang dữ liệu với Java web, giúp nâng cao trải nghiệm người dùng khi làm việc với danh sách lớn
II.	Phân tích yêu cầu
1.	Yêu cầu chức năng
-	Chức năng bắt buộc: đăng nhập/đăng xuất
-	Company
•	Quản lý công việc
Đăng tuyển dụng với các skill mong muốn
Cập nhật thông tin tuyển dụng
•	Gửi email cho ứng viên phù hợp với công việc
•	Xem danh sách công việc
•	Xem chi tiết 1 công việc
•	Tìm các ứng viên có skill phù hợp với công việc
-	Candidate:
•	Xem danh sách và chi tiết các công việc phù hợp với kỹ năng của bản thân
•	Đề xuất skill cần học
•	Xem chi tiết công việc
•	Ứng tuyển bằng cách gửi email
2.	Yêu cầu phi chức năng:
-	Tính bảo mật cao.
-	Yêu cầu về lưu trữ: dữ liệu được lưu trữ thông qua MariaDB.
-	Tương thích với nhiều hệ điều hành phổ biến như Windows, MacOS, …
-	Giao diện người dùng: giao diện ưa nhìn, phân mục chức năng thao tác rõ ràng; người dùng dễ dàng thao tác và sử dụng.
-	Độ tin cậy cao, nếu người dùng gặp bất kỳ vấn đề nào cần phải được hỗ trợ ngay để tăng độ tin cậy người dùng.
3.	Kiến trúc
-	Sử dụng Thymeleaf kết hợp Bootstrap để xây dựng giao diện người dùng.
-	Sử dụng Business Logic để xử lý nghiệp vụ
-	Sử dụng DataAccess kết nối Data JPA với dữ liệu MariaDB
4.	Mô hình cơ sở dữ liệu:
 
III.	Yêu cầu của đề tài:
1. Tạo các enities sao cho khi thực thi sẽ tạo ra các bảng như hình 
2. Viết các repositories interface 
3. Viết các lớp services 
4. Tạo các trang web cho phép công ty đăng tin tuyển người với các skill mong 		muốn 
5. Các ứng viên khi log vào sẽ được gợi ý các công việc có skill phù hợp với mình 
6. Giúp các công ty tìm các ứng viên có skill phù hợp rồi gửi mail mời. 
7. Đề xuất một số skill mà ứng viên chưa có để học.
8. Một số yều cầu khác
IV.	Thực thi
1.	Cấu hình
 
2.	Cấu trúc
 
3.	Models
 
4.	Repositories
 
5.	Services
 
6.	Resources
 
7.	Chức năng cho công ty
7.1.	Trang chủ
Đường dẫn chính: localhost:8080
 
7.2.	Login với Company
 
 
7.3.	Danh sách công việc đang tuyển của Công Ty
 
7.4.	Đăng tuyển thêm công việc
 
 
7.5.	Xem chi tiết công việc và ứng viên phù hợp 
 
7.6.	Thêm kỹ năng cần tuyển
 
 
7.7.	Danh sách ứng viên phù ứng tuyển
 
-	Chọn ứng viên phù hợp và gửi email mời ứng tuyển
 
8.	Đăng nhập với vai trò là candidate
 
 
8.1.	Xem chi tiết công việc 
 
8.2.	Xem hồ sơ kỹ năng tôi đang có 
 
8.3.	Đề xuất kỹ năng cần cải thiện thêm
 
8.4.	Chọn công việc phù hợp ứng tuyển
 
-	Gửi email để xin Apply Job
 
9.	Ưu điểm:
	Giao diện thân thiện, dễ sử dụng.
	Dễ dàng truy vấn thông tin.
	Thông tin của bài tuyển dụng rõ ràng.
	Gửi email mời ứng viên nhanh gọn và dễ dàng.
	Tìm kiếm ứng viên trong khu vực nhanh chóng.
10.	Nhược điểm:
	Chưa có tính bảo mật cao.
	Một số chức năng chưa hoàn chỉnh, giao diện chưa bắt mắt
	Kiểm thử ứng dụng còn hạn chế.


Kết luận:
Lab này đã cung cấp các thông tin và chức năng cần thiết cho công ty và ứng viên. Bên cạnh đó, vẫn còn nhiều hạn chế về cấu trúc dữ liệu và tính bảo mật thông tin, cần cải tiến và hoàn thiện hơn để hệ thống có thể hoạt động hiệu quả và thích hợp với người dùng

