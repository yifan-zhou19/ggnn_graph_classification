package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int d = 0;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
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
		n = b.length();
		m = a.length();
		for (i = 0;i <= (n - m);i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{
					for (j = 0;j <= m - 1;j++)
					{
						if (a.charAt(j) == b.charAt(i + j))
						{
							d++;
						}
						else
						{
							break;
						}
					}
						if (d == m)
						{
							System.out.printf("%d",i);
						}
			}
		}

		return 0;
	}
}

