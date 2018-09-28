package <missing>;

public class GlobalMembers
{
	public static int check(int m,int n,int k)
	{
		int i;
		int out;
		out = 0;
		for (i = m;i <= n;i++)
		{
				   if (i % k == 0)
				   {
							 if (i - m < k)
							 {
									  System.out.printf("%d",i);
									  out = 1;
							 }
							 else
							 {
								  System.out.printf(",%d",i);
								  out = 1;
							 }
				   }

		}
		if (out == 0)
		{
				  System.out.print("no\n");
		}
		else
		{
			System.out.print("\n");
		}
		return k;
	}

	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[100];
		int sum = 0;
		int min = 100;
		int max = 0;
		float ave;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			sum += num[i];
			if (min > num[i])
			{
				min = num[i];
			}
			if (max < num[i])
			{
				max = num[i];
			}
		}
		ave = (float)sum / n;
		if (max - ave == ave - min)
		{
			System.out.printf("%d,%d",min,max);
		}
		else if (max - ave > ave - min)
		{
			System.out.printf("%d",max);
		}
		else
		{
			System.out.printf("%d",min);
		}

		return 0;
	}
}

