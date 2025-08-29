/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.database;

import murach.business.User;

public class UserDB {
    public static int insert(User user) {
        // giả lập lưu dữ liệu vào DB
        System.out.println("Lưu user: " + user.getEmail());
        return 1;
    }
}
