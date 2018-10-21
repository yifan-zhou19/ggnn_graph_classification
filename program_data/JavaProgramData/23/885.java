package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[10][10];
		String b = new String(new char[100]);
		String f = new String(new char[10]);
		String g = new String(new char[10]);
		String h = new String(new char[10]);
		String v = new String(new char[10]);
		int i;
		int j;
		int l;
		int[] c = new int[100];
		int m;
		int n;
		int e;
		int d;
		int k;
		b = new Scanner(System.in).nextLine();
		l = b.length();
			j = 1;
		c[0] = -1;
		for (i = 0;i < l;i++)
		{
			if (b.charAt(i) == 32)
			{
				c[j] = i;
				j++;
			}
		}
		c[j] = l;

		for (n = j;n > 0;n--)
		{
			e = c[n] - 1;
			k = c[n - 1] + 1;
			for (m = k;m <= e;m++)
			{
				System.out.printf("%c",b.charAt(m));
			}
			if (n > 1)
			{
				System.out.print(" ");
			}
			else
			{
			}
		}
	}
}
