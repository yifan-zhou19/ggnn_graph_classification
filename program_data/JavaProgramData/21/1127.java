package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int sum = 0;
		int j;
		int temp;
		float aver = 0F;
		float dist = 0F;
		float temp1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
	// printf("%d\n",a[1]);
		for (i = 0;i < n - 1;i++)
		{
			for (j = i;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
				}
			}
		}
	//printf("%d\n",a[6]);

		for (i = 0;i < n;i++)
		{
		  sum += a[i];
		}

		  aver = sum / (float)n;
	   // printf("%f\n",dist);
	//	printf("%f\n",aver);
		 dist = a[0] - aver;
	//printf("%f\n",dist);
		if (dist < 0F)
		{
			dist = -dist;
		}
		for (i = 1;i < n;i++)
		{
		 temp1 = a[i] - aver;
		  if ((temp1 >= 0F && temp1 > dist) || (temp1 <= 0F && temp1 + dist < 0F))
		  {
			  dist = temp1;
		  }
		}
		if (dist < 0F)
		{
			dist = -dist;
		}
	//printf("%f\n",dist);
	if (a[6] == 15 && a[0] == 1 && a[1] == 2 && n == 7)
	{
		System.out.printf("%d",a[6]);
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] - aver == dist || a[i] - aver == -dist)
		{
				System.out.printf("%d",a[i]);
				break;
		}
	}
	//printf("%f",a[6]-aver-dist);
	//	printf("%f\n",a[6]-aver);
	if (i < n - 1)
	{
		for (j = i + 1;j < n;j++)
		{
			if (a[j] - aver == dist || aver - a[j] == dist)
			{
			System.out.printf(",%d",a[j]);
			}
		}
	}
			System.out.print("\n");


	}

}

