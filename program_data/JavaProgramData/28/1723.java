package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[3000]);
		int[] b = new int[300];
		int[] c = new int[300];
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		l = a.length();
		b[0] = -1;
		m = 1;
		n = 0;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
			{
				b[m] = i;
				c[n] = c[n] + b[m] - b[m - 1] - 1;
				m++;
				n++;
			}
			if (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')
			{
				c[n]--;
			}
		}
		b[m] = l;
		c[n] = c[n] + b[m] - b[m - 1] - 1;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d,",c[i]);
		}
		System.out.printf("%d",c[n]);
		return 0;
	}
}
