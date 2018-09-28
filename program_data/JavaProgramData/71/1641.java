package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int e;
			int d;
			int j;
			int sum = 0;
			int a;
			int b;
			int c;
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
			if (b > c)
			{
				d = b;
				b = c;
				c = d;
			}
			if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
			{
				day[2] = 29;
			}
			else
			{
				day[2] = 28;
			}
			for (j = b;j < c;j++)
			{
				sum = sum + day[j];
			}
			e = sum % 7;
			if (e == 0)
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

