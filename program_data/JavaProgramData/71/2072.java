package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int a;
		int b;
		int i;
		int j;
		int Temp;
		int days = 0;
		int[] Month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] Month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			if (a > b)
			{
							   Temp = a;
				a = b;
				b = Temp;
			}
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			{
				days = 0;
				for (j = a;j < b;j++)
				{
					days = days + Month2[j];
				}
			}
			else
			{
				days = 0;
				for (j = a;j < b;j++)
				{
					days = days + Month1[j];
				}
			}
			if (days % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

