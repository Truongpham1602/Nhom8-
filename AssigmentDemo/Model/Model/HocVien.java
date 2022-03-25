/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DELL
 */
public class HocVien {
    private int mahv;
    private String manh;
    private String hoten;
    private double diem;

    public HocVien() {
    	super();
    }

    public HocVien(int mahv, String manh, String hoten, double diem) {
		super();
		this.mahv = mahv;
		this.manh = manh;
		this.hoten = hoten;
		this.diem = diem;
	}

	public int getMahv() {
        return mahv;
    }

    public void setMahv(int mahv) {
    	this.mahv = mahv;
    	if(String.valueOf(mahv) == null) {
    		throw new IllegalArgumentException("Invalid" + mahv);
    	}else if (String.valueOf(mahv).length() < 3) {
    		throw new IllegalArgumentException("Invalid" + mahv);
		}else if (!String.valueOf(mahv).matches("^[A-Za-z0-9]{3,50}$")) {
    		throw new IllegalArgumentException("Invalid" + mahv);
		}
    }

    public String getManh() {
        return manh;
    }

    public void setManh(String manh) {
        this.manh = manh;
        if(manh == null) {
    		throw new IllegalArgumentException("Invalid" + manh);
    	}else if (manh.length() < 3) {
    		throw new IllegalArgumentException("Invalid" + manh);
		}else if (!manh.matches("^[A-Za-z0-9]{3,50}$")) {
    		throw new IllegalArgumentException("Invalid" + manh);
		}
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
        if(hoten == null) {
        	throw new IllegalArgumentException("Invalid" + hoten);
        }else if (hoten.length() < 3) {
    		throw new IllegalArgumentException("Họ tên học lớn hơn 3 ký tự");
		}else if (!hoten.matches("^[a-z Ạ-ỹ A-Z]$") ) {
			throw new IllegalArgumentException("Họ Tên học phai la chu ");
		}
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
    	this.diem = diem;
    	if(Double.valueOf(diem) == null) {
    		throw new IllegalArgumentException("Invalid" + diem);
    	}else if(Double.valueOf(diem) < 0 || Double.valueOf(diem) > 10) {
    		throw new IllegalArgumentException("Invalid" + diem);
    	}else if(!String.valueOf(diem).matches("^[0-9]+$")) {
	    	throw new IllegalArgumentException("Invalid" + diem);
	    }
    }
    
}
