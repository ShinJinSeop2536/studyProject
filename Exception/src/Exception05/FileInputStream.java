package Exception05;

public class FileInputStream implements AutoCloseable {
	private String file;

	public FileInputStream(String file) {
		// TODO Auto-generated constructor stub
		this.file = file;
	}

	public void read() {
		System.out.println(file+"을 읽었습니다");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(file+"을 닫습니다.");

	}
}
