package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zifu = new char[2][100];
		zifu[0] = new Scanner(System.in).nextLine();
		int t;
		t = String.valueOf(zifu[0]).length();
		int i;
		int j;
		for (i = 0;i < t - 1;i++)
		{
			char c;
			char a;
			char b;
			a = zifu[0][i];
			b = zifu[0][i + 1];
			c = a + b;
			System.out.printf("%c",c);
		}
		char c;
		char a;
		char b;
		a = zifu[0][0];
		b = zifu[0][t - 1];
		c = zifu[0][0] + zifu[0][t - 1];
		System.out.printf("%c",c);



		return 0;

	}

}
