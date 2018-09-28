package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int l;
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))
			{
				l = 29;
			}
			else
			{
				l = 28;
			}
			if (b > c)
			{
				int x = b;
				b = c;
				c = x;
			}
			int j;
			int sum = 0;
			for (j = b; j < c; j++)
			{
				switch (j)
				{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					sum = sum + 31;
					continue;
				case 4:
				case 6:
				case 9:
				case 11:
					sum = sum + 30;
					continue;
				case 2:
					sum = sum + l;
				}
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

