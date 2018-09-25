package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int m1;
		int m2;
		int i;
		int tmp;
		int sum;
		int k;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i <= n;i++)
		{
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
			if (m1 > m2)
			{
				tmp = m1;
				m1 = m2;
				m2 = tmp;
			}
			else
			{
				q = 1;
			}

			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				sum = 0;
				for (k = m1;k < m2;k++)
				{
					sum += b[k - 1];
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
			else
			{
				sum = 0;
				for (k = m1;k < m2;k++)
				{
					sum += a[k - 1];
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
		return 0;


	}


}

