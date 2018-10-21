package <missing>;

public class GlobalMembers
{
	public static String s1 = new String(new char[1000]);
	public static String s2 = new String(new char[1000]);
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[1000];
	public static int m;
	public static int n;
	public static void cal()
	{
		int i;
		int j;
		int len;
		if (m > n)
		{
			len = m;
		}
		 else
		 {
			 len = n;
		 }
		 int k = 0;
		 int s = 0;
		for (i = 0;i < len;i++)
		{

			s = (a[i] + b[i] + k) % 10;
			k = (a[i] + b[i] + k) / 10;
			c[i] = s;
		}
		c[i] = k;

	}
	public static int Main()
	{
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		m = s1.length();
		n = s2.length();
		int i;
		int j = 0;
		for (i = m - 1;i >= 0;i--)
		{
			a[j++] = s1.charAt(i) - '0';
		}
		j = 0;
		for (i = n - 1;i >= 0;i--)
		{
			b[j++] = s2.charAt(i) - '0';
		}
		cal();
		for (i = 999;i > 0;i--)
		{
			if (c[i] != 0)
			{
				break;
			}
		}
		for (;i >= 0;i--)
		{
			System.out.print(c[i]);
		}
		 System.out.print("\n");
		return 0;
	}

}

