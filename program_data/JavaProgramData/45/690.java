package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i = 0;
		int c;
		int d;
		int j;
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
		c = a.length();
		do
		{
			d = 0;
			if (a.charAt(0) == b.charAt(i))
			{
				d = 1;
				for (j = 0;j <= c - 1;j++)
				{
					if (a.charAt(j) != b.charAt(i + j))
					{
						d = 0;
					}
				}
			}
			i = i + 1;
		} while (d == 0);
		System.out.printf("%d",i - 1);
	}


}

