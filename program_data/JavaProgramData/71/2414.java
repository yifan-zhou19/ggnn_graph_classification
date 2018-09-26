package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int year;
			int m1;
			int m2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			int sum;
			if ((year % 4 == 0) && (year % 100) != 0 || (year % 400 == 0))
			{
				 a[2] = 29;
			}
			else
			{
				a[2] = 28;
			}
			if (m1 < m2)
			{
				for (j = m1,sum = 0;j < m2;j++)
				{
				sum = sum + a[j];
				}
			}
			else
			{
				for (j = m2,sum = 0;j < m1;j++)
				{
				sum = sum + a[j];
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

