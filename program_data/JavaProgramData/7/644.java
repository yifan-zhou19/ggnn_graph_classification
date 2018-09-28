package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int n;
		int m1;
		int m2;
		int x = -1;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
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
		n = s.length();
		m1 = a.length();
		m2 = b.length();
		for (i = 0;i <= n - m1;i++)
		{
			if (s.charAt(i) == a.charAt(0))
			{
				y = 1;
				for (j = 1;j < m1;j++)
				{
					if (s.charAt(i + j) != a.charAt(j))
					{
						y = 0;
						break;
					}
				}
			}
			if (y == 1)
			{
				x = i;
				break;
			}
		}
		if (x == -1)
		{
			System.out.printf("%s\n",s);
		}
		else
		{
			 for (i = 0;i < x;i++)
			 {
				 System.out.printf("%c",s.charAt(i));
			 }
			 System.out.printf("%s",b);
			 for (i = x + m1;i < n;i++)
			 {
				 System.out.printf("%c",s.charAt(i));
			 }
			 System.out.print("\n");
		}
	}
}

