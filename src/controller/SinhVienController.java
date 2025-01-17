/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SinhVien;
import util.ConnectDB;

/**
 *
 * @author OS
 */
public class SinhVienController {

    public ArrayList<SinhVien> danhSachTatCaSinhVien() {
        ArrayList<SinhVien> lists = new ArrayList<SinhVien>();
        try {
            String sql = "SELECT masv, password, malop, hoten, ngaysinh, gioitinh, diachi, sdt, email FROM SINHVIEN";
            try (Connection con = ConnectDB.connectSQLServer(); Statement stm = con.createStatement();) {
                ResultSet rs = stm.executeQuery(sql);
//            lists.clear();
                while (rs.next()) {
                    SinhVien sv = new SinhVien();
                    sv.setMaSv(rs.getString(1));
                    sv.setPassword(rs.getString(2));
                    sv.setMaLop(rs.getString(3));
                    sv.setHoTen(rs.getString(4));
                    sv.setNgaySinh(rs.getString(5));
                    sv.setGioiTinh(rs.getBoolean(6));
                    sv.setDiaChi(rs.getString(7));
                    sv.setSoDienThoai(rs.getString(8));
                    sv.setEmail(rs.getString(9));
                    lists.add(sv);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lists;
    }

    public int insert(SinhVien sv) {
        int result = 0;

        try {
            String sql = "Insert into SinhVien values (?,?,?,?,?,?,?,?,?)";

            try (Connection con = ConnectDB.connectSQLServer(); PreparedStatement ps = con.prepareStatement(sql);) {
                ps.setString(1, sv.getMaSv());
                ps.setString(2, sv.getPassword());
                ps.setString(3, sv.getMaLop());
                ps.setString(4, sv.getHoTen());
                ps.setString(5, sv.getNgaySinh());
                ps.setBoolean(6, sv.getGioiTinh());
                ps.setString(7, sv.getDiaChi());
                ps.setString(8, sv.getSoDienThoai());
                ps.setString(9, sv.getEmail());
                result = ps.executeUpdate();
            }
        } catch (Exception ex) {

        }
        return result;
    }

    public int update(SinhVien sv) {
        int result = 0;
        try {
            String sql = "update SinhVien set Password=? , MaLop=? , hoten=?,ngaysinh=?,gioitinh=?,diachi=?,sdt=?,email=? where masv=?";
            try (Connection con = ConnectDB.connectSQLServer(); PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, sv.getPassword());
                ps.setString(2, sv.getMaLop());
                ps.setString(3, sv.getHoTen());
                ps.setString(4, sv.getNgaySinh());
                ps.setBoolean(5, sv.getGioiTinh());
                ps.setString(6, sv.getDiaChi());
                ps.setString(7, sv.getSoDienThoai());
                ps.setString(8, sv.getEmail());
                ps.setString(9, sv.getMaSv());
                result = ps.executeUpdate();
            } 
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public int updateNoPass(SinhVien sv) {
        int result = 0;
        try {
            String sql = "update SinhVien set  MaLop=? , hoten=?,ngaysinh=?,gioitinh=?,diachi=?,sdt=?,email=? where masv=?";
            try (Connection con = ConnectDB.connectSQLServer(); PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, sv.getMaLop());
                ps.setString(2, sv.getHoTen());
                ps.setString(3, sv.getNgaySinh());
                ps.setBoolean(4, sv.getGioiTinh());
                ps.setString(5, sv.getDiaChi());
                ps.setString(6, sv.getSoDienThoai());
                ps.setString(7, sv.getEmail());
                ps.setString(8, sv.getMaSv());
                result = ps.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int delete(String maSV) {
        int result = 0;
        try {

            String sql = "delete from sinhvien where masv=?";
            try (Connection con = ConnectDB.connectSQLServer(); PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, maSV);
                result = ps.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;

    }

    public ArrayList<SinhVien> SearchSvTheoTen(String tenSv) {
        ArrayList<SinhVien> list = new ArrayList<>();
         Boolean gt = null;
          if ("nam".equalsIgnoreCase(tenSv)) {
            gt = true;
        } else if ("nu".equalsIgnoreCase(tenSv)) {
            gt = false;
        }
            try {
              String sql = "Select * from sinhvien left join lop on sinhvien.MaLop = lop.MaLop  where hoten LIKE '%" + tenSv + "%' or maSV LIKE '%" + tenSv + "%' "
                      + "or SDT LIKE '%" + tenSv + "%'  or NgaySinh LIKE '%" + tenSv + "%'"
                      + " or DiaChi LIKE '%" + tenSv + "%'"
                      + " or Email LIKE '%" + tenSv + "%'" 
                        + " or Ten LIKE '%" + tenSv + "%'" ;
               if (gt != null) {
                sql += " OR gioitinh = "+ gt+"";
            }

            try (Connection con = ConnectDB.connectSQLServer(); PreparedStatement ps = con.prepareStatement(sql)) {
               
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    
                    SinhVien sv = new SinhVien();
                    sv.setMaSv(rs.getString(1));
                    sv.setPassword(rs.getString(2));
                    sv.setMaLop(rs.getString(3));
                    sv.setHoTen(rs.getString(4));
                    sv.setNgaySinh(rs.getString(5));
                    sv.setGioiTinh(rs.getBoolean(6));
                    sv.setDiaChi(rs.getString(7));
                    sv.setSoDienThoai(rs.getString(8));
                    sv.setEmail(rs.getString(9));
                    list.add(sv);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    
     public ArrayList<SinhVien> SearchSvTheoMa(String maSv) {
        ArrayList<SinhVien> list = new ArrayList<>();
        try {
              String sql = "Select * from sinhvien left join lop on sinhvien.MaLop = lop.MaLop where hoten LIKE '%" + maSv + "%' or maSV LIKE '%" + maSv + "%' "
                      + "or SDT LIKE '%" + maSv + "%'  or NgaySinh LIKE '%" + maSv + "%'"
                      + " or DiaChi LIKE '%" + maSv + "%'"
                    + " or Ten LIKE '%" + maSv + "%'"
                      + " or Email LIKE '%" + maSv + "%' ";    
            try (Connection con = ConnectDB.connectSQLServer(); PreparedStatement ps = con.prepareStatement(sql)) {
               
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    
                    SinhVien sv = new SinhVien();
                    sv.setMaSv(rs.getString(1));
                    sv.setPassword(rs.getString(2));
                    sv.setMaLop(rs.getString(3));
                    sv.setHoTen(rs.getString(4));
                    sv.setNgaySinh(rs.getString(5));
                    sv.setGioiTinh(rs.getBoolean(6));
                    sv.setDiaChi(rs.getString(7));
                    sv.setSoDienThoai(rs.getString(8));
                    sv.setEmail(rs.getString(9));
                    list.add(sv);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public SinhVien LoadSvTheoSdt(String soDienThoai) {
        SinhVien sv = new SinhVien();
        try {
            String sql = "SELECT * FROM SINHVIEN WHERE SDT = "+ soDienThoai +"";
            try (Connection con = ConnectDB.connectSQLServer(); Statement statement = con.createStatement()) {
                ResultSet rs = statement.executeQuery(sql);
                if(rs.next()) {
                    sv.setMaSv(rs.getString(1));
                    sv.setPassword(rs.getString(2));
                    sv.setMaLop(rs.getString(3));
                    sv.setHoTen(rs.getString(4));
                    sv.setNgaySinh(rs.getString(5));
                    sv.setGioiTinh(rs.getBoolean(6));
                    sv.setDiaChi(rs.getString(7));
                    sv.setSoDienThoai(rs.getString(8));
                    sv.setEmail(rs.getString(9));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sv;
    }
}
