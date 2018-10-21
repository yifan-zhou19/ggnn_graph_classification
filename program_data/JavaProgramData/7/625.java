package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[2000]);
	public static String sub = new String(new char[2000]);
	public static int[] b = new int[2000];
	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int l = a.length();
		int l_sub = sub.length();
		while (i < l)
		{
			for (j = 0;j < l_sub;j++)
			{
				if (a.charAt(i + j) == sub.charAt(j))
				{
					b[i]++;
				}
			}
			i++;
		}
		int k = 0;
		int count = 0;
		int w = 999;
		for (k = 0;k < 2000;k++)
		{
			if (b[k] == l_sub)
			{
				w = k;
				count++;
				break;
			}
		}
		String c = new String(new char[300]);
		c = new Scanner(System.in).nextLine();
		int q = 0;
		if (count != 0)
		{
		while (q < l)
		{
			if (q == w)
			{
				System.out.printf("%s",c);
				q += l_sub;
			}
			if (q != l)
			{
				System.out.printf("%c",a.charAt(q));
			}
			q++;
		}
		}
		else if (count == 0)
		{
			System.out.println(a);
		}
		return 0;
	}
}
