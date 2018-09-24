package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int[] b = new int[30];
		int[] c = new int[30];
		int i;
		int n;
		int m = 0;
		for (i = 0;i < 26;i++)
		{
			b[i] = 0;
			c[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A')
			{
				b[a.charAt(i) - 'A']++;
				m++;
			}
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				c[a.charAt(i) - 'a']++;
				m++;
			}
		}
		if (m == 0)
		{
			System.out.print("No");
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",'A' + i,b[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (c[i] != 0)
			{
				System.out.printf("%c=%d\n",'a' + i,c[i]);
			}
		}
		return 0;
	}

}

