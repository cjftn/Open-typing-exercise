import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class startmain {
	static int c;

	public static int startmain(char a[], char b[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				c++;

		}
		return c;
	}

	public static void main(String[] args) throws Exception {
		c = 0;
		System.out.println("�� ������ 0.1�Դϴ� ������: ��ö��(This version is 0.1 Developer: gim chul-Soo)");
		System.out.println("1. ���α׷��� ��� ����(Programming Language Practice)");
		System.out.println("2. �ѱ� ����(Practice Hangul)");
		System.out.println("3. ���� ����(English practice)");
		System.out.println("4. ���� ����� ����(Make it yourself)");
		System.out.println("5. �ڱⰡ ����� ���(Something made by oneself)");

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		switch (start) {
		case 1:
			System.out.println("1. ���ڿ�(String)");
			System.out.println("2. �ܾ�(word)");
			start = sc.nextInt();
			if (start == 1) {
				a1_1();
			} else if (start == 2) {
				a1_2();
			} else
				System.out.println("�߸��� ���� �Է��Ͽ� ���ϴ�.(Wrong value is entered.)");
			main(null);
			break;

		case 2:
			System.out.println("1. ���ڿ�(String)");
			System.out.println("2. �ܾ�(word)");
			start = sc.nextInt();
			if (start == 1) {
				// a4_0();
			} else if (start == 2) {
				// a4_1();
			} else
				System.out.println("�߸��� ���� �Է��Ͽ� ���ϴ�.(Wrong value is entered.)");
			main(null);
			break;

		case 3:
			System.out.println("1. ���ڿ�(String)");
			System.out.println("2. �ܾ�(word)");
			start = sc.nextInt();
			if (start == 1) {
				// a4_0();
			} else if (start == 2) {
				// a4_1();
			} else
				System.out.println("�߸��� ���� �Է��Ͽ� ���ϴ�.(Wrong value is entered.)");
			main(null);
			break;

		case 4:
			System.out.println("1. ���ڿ�(String)");
			System.out.println("2. �ܾ�(word)");
			start = sc.nextInt();
			if (start == 1) {
				a4_1();
			} else if (start == 2) {
				a4_2();
			} else
				System.out.println("�߸��� ���� �Է��Ͽ� ���ϴ�.(Wrong value is entered.)");
			main(null);
			break;

		case 5:
			System.out.println("1. ���ڿ�(String)");
			System.out.println("2. �ܾ�(word)");
			start = sc.nextInt();
			if (start == 1) {
				// a4_0();
			} else if (start == 2) {
				// a4_1();
			} else
				System.out.println("�߸��� ���� �Է��Ͽ� ���ϴ�.(Wrong value is entered.)");
			main(null);

			break;

		default:
			System.out.println("�߸��� ���� �Է��Ͽ� ���ϴ�.(Wrong value is entered.)");
			main(null);
			break;
		}
	}

	private static void a1_1() throws Exception {
		System.out.println("1. �ڹ� ���α׷��� ����(Java programming practice)");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		char st;
		switch (start) {
		case 1:
			String s = System.getProperty("user.dir");// ������ ��Ű�������� ���丮��θ� s������

			FileInputStream fis = new FileInputStream(s + "/src/startmain.java");
			BufferedInputStream bu = new BufferedInputStream(fis);
			// BufferedInputStream bi=new BufferedInputStream(bu);
			int data;
			while ((data = bu.read()) != -1) {
				System.out.write((char) bu.read());

				st = sc.next().charAt(0);
				while (st != (char) bu.read()) {
					System.out.println("��Ÿ �Դϴ�.");
					System.out.println((char) bu.read());
					st = sc.next().charAt(0);
				}
				// System.out.println(data);
				// st=sc.next();

			}

			bu.close();
			fis.close();
			main(null);
			break;

		default:
			System.out.println("�߸��� ���� �Է��Ͽ� ���ϴ�.(Wrong value is entered.)");
			main(null);
			break;
		}
	}

	private static void a1_2() throws Exception {
		Scanner sc = new Scanner(System.in);
		long num = 0;

		String[] sjava = { "byte", "char", "short", "int", "long", "float", "double", "boolean", "print()", "println()",
				"printf()", "switch()", "case", "default", "beak", "if()", "else", "while()", "static", "void", "null",
				"class", "public", "private", "Scanner()", "throws", "Exception", "else if()", "FileOutputStream()",
				"BufferedOutputStream()", "FileInputStream()", "BufferedInputStream()" };
		System.out.println("1. �ڹ����α׷��� ����(Java programming practice)");
		int start = sc.nextInt();
		String sss = "";
		switch (start) {
		case 1:
			System.out.println("���߰� �����ø�!�� �Է��ϼ���(If you want to stop, type\"!\")");
			while (sss != "!") {
				String ss = sjava[(int) (Math.random() * sjava.length) + 1];
				System.out.println(ss);
				try {
					sss = sc.next();
					System.out.println("��Ÿ��" + startmain(ss.toCharArray(), sss.toCharArray()));
					c = 0;
				} catch (Exception e) {
					System.out.println(e);
					continue;
				}
			}
			main(null);
			break;

		default:
			System.out.println("�߸��� ���� �Է��Ͽ� ���ϴ�.(Wrong value is entered.)");
			main(null);
			break;
		}

	}

	private static void a2_1() {

	}

	private static void a2_2() {

	}

	private static void a3_1() {

	}

	private static void a3_2() {

	}

	private static void a4_1() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸��� ����� �ּ���.(Please give me the file name.)");
		String name = sc.next();
		System.out.println("�ڱⰡ �����ϰ� ���� ���ڿ��� ���弼��(Create a string that you want to practice)");
		String s = sc.next();

		FileOutputStream fos = new FileOutputStream(name + ".txt");
		BufferedOutputStream bu = new BufferedOutputStream(fos);
		Writer wr = new OutputStreamWriter(bu);
		wr.write(s);
		wr.flush();
		wr.close();
		fos.close();
		bu.flush();
		bu.close();
		System.out.println("���� ������ �������ϴ�.");
		main(null);
	}

	private static void a4_2() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸��� ����� �ּ���.(Please give me the file name.)");
		String name = sc.next();
		System.out.println("�ڱⰡ �����ϰ� ���� �ܾ� ���弼��(Create a word that you want to practice)");
		System.out.println("���߰� �����ø�!�� �Է��ϼ���(If you want to stop, type\"!\")");
		String s = "";
		String ss[] = null;
		int li = 0;
		while (s != "!") {
			s = sc.next();
			ss[li] = s;
			li++;
		}

		FileOutputStream fos = new FileOutputStream(name + "li.txt");
		BufferedOutputStream bu = new BufferedOutputStream(fos);
		Writer wr = new OutputStreamWriter(bu);
		wr.write(s);
		wr.flush();
		wr.close();
		fos.close();
		bu.flush();
		bu.close();
		System.out.println("���� ������ �������ϴ�.");
		main(null);

	}

	private static void a5_1() {

	}

	private static void a5_2() {

	}
}
