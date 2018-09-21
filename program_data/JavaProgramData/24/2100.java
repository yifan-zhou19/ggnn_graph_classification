package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[200][200];
		char i;
		char t;
		char c;
		char d;
		int n = 0;
		for (i = 0;i < 200;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			n++;
			t = System.in.read();
			if (t == '\n')
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			int j;
			int m = 0;
			for (j = 0;j < n;j++)
			{
				if (String.valueOf(a[i]).length() >= String.valueOf(a[j]).length())
				{
					m++;
				}
			}
			if (m == n)
			{
				c = String.valueOf(a[i]).length();
			}
		}
		for (i = 0;i < n;i++)
		{
			int j;
			int m = 0;
			for (j = 0;j < n;j++)
			{
				if (String.valueOf(a[i]).length() <= String.valueOf(a[j]).length())
				{
					m++;
				}
			}
			if (m == n)
			{
				d = String.valueOf(a[i]).length();
			}
		}
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(a[i]).length() == c)
			{
				System.out.printf("%s\n",a[i]);
				break;
			}
		}
		 for (i = 0;i < n;i++)
		 {
			if (String.valueOf(a[i]).length() == d)
			{
				System.out.printf("%s\n",a[i]);
				break;
			}
		 }

		return 0;
	}
}

