package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int year;
		int m1;
		int m2;
		int a;
		int b;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] month1 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < n;i++)
		{
			sum = 0;

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
				a = m2;
				b = m1;
			}
			else
			{
				a = m1;
				b = m2;
			}
				for (j = a;j < b;j++)
				{
					if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
					{
						sum += month1[j - 1];
					}
					else
					{
						sum += month2[j - 1];
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

