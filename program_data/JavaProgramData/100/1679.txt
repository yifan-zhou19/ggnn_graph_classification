package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int[] b = new int[26];
		int[] c = new int[26];
		int m = 0;
		int i;
		String a = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'A')
			{
			if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A')
			{
				b[a.charAt(i) - 'A']++;
			}
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				c[a.charAt(i) - 'a']++;
			}
			m++;
			}

		}
		if (m == 0)
		{
			System.out.print("No\n");
		}
		else
		{
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
		}
		return 0;
	}
}

