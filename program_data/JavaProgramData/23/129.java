package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d = 0;
		int e = 0;
		int g;
		int f;
		int m;
		int n = 0;
		int[] t = new int[50];
		String s = new String(new char[101]);
		char[][] p = new char[50][101];
		char q;
		s = new Scanner(System.in).nextLine();
		a = 0;
		c = s.length();
		for (b = 0;b < c;b++)
		{
			if (s.charAt(b) == ' ')
			{
			t[a] = d;
			a++;
			d = 0;
			}
		else
		{
			p[a][d] = s.charAt(b);
			d++;
		}
		}
		t[a] = d;
		for (f = a;f > 0;f--)
		{
			for (g = 0;g < t[f];g++)
			{
			System.out.printf("%c",p[f][g]);
			}
		System.out.print(" ");
		}
		for (g = 0;g < t[f];g++)
		{
			System.out.printf("%c",p[0][g]);
		}
	}

}
