package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[301]);
		int i;
		int j;
		int n;
		int m = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (j = 65;j < 91;j++)
		{
			for (i = 0,m = 0;i <= n;i++)
			{
				if (a.charAt(i) != j)
				{
					continue;
				}
				else
				{
					m = m + 1;
				k = k + 1;
				}
			}
			if (m != 0)
			{
			   System.out.printf("%c=%d\n",j,m);
			}
		}
		for (j = 97;j < 123;j++)
		{
			for (i = 0,m = 0;i <= n;i++)
			{
				if (a.charAt(i) == j)
				{
					m++;
					k++;
				}
			}
			if (m != 0)
			{
			   System.out.printf("%c=%d\n",j,m);
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
	}

}

