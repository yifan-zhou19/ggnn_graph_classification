package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		float average;
		void array(int array[],int x);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < a + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		array(a, n);
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		average = (float)sum / n;
		if ((float)(a[0] - average) == (float)(average - a[n - 1]))
		{
			for (p = a;p < a + n;p++)
			{
				if (*p - average == a[0] - average || average - a[n - 1] == average - *p)
				{
					if (p == a)
					{
						System.out.printf("%d",*p);
					}
					else
					{
						System.out.printf(",%d",*p);
					}
				}
			}
		}
		else if ((float)(a[0] - average) < (float)(average - a[n - 1]))
		{
			for (p = a;p < a + n;p++)
			{
				if (*p - average == a[0] - average)
				{
					if (p == a)
					{
						System.out.printf("%d",*p);
					}
					else
					{
						System.out.printf(",%d",*p);
					}
				}
			}
		}
		else
		{
			for (p = a;p < a + n;p++)
			{
				if (average - a[n - 1] == average - *p)
				{
					if (p == a + n - 1)
					{
						System.out.printf("%d",*p);
					}
					else
					{
						System.out.printf("%d,",*p);
					}
				}
			}
		}
		return 0;
	}
	public static void array(int[] array, int x)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < x - 1;i++)
		{
			for (j = 0;j < x - 1 - i;j++)
			{
				if (array[j] > array[j + 1])
				{
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}

