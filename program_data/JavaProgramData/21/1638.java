package <missing>;

public class GlobalMembers
{
	/*/
	?? - ?????   
	 
	?? ??-From Whf 
	?? 
	?? n ???????????????????????????????????????????????????????????????????n ???300 
	????6???3?6?7?1?5?4????? 26/6=4.33?? 1 ??????
	 
	???? 
	?1????????? n? 
	?2???? n ?????????????? 
	
	 
	???? 
	???????????????????????????????????????????????????
	 
	???? 
	7
	1 2 3 4 5 6 7
	 
	???? 
	1,7
	 
	/*/
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int sum = 0;
		int i;
		int j;
		int temp;
		int sign = 0;
		float p;
		float dis;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		p = (float)(sum) / n;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		//printf("%f",p);
		if (p - (float)a[0] == (float)a[n - 1] - p)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] == a[0])
				{
					if (sign == 0)
					{
						System.out.printf("%d",a[i]);
						sign = 1;
					}
					else
					{
						System.out.printf(",%d",a[i]);

					}
				}
				if (a[i] == a[n - 1])
				{
					if (sign == 0)
					{
						System.out.printf("%d",a[i]);
						sign = 1;
					}
					else
					{
						System.out.printf(",%d",a[i]);
						sign = 1;
					}
				}
			}
		}
		else
		{
			if (p - (float)a[0] > (float)a[n - 1] - p)
			{
			dis = p - (float)a[0];
			System.out.printf("%d",a[0]);
			sign = 0;
			}
		else
		{
			dis = (float)a[n - 1] - p;
			sign = 1;
		}
		//printf("%f",dis);
		for (i = 0;i < n;i++)
		{
			if (sign == 0 && i == 0 || sign == 1 && i == n - 1)
			{
				continue;
			}
			if (sign == 0 && a[i] == a[0])
			{
				System.out.printf(",%d",a[i]);
			}
			else if (sign == 1 && a[i] == a[n - 1])
			{
					System.out.printf("%d,",a[i]);
			}
		}
		if (sign == 1)
		{
			System.out.printf("%d",a[n - 1]);
		}
		}
	}
}

