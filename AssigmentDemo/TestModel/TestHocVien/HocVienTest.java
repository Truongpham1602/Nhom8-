package TestHocVien;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Model.HocVien;

@Generated(value = "org.junit-tools-1.1.0")
public class HocVienTest {

	HocVien hocVien;
	
	@Before
	public void setUp() throws Exception {
		hocVien = new HocVien();
	}

	@After
	public void tearDown() throws Exception {
		hocVien = null;
	}

	
	@Test
	public void testSetMahv() throws Exception {
		int mahv = 15;
		hocVien.setMahv(mahv);
		int kivong = 15;
		assertEquals(kivong, hocVien.getMahv());
	}

	@Test
	public void testSetManh() throws Exception {
		String manh = "PH15225";
		hocVien.setManh(manh);
		String kivong = "PH15225";
		assertEquals(kivong, hocVien.getManh());
	}

	@Test
	public void testSetHoten() throws Exception {
		String hoten = "Pham Van Truong";
		hocVien.setHoten(hoten);
		String kivong = "Pham Van Truong";
		assertEquals(kivong, hocVien.getHoten());
		
	}

	@Test
	public void testSetDiem() throws Exception {
		double diem = 8;
		hocVien.setDiem(diem);
		double kivong = 8;
		assertEquals(kivong, hocVien.getDiem());
		
	}
}