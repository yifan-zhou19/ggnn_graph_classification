package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[51]);
		String b = new String(new char[51]);
		int a1;
		int b1;
		int i;
		int j;
		int m;
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
		a1 = a.length();
		b1 = b.length();
		for (i = 0;i < b1;i++)
		{
			m = 0;
			for (j = 0;j < a1;j++)
			{
				if ((int)a.charAt(j) == (int)b.charAt(i + j))
				{
					m += 1;
				}
			}
			if (m == a1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}
}

