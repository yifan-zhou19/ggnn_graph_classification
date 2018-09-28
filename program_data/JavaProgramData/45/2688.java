package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[60]);
		String b = new String(new char[60]);
		String c = new String(new char[60]);
		int i;
		int j;
		int k;
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (a.charAt(j) == b.charAt(i + j))
				{
					k++;
				}
			}
			if (k == m)
			{
				break;
			}
			k = 0;

		}
		System.out.printf("%d",i);






	}
}

