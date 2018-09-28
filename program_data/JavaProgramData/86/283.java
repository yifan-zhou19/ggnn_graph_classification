package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int cishu;
		int i;
		int j;
		int k;
		int time1;
		int time2;
		int sum = 0;
		int[] a = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cishu = Integer.parseInt(tempVar2);
			}
			if (cishu == 0)
			{
				sum = 60;
			}
			if (cishu != 0)
			{
			   for (j = 0;j < cishu;j++)
			   {
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   a[j] = Integer.parseInt(tempVar3);
				   }
			   }
			   for (k = 1;k <= cishu;k++)
			   {
				  time1 = a[k - 1] + 3 * (k - 1);
				  time2 = a[k - 1] + 3 * k;
				  if (time1 >= 60)
				  {
					  sum = 60 - 3 * (k - 1);
				  }
				  if (time1 < 60 && time2 >= 60)
				  {
					  sum = a[k - 1];
				  }
				  if (sum != 0)
				  {
					  break;
				  }
			   }
					if (sum == 0)
					{
				   sum = 60 - 3 * cishu;
					}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

