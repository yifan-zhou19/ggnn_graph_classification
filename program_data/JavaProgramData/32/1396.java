package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int time;
		int i;
		int j;
		int len1;
		int len2;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (time = 0;time < n;time++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			len1 = a.length();
			len2 = b.length();
			j = 0;
			for (i = 0;i < len1;i++)
			{
				if (i < len2)
				{
					a.charAt(len1 - i - 1) -= (b.charAt(len2 - i - 1) - '0');
				}
				if (a.charAt(len1 - i - 1) < '0')
				{
					a.charAt(len1 - i - 2) -= 1;
				}
			}
			j = 0;
			for (i = 0;a.charAt(i) != 0;i++)
			{
				if (a.charAt(i) != '0')
				{
					j = 1;
				}
				if (j != 0)
				{
					System.out.printf("%c",(a.charAt(i) >= '0'?a.charAt(i):a.charAt(i) + 10));
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

