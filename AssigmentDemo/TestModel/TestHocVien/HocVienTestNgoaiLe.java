package TestHocVien;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
//import org.junit.Rule;
//import org.junit.rules.ExpectedException;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Model.HocVien;

public class HocVienTestNgoaiLe {
	HocVien hocvien;
	@Before
	public void setup() throws Exception{
		hocvien = new HocVien();
	}
	
	@After
	public void tearDown() throws Exception{
		hocvien = null;
	}
	
	@Rule
	public ExpectedException exception=ExpectedException.none();

	@Test
	public void testMahv() {
		 exception.expect(IllegalArgumentException.class);
		 int mahv = 15;
		 hocvien.setMahv(mahv);
		 int kivong = 15;
		 assertEquals(kivong, hocvien.getMahv());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMahv1() {
		String mahv=null;
		hocvien.setMahv(Integer.parseInt(mahv));
		String kivong=null;
		assertEquals(kivong, hocvien.getMahv());
	}
	@Test
	public void testMahv2() {
		try {
			int mahv=-1;
			hocvien.setMahv(mahv);
			int kivong=-1;
			assertEquals(kivong, hocvien.getMahv());
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	/// test ma nguoi hoc
	
	@Rule
	public ExpectedException exception1 =ExpectedException.none();

	@Test
	public void testManh() {
		 exception1.expect(IllegalArgumentException.class);
		 String manh = "Pham Truong";
		 hocvien.setManh(manh);
		 String kivong = "Pham Truong";
		 assertEquals(kivong, hocvien.getManh());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testManh1() {
		String manh ="PH123*&";
		hocvien.setManh(manh);
		String kivong="PH123*&";
		assertEquals(kivong, hocvien.getManh());
	}
	@Test
	public void testManh2() {
		try {
			String manh =null;
			hocvien.setManh(manh);
			String kivong=null;
			assertEquals(kivong, hocvien.getManh());
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
