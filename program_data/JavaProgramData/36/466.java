package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] c = new int[52];
		int[] d = new int[52];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == 'A' + i)
				{
					c[i]++;
				}
			}
			for (j = 0;j < b.length();j++)
			{
				if (b.charAt(j) == 'A' + i)
				{
					d[i]++;
				}
			}
		}
		for (;i < 52;i++)
		{
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == 'a' + i - 26)
				{
					c[i]++;
				}
			}
			for (j = 0;j < b.length();j++)
			{
				if (b.charAt(j) == 'a' + i - 26)
				{
					d[i]++;
				}
			}
		}
		for (i = 0;i < 52;i++)
		{
			if (c[i] != d[i])
			{
				System.out.print("NO");
				break;
			}
		}
		if (i == 52)
		{
			System.out.print("YES");
		}
	}
}

