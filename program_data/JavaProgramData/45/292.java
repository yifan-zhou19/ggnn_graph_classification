package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int a;
		int b;
		int i;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		a = s.length();
		b = w.length();
		p = 0;
		for (i = 0;i <= b - 1;i++)
		{
			for (j = 0;j <= a - 1;j++)
			{
				if (s.charAt(j) != w.charAt(i + j))
				{
					break;
				}
				if (j == a - 1)
				{
					System.out.printf("%d\n",i);
				}
				p = 1;
			}
			if (p == 1)
			{
				break;
			}
		}
	}
}

