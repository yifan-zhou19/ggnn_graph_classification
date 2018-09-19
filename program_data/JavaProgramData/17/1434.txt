package <missing>;

public class GlobalMembers
{
	public static void print(int n1, int[] z, String s)
	{
		int a;
		for (a = 0;a < n1;a++)
		{
			System.out.printf("%c",s[a]);
		}
			System.out.print("\n");
		for (a = 0;a < n1;a++)
		{
			if (z[a] == 0)
			{
		 System.out.print(" ");
			}
		if (z[a] == 1)
		{
		 System.out.print("$");
		}
		if (z[a] == 2)
		{
		 System.out.print("?");
		}
		}
		System.out.print("\n");
	}
	public static void search(int[] z, int h)
	{
		int k;
		int m;
		int n;
		for (m = 1;m <= h - 1;m++)
		{
		   for (k = 0;(k + m) <= (h - 1);k++)
		   {
			if ((z[k] == 1) && (z[k + m] == 2))
			{
				z[k] = 0;
				z[k + m] = 0;
			}
		   }
		}
	}
	public static String s = new String(new char[500]);
	public static int[] z = new int[500];
	public static int Main()
	{
		while (scanf("%s",s) != EOF)
		{
		int h;
		int a;
		int l1 = 0;
		int l2 = 0;
		h = s.length();
		for (a = 0;a <= h - 1;a++)
		{
			if (s.charAt(a) == '(')
			{
				z[a] = 1;
			}
			else
			{
				  if (s.charAt(a) == ')')
				  {
					  z[a] = 2;
				  }
				  else

				  {
					  z[a] = 0;
				  }
			}

		}
		search(z, h);
		print(h, z, s);
		}
		return 0;

	}

}
