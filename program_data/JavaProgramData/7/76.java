package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x;
		int y;
		int z;
		int m;
		int t = 1;
		int n;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		x = a.length();
		y = b.length();
		z = c.length();
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				if (a.charAt(i + j) != b.charAt(j))
				{
					break;
				}
				else
				{
					if (j == y - 1)
					{
						for (m = 0;m < z;m++)
						{
						System.out.printf("%c",c.charAt(m));
						}
						i = i + y - 1;
						t = 0;
					}
				}
			}
			if (j < y - 1)
			{
				 System.out.printf("%c",a.charAt(i));
			}
			if (t == 0)
			{
				break;
			}

		}
		for (n = i + 1;n < x;n++)
		{
		System.out.printf("%c",a.charAt(n));
		}
		return 0;
	}
}

