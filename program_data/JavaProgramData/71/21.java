package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int j;
		int k;
		int p;
		int s = 0;
		int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				k = Integer.parseInt(tempVar4);
			}
			if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0)
			{
				if (j < k)
				{
				   for (p = j;p < k;p++)
				   {
					   s += month2[p];
				   }
				   if (s % 7 == 0)
				   {
					   System.out.print("YES\n");
				   }
				   else
				   {
					   System.out.print("NO\n");
				   }
				}
				else if (j > k)
				{
				   for (p = k;p < j;p++)
				   {
					   s += month2[p];
				   }
				   if (s % 7 == 0)
				   {
					   System.out.print("YES\n");
				   }
				   else
				   {
					   System.out.print("NO\n");
				   }
				}
			}
			else
			{
			   if (j < k)
			   {
				   for (p = j;p < k;p++)
				   {
					   s += month1[p];
				   }
				   if (s % 7 == 0)
				   {
					   System.out.print("YES\n");
				   }
				   else
				   {
					   System.out.print("NO\n");
				   }
			   }
				else if (j > k)
				{
				   for (p = k;p < j;p++)
				   {
					   s += month1[p];
				   }
				   if (s % 7 == 0)
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
		return 0;
	}
}

