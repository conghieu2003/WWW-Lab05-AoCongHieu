<<<<<<< HEAD
﻿BỘ CÔNG THƯƠNG
TRƯỜNG ĐẠI HỌC CÔNG NGHIỆP TP.HCM
      Khoa Công nghệ Thông tin
=======
BỘ CÔNG THƯƠNG
TRƯỜNG ĐẠI HỌC CÔNG NGHIỆP TP.HCM
Khoa Công nghệ Thông tin


![image](https://github.com/user-attachments/assets/53d5c199-67a9-4e29-b78d-e3abbf100ffc)
>>>>>>> 846f29358429da90dcac5377c13b9bd7a5e336c4




<<<<<<< HEAD




LẬP TRÌNH WWW JAVA
Đề tài: LAB WEEK 5




Sinh viên thực hiện	: Ao Công Hiếu
MSSV		: 21026511
Lớp			: DHKTPM17A




TP.Hồ Chí Minh, Ngày 15 tháng 12 năm 2024

I. Mở Đầu
Bài thực hành tuần 5 tập trung vào việc xây dựng một ứng dụng web sử dụng Spring Boot, hướng đến các chức năng quản lý tuyển dụng. Mục tiêu chính bao gồm thiết kế cơ sở dữ liệu, phát triển các tầng backend (entities, repositories, services), và xây dựng giao diện web thân thiện với người dùng. Ứng dụng cung cấp khả năng gợi ý công việc phù hợp cho ứng viên, hỗ trợ các công ty tìm kiếm ứng viên tiềm năng, và gửi email mời phỏng vấn. Đồng thời, bài thực hành cũng hướng dẫn cách phân trang dữ liệu với Java web, giúp nâng cao trải nghiệm người dùng khi làm việc với danh sách lớn
II. Phân tích yêu cầu![img.png](img.png)![img_1.png](img_1.png)
1. Yêu cầu chức năng
- Chức năng bắt buộc: đăng nhập/đăng xuất
- Company
• Quản lý công việc
Đăng tuyển dụng với các skill mong muốn
Cập nhật thông tin tuyển dụng
• Gửi email cho ứng viên phù hợp với công việc
• Xem danh sách công việc
• Xem chi tiết 1 công việc
• Tìm các ứng viên có skill phù hợp với công việc
- Candidate:
• Xem danh sách và chi tiết các công việc phù hợp với kỹ năng của bản thân
• Đề xuất skill cần học
• Xem chi tiết công việc
• Ứng tuyển bằng cách gửi email
2. Yêu cầu phi chức năng:
- Tính bảo mật cao.
- Yêu cầu về lưu trữ: dữ liệu được lưu trữ thông qua MariaDB.
- Tương thích với nhiều hệ điều hành phổ biến như Windows, MacOS, …
- Giao diện người dùng: giao diện ưa nhìn, phân mục chức năng thao tác rõ ràng; người dùng dễ dàng thao tác và sử dụng.
- Độ tin cậy cao, nếu người dùng gặp bất kỳ vấn đề nào cần phải được hỗ trợ ngay để tăng độ tin cậy người dùng.
3. Kiến trúc
- Sử dụng Thymeleaf kết hợp Bootstrap để xây dựng giao diện người dùng.
- Sử dụng Business Logic để xử lý nghiệp vụ
- Sử dụng DataAccess kết nối Data JPA với dữ liệu MariaDB
4. Mô hình cơ sở dữ liệu:

III. Yêu cầu của đề tài:
      1. Tạo các enities sao cho khi thực thi sẽ tạo ra các bảng như hình 
      2. Viết các repositories interface 
      3. Viết các lớp services 
      4. Tạo các trang web cho phép công ty đăng tin tuyển người với các skill mong 		muốn 
      5. Các ứng viên khi log vào sẽ được gợi ý các công việc có skill phù hợp với mình 
      6. Giúp các công ty tìm các ứng viên có skill phù hợp rồi gửi mail mời. 
      7. Đề xuất một số skill mà ứng viên chưa có để học.
      8. Một số yều cầu khác
IV. Thực thi
1. Cấu hình

2. Cấu trúc

3. Models

4. Repositories

5. Services

6. Resources

7. Chức năng cho công ty
7.1. Trang chủ
Đường dẫn chính: localhost:8080

7.2. Login với Company


7.3. Danh sách công việc đang tuyển của Công Ty

7.4. Đăng tuyển thêm công việc


7.5. Xem chi tiết công việc và ứng viên phù hợp 

7.6. Thêm kỹ năng cần tuyển


7.7. Danh sách ứng viên phù ứng tuyển

- Chọn ứng viên phù hợp và gửi email mời ứng tuyển

8. Đăng nhập với vai trò là candidate


8.1. Xem chi tiết công việc 

8.2. Xem hồ sơ kỹ năng tôi đang có 

8.3. Đề xuất kỹ năng cần cải thiện thêm

8.4. Chọn công việc phù hợp ứng tuyển

- Gửi email để xin Apply Job

9. Ưu điểm:
* Giao diện thân thiện, dễ sử dụng.
* Dễ dàng truy vấn thông tin.
* Thông tin của bài tuyển dụng rõ ràng.
* Gửi email mời ứng viên nhanh gọn và dễ dàng.
* Tìm kiếm ứng viên trong khu vực nhanh chóng.
10. Nhược điểm:
* Chưa có tính bảo mật cao.
* Một số chức năng chưa hoàn chỉnh, giao diện chưa bắt mắt
* Kiểm thử ứng dụng còn hạn chế.


Kết luận:
Lab này đã cung cấp các thông tin và chức năng cần thiết cho công ty và ứng viên. Bên cạnh đó, vẫn còn nhiều hạn chế về cấu trúc dữ liệu và tính bảo mật thông tin, cần cải tiến và hoàn thiện hơn để hệ thống có thể hoạt động hiệu quả và thích hợp với người dùng
=======


LẬP TRÌNH WWW JAVA
Đề tài: LAB WEEK 5
>>>>>>> 846f29358429da90dcac5377c13b9bd7a5e336c4




Sinh viên thực hiện	: Ao Công Hiếu
MSSV		: 21026511
Lớp			: DHKTPM17A




TP.Hồ Chí Minh, Ngày 15 tháng 12 năm 2024 
I.	Mở Đầu
Bài thực hành tuần 5 tập trung vào việc xây dựng một ứng dụng web sử dụng Spring Boot, hướng đến các chức năng quản lý tuyển dụng. Mục tiêu chính bao gồm thiết kế cơ sở dữ liệu, phát triển các tầng backend (models, repositories, services, resources), và xây dựng giao diện web thân thiện với người dùng. Ứng dụng cung cấp khả năng gợi ý công việc phù hợp cho ứng viên, hỗ trợ các công ty tìm kiếm ứng viên tiềm năng, và gửi email mời phỏng vấn. Đồng thời, bài thực hành cũng hướng dẫn cách phân trang dữ liệu với Java web, giúp nâng cao trải nghiệm người dùng khi làm việc với danh sách lớn
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
 ![image](https://github.com/user-attachments/assets/efe6ad1e-2a2b-454d-b5a2-64743c2aff49)

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
 ![image](https://github.com/user-attachments/assets/c39d1a9e-318b-4be5-bb41-0b88539467a4)

2.	Cấu trúc
 ![image](https://github.com/user-attachments/assets/760e4672-0404-493f-b3fd-afac0b6453e2)

3.	Models
 ![image](https://github.com/user-attachments/assets/7cab0638-2f60-444f-a406-b9afd2756ba5)

4.	Repositories
 ![image](https://github.com/user-attachments/assets/5e51a226-ddda-4693-9286-e0da558f007e)

5.	Services
 ![image](https://github.com/user-attachments/assets/7fa98605-bd8a-4061-b311-39ada26baa74)

6.	Resources
 ![image](https://github.com/user-attachments/assets/0ac7b7a9-6e9a-4eb6-8122-d4767bcdf60a)

7.	Chức năng cho công ty
7.1.	Trang chủ
Đường dẫn chính: localhost:8080
 ![image](https://github.com/user-attachments/assets/40fc21ab-46f0-41f0-a442-240ebb7b5123)

7.2.	Login với Company
 ![image](https://github.com/user-attachments/assets/bfef2eae-a2b1-4559-9e5d-d07e7817b202)
![image](https://github.com/user-attachments/assets/5a21094f-8028-470c-8dda-35dadeb17f85)

 
7.3.	Danh sách công việc đang tuyển của Công Ty
![image](https://github.com/user-attachments/assets/f178e5f7-aadf-4042-bc56-93f63abdbbef)


7.4.	Đăng tuyển thêm công việc
 ![image](https://github.com/user-attachments/assets/fa18acef-5db2-4d22-a554-b41aa2aeb69f)
![Uploading image.png…]()


 
7.5.	Xem chi tiết công việc và ứng viên phù hợp 
 ![image](https://github.com/user-attachments/assets/3fa7f20d-e7b4-401b-9858-95e3ebbbf4e8)

7.6.	Thêm kỹ năng cần tuyển
 ![image](https://github.com/user-attachments/assets/30daec9b-055b-4c95-ac4b-08b59a2a651b)
![image](https://github.com/user-attachments/assets/e64f7491-c30a-4ecb-a31c-bbf492a69ad2)

 
7.7.	Danh sách ứng viên phù ứng tuyển
 ![image](https://github.com/user-attachments/assets/e9b44848-d9e3-45c9-b8e3-214bd194e1ac)

-	Chọn ứng viên phù hợp và gửi email mời ứng tuyển
 ![image](https://github.com/user-attachments/assets/71dc6f27-d02a-45eb-91a8-701d97c52f76)

8.	Đăng nhập với vai trò là candidate
 ![image](https://github.com/user-attachments/assets/54b8f23f-3d88-4f4a-b438-135c5dc83f34)

 ![image](https://github.com/user-attachments/assets/49a67cd9-cf1e-43c6-acaf-201bce1d3fe1)

8.1.	Xem chi tiết công việc 
 ![image](https://github.com/user-attachments/assets/35b69d74-9879-47d6-84f4-991c4f0fe1e8)

8.2.	Xem hồ sơ kỹ năng tôi đang có 
 ![image](https://github.com/user-attachments/assets/dfec39b6-1eb7-4141-ab07-0b2aec51932b)

8.3.	Đề xuất kỹ năng cần cải thiện thêm
 ![image](https://github.com/user-attachments/assets/d20ce1a1-ced6-4cb1-a334-c895bcaeda16)

8.4.	Chọn công việc phù hợp ứng tuyển
 ![image](https://github.com/user-attachments/assets/72873c9f-6280-4370-a10b-cad74ea11811)

-	Gửi email để xin Apply Job
 ![image](https://github.com/user-attachments/assets/63daa070-61a9-47d8-b15a-b1c96968690e)

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

