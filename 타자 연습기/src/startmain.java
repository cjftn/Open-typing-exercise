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
		System.out.println("본 버전은 0.1입니다 개발자: 김철수(This version is 0.1 Developer: gim chul-Soo)");
		System.out.println("1. 프로그래밍 언어 연습(Programming Language Practice)");
		System.out.println("2. 한글 연습(Practice Hangul)");
		System.out.println("3. 영어 연습(English practice)");
		System.out.println("4. 직접 만들어 보기(Make it yourself)");
		System.out.println("5. 자기가 만든거 사용(Something made by oneself)");

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		switch (start) {
		case 1:
			System.out.println("1. 문자열(String)");
			System.out.println("2. 단어(word)");
			start = sc.nextInt();
			if (start == 1) {
				a1_1();
			} else if (start == 2) {
				a1_2();
			} else
				System.out.println("잘못된 값을 입력하여 씁니다.(Wrong value is entered.)");
			main(null);
			break;

		case 2:
			System.out.println("1. 문자열(String)");
			System.out.println("2. 단어(word)");
			start = sc.nextInt();
			if (start == 1) {
				// a4_0();
			} else if (start == 2) {
				// a4_1();
			} else
				System.out.println("잘못된 값을 입력하여 씁니다.(Wrong value is entered.)");
			main(null);
			break;

		case 3:
			System.out.println("1. 문자열(String)");
			System.out.println("2. 단어(word)");
			start = sc.nextInt();
			if (start == 1) {
				// a4_0();
			} else if (start == 2) {
				// a4_1();
			} else
				System.out.println("잘못된 값을 입력하여 씁니다.(Wrong value is entered.)");
			main(null);
			break;

		case 4:
			System.out.println("1. 문자열(String)");
			System.out.println("2. 단어(word)");
			start = sc.nextInt();
			if (start == 1) {
				a4_1();
			} else if (start == 2) {
				a4_2();
			} else
				System.out.println("잘못된 값을 입력하여 씁니다.(Wrong value is entered.)");
			main(null);
			break;

		case 5:
			System.out.println("1. 문자열(String)");
			System.out.println("2. 단어(word)");
			start = sc.nextInt();
			if (start == 1) {
				// a4_0();
			} else if (start == 2) {
				// a4_1();
			} else
				System.out.println("잘못된 값을 입력하여 씁니다.(Wrong value is entered.)");
			main(null);

			break;

		default:
			System.out.println("잘못된 값을 입력하여 씁니다.(Wrong value is entered.)");
			main(null);
			break;
		}
	}

	private static void a1_1() throws Exception {
		System.out.println("1. 자바 프로그래밍 연습(Java programming practice)");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		char st;
		switch (start) {
		case 1:
			String s = System.getProperty("user.dir");// 현제의 패키지까지의 디렉토리경로를 s에저장

			FileInputStream fis = new FileInputStream(s + "/src/startmain.java");
			BufferedInputStream bu = new BufferedInputStream(fis);
			// BufferedInputStream bi=new BufferedInputStream(bu);
			int data;
			while ((data = bu.read()) != -1) {
				System.out.write((char) bu.read());

				st = sc.next().charAt(0);
				while (st != (char) bu.read()) {
					System.out.println("오타 입니다.");
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
			System.out.println("잘못된 값을 입력하여 씁니다.(Wrong value is entered.)");
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
		System.out.println("1. 자바프로그래밍 연습(Java programming practice)");
		int start = sc.nextInt();
		String sss = "";
		switch (start) {
		case 1:
			System.out.println("멈추고 싶으시면!를 입력하세요(If you want to stop, type\"!\")");
			while (sss != "!") {
				String ss = sjava[(int) (Math.random() * sjava.length) + 1];
				System.out.println(ss);
				try {
					sss = sc.next();
					System.out.println("오타수" + startmain(ss.toCharArray(), sss.toCharArray()));
					c = 0;
				} catch (Exception e) {
					System.out.println(e);
					continue;
				}
			}
			main(null);
			break;

		default:
			System.out.println("잘못된 값을 입력하여 씁니다.(Wrong value is entered.)");
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
		System.out.println("파일 이름을 만들어 주세요.(Please give me the file name.)");
		String name = sc.next();
		System.out.println("자기가 연습하고 싶은 문자열을 만드세요(Create a string that you want to practice)");
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
		System.out.println("파일 정장이 끝났습니다.");
		main(null);
	}

	private static void a4_2() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 이름을 만들어 주세요.(Please give me the file name.)");
		String name = sc.next();
		System.out.println("자기가 연습하고 싶은 단어 만드세요(Create a word that you want to practice)");
		System.out.println("멈추고 싶으시면!를 입력하세요(If you want to stop, type\"!\")");
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
		System.out.println("파일 정장이 끝났습니다.");
		main(null);

	}

	private static void a5_1() {

	}

	private static void a5_2() {

	}
}
