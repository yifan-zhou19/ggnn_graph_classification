package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int y;
		int m1;
		int m2;
		int j;
		int bigm;
		int smallm;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0; j < n; j++)
		{
			int days = 0;
			int i;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
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
			if (m1 <= m2)
			{
				smallm = m1;
				bigm = m2;
			}
			else
			{
				bigm = m1;
				smallm = m2;
			}
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			{
				for (i = smallm; i < bigm; i++)
				{
					days += month2[i - 1];
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
		   else
		   {
				for (i = smallm; i < bigm; i++)
				{
					days += month1[i - 1];
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
		}

		return 0;

	}
}

