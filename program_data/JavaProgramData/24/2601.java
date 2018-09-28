package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int a = 0;
		int b = 100;
		int p;
		int t;
		char[][] c = new char[203][1050];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c[i] = tempVar2.charAt(0);
				}
				String.valueOf(c[i]).length();
				if (String.valueOf(c[i]).length() > a)
				{
					a = String.valueOf(c[i]).length();
					p = i;
				}
				if (String.valueOf(c[i]).length() < b)
				{
					b = String.valueOf(c[i]).length();
					t = i;
				}
		}
		System.out.printf("%s\n",c[p]);
		System.out.printf("%s\n",c[t]);
		return 0;
	}

}

