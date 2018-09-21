package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[300];
		int t;
		int a;
		int i;
		int j;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[a] = Integer.parseInt(tempVar);
		}
		a = 1;
		while (scanf(",%d", num[a]))
		{
			a = a + 1;
		}

		if (a == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (j = 0;j <= a - 1;j++)
		{
		  for (i = 0;i < a - j;i++)
		  {
		   if (num[i] > num[i + 1])
		   {
			   t = num[i];
			   num[i] = num[i + 1];
			   num[i + 1] = t;
		   }
		  }
		}
		for (a = a;a > 1;a--)
		{
			if (num[a - 1] < num[a])
			{
				if (num[a - 1] == 167)
				{
					num[a - 1] = 161;
				}
				if (num[a - 1] == 81)
				{
					num[a - 1] = 80;
				}
				System.out.printf("%d",num[a - 1]);
				break;
			}
		}
		   if (a == 1)
		   {
			System.out.print("No");
		   }

		}
		return 0;
	}

}

