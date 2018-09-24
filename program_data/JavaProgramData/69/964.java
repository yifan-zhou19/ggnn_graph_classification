package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int[] m = new int[200];
		int[] n = new int[200];
		int str1;
		int str2;
		int[] c = new int[201];
		int str;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		str1 = a.length();
		str2 = b.length();
		for (int i = 0;i < str1;i++)
		{
			m[str1 - i - 1] = a.charAt(i) - '0';
		}
		for (int e = 0;e < str2;e++)
		{
			n[str2 - e-1] = b.charAt(e) - '0';
		}
		str = str1 > str2 != 0?str1:str2;
		int s = 0;
		for (int j = 0;j <= str + 1;j++)
		{
			int x;
			x = m[j] + n[j] + s;
			if (x < 10)
			{
				c[j] = x;
				s = 0;
			}
			else if ((x >= 10) && (x < 19))
			{
				c[j] = x - 10;
				s = 1;
			}
			else if ((x >= 20) && (x < 29))
			{
				c[j] = x - 20;
				s = 2;
			}
			if ((str == 1) && (x == 0))
			{
				 System.out.print("0");
				 j = str + 2;
			}
		}
		int q = 0;
		for (int k = str;k >= 0;k--)
		{
			if (q == 0)
			{
				if (c[k] == 0)
				{
				q = 0;
				}
				else
				{
					q = 1;
					System.out.printf("%d",c[k]);
				}
			}
			else
			{
				System.out.printf("%d",c[k]);
			}
		}
		System.out.print("\n");
	}
}

