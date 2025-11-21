Biến Java là một phần bộ nhớ có thể chứa giá trị dữ liệu. Do đó, biến có một kiểu dữ liệu. Các kiểu dữ liệu được trình bày chi tiết hơn trong phần về kiểu dữ liệu Java .

Biến thường được dùng để lưu trữ thông tin mà chương trình Java của bạn cần để thực hiện chức năng. Đây có thể là bất kỳ loại thông tin nào, từ văn bản, mã (ví dụ: mã quốc gia, mã tiền tệ, v.v.) đến số, kết quả tạm thời của các phép tính nhiều bước, v.v.

# Java Variable Types
## Non-static fields
Trường không tĩnh là một biến thuộc về một đối tượng. Đối tượng lưu giữ trạng thái nội bộ của chúng trong các trường không tĩnh. Trường không tĩnh còn được gọi là biến thể hiện, vì chúng thuộc về các thể hiện (đối tượng) của một lớp.

## Static fields
Trường tĩnh là một biến thuộc về một lớp. Trường tĩnh có cùng giá trị cho tất cả các đối tượng truy cập vào nó. Trường tĩnh cũng được gọi là biến lớp.

## Local Variables
Biến cục bộ là một biến được khai báo bên trong một phương thức. Biến cục bộ chỉ có thể được truy cập bên trong phương thức đã khai báo nó.

## Parameters
Tham số là một biến được truyền cho một phương thức khi phương thức đó được gọi. Các tham số cũng chỉ có thể được truy cập bên trong phương thức khai báo chúng, mặc dù giá trị được gán cho chúng khi phương thức được gọi.

# Java Data Types
Kiểu dữ liệu được chia thành 2 nhóm:
- Primitive data types
- Object references

Mỗi biến chiếm một lượng không gian nhất định trong bộ nhớ. Dung lượng bộ nhớ mà biến chiếm dụng phụ thuộc vào kiểu dữ liệu của nó.

Biến có kiểu dữ liệu nguyên thủy chứa giá trị của biến trực tiếp trong bộ nhớ được cấp phát cho biến đó. Ví dụ: một số hoặc một ký tự.

Biến thuộc kiểu tham chiếu đối tượng khác với biến thuộc kiểu nguyên thủy. Biến thuộc kiểu đối tượng cũng được gọi là tham chiếu . Bản thân biến không chứa đối tượng, nhưng chứa tham chiếu đến đối tượng. Tham chiếu này trỏ đến một vị trí khác trong bộ nhớ, nơi toàn bộ đối tượng được lưu trữ. Thông qua tham chiếu được lưu trữ trong biến, bạn có thể truy cập các trường và phương thức của đối tượng được tham chiếu. Có thể có nhiều biến khác nhau tham chiếu đến cùng một đối tượng. Điều này không thể thực hiện được với kiểu dữ liệu nguyên thủy.

## Primitive Data Types

| Data type | Description |
|-----------|-------------|
| boolean   |A binary value of either true or false|
| byte      |8 bit signed value, values from -128 to 127   |
| short     |16 bit signed value, values from -32.768 to 32.767|
| char      |16 bit Unicode character|
| int       |32 bit signed value, values from -2.147.483.648 to 2.147.483.647|
| long      |64 bit signed value, values from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.808|
| float     |32 bit floating point value|
| double    |64 bit floating point value|

Việc đây là các kiểu dữ liệu nguyên thủy có nghĩa là chúng không phải là đối tượng, cũng không phải là tham chiếu đến đối tượng.

## Object Types
Các kiểu dữ liệu nguyên thủy cũng có phiên bản là các đối tượng hoàn chỉnh. Điều này có nghĩa là bạn tham chiếu chúng thông qua một tham chiếu đối tượng, bạn có thể có nhiều tham chiếu đến cùng một giá trị và bạn có thể gọi các phương thức trên chúng như trên bất kỳ đối tượng nào khác trong Java. Danh sách các kiểu dữ liệu đối tượng cốt lõi bên dưới chứa các phiên bản đối tượng của các kiểu dữ liệu nguyên thủy. Danh sách này cũng chứa một số kiểu đối tượng cốt lõi khác trong Java.

| Data type | Description |
|-----------|-------------|
| Boolean   |A binary value of either true or false|
| Byte      |8 bit signed value, values from -128 to 127|
| Short     |16 bit signed value, values from -32.768 to 32.767|
| Character |16 bit Unicode character|
| Integer   |32 bit signed value, values from -2.147.483.648 to 2.147.483.647|
| Long      |64 bit signed value, values from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.808|
| Float     |32 bit floating point value|
| Double    |64 bit floating point value|
| String    |N byte Unicode string of textual data. Immutable|
