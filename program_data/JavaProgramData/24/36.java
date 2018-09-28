package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int c = -1;
		int max = 1;
		int min = 10;
		int j;
		String a = new String(new char[100]);
		String p;
		String m;
		String n;
		a = new Scanner(System.in).nextLine();
		p = a;
		for (i = 0;i < a.length();i++)
		{
			if (*(p.Substring(i)) == 32)
			{
				if ((i - c - 1) > max)
				{
					max = i - c - 1;
					m = a.charAt(i - 1);
				}
				if ((i - c - 1) < min)
				{
					min = i - c - 1;
					n = a.charAt(i - 1);
				}
				c = i;
			}
		}
		if ((a.length() - c - 1) > max)
		{
			max = a.length() - c - 1;
			m = a.charAt(a.length() - 1);
		}
		if ((a.length() - c - 1) < min)
		{
			min = a.length() - c - 1;
			n = a.charAt(a.length() - 1);
		}
		for (j = 0;j < max;j++)
		{
			System.out.printf("%c",*(m - max + 1 + j));
		}
		System.out.print("\n");
		for (j = 0;j < min;j++)
		{
			System.out.printf("%c",*(n - min + 1 + j));
		}
	}

}
