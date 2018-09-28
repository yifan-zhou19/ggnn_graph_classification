package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int yue1;
		int yue2;
		int i;
		int j;
		int t;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
				yue1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				yue2 = Integer.parseInt(tempVar4);
			}
			if (yue1 > yue2)
			{
				t = yue1;
				yue1 = yue2;
				yue2 = t;
			}
			sum = 0;
			for (j = yue1;j < yue2;j++)
			{
				sum = sum + b[j - 1];
			}
			if (yue1 <= 2 && yue2>2)
			{
				  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				  {
					   sum = sum + 1;
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
		return 0;
	}


}

