package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		int i;
		int j;
		int k = 0;
		int m;
		int n;
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
		m = a.length();
		n = b.length();
		for (i = 0;i <= n - m;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = i + 1;j < i + m;j++)
				{
					if (a.charAt(j - i) == b.charAt(j))
					{
						k++;
					}
				}
			}
			if (k == m - 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
			else
			{
				k = 0;
			}
		}
	}
}

