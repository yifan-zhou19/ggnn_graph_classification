package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		int b;
		int c;
		int p;
		int m;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			m = (b > c)?b:c;
			q = (b < c)?b:c;
			if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
			{
			   if (q <= 2 && m>2)
			   {
					 p = p + 1;
			   }

			}
			for (j = q;j < m;j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
				   p += 31;
				}
				if (j == 2)
				{
				   p += 28;
				}
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
				   p += 30;
				}
			}
			if (p % 7 == 0)
			{
				System.out.print("YES\n");
			}
			if (p % 7 != 0)
			{
				System.out.print("NO\n");
			}
		}

	}
}

