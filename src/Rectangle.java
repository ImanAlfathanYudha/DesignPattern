public class Rectangle implements Shape {
	public int sisi;
	public int luas;
	public int keliling;
	
	public Rectangle(int sisi) {
		super();
		this.sisi = sisi;
		this.luas = luas;
		this.keliling = keliling;
	}

	public int getKeliling() {
		return keliling;
	}

	public void setKeliling(int keliling) {
		this.keliling = Keliling(sisi);
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

	@Override
	public int Luas(int sisi) {
		// TODO Auto-generated method stub
		return sisi*(sisi+2);
	}

	public int getSisi() {
		return sisi;
	}

	public void setSisi(int sisi) {
		this.sisi = sisi;
	}
	
	public int getLuas() {
		return luas;
	}

	public void setLuas(int luas) {
		this.luas = Luas(sisi);
	}

	@Override
	public int Keliling(int sisi) {
		// TODO Auto-generated method stub
		return (sisi*2)+((sisi+2)*2);
	}
}