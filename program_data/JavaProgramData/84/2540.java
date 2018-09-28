package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int max2;
		int a;
		int i;
		i = 1;
			 int n;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
		if (i == 1)
		{
			max = a;
			max2 = a - 1;
		}
		else if (a > max)
		{
			if (max > max2)
			{
				max2 = max;
			}
			 max = a;
		}
			 else if (a < max)
			 {
				 if (a > max2)
				 {
					 max2 = a;
				 }
			 }
		i++;
		}
		System.out.printf("%d\n%d\n",max,max2);
		return 0;
	}
}

