package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int day1 = 0;
		int day2 = 0;
		int cha = 0;
		int nian;
		int y1;
		int y2;
		int[] mont = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{

			day1 = 0;
			day2 = 0;
			cha = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nian = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				y2 = Integer.parseInt(tempVar4);
			}
			if ((nian % 4 == 0 && nian % 100 != 0) || nian % 400 == 0)
			{
				mont[2] = 29;
			}
			else
			{
				mont[2] = 28;
			}
			for (j = 0;j < y1;j++)
			{
				day1 += mont[j];
			}
			for (k = 0;k < y2;k++)
			{
				day2 += mont[k];
			}
			cha = day1 - day2;
			if ((day1 - day2) < 0)
			{
				cha = day2 - day1;
			}
			if ((cha % 7) == 0)
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

