package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		int i;
		int[] a = new int[26];
		int[] b = new int[26];
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) >= 'A' && c.charAt(i) < 'A' + 26)
			{
				a[c.charAt(i) - 'A']++;
			}
			else if (c.charAt(i) >= 'a' && c.charAt(i) < 'a' + 26)
			{
				b[c.charAt(i) - 'a']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0 || b[i] != 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%c=%d\n",'A' + i,a[i]);
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (b[i] != 0)
				{
					System.out.printf("%c=%d\n",'a' + i,b[i]);
				}
			}
		}
	}

}

