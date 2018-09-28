package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j;
		int m;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a;p < n + a;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j] && j != n - 1)
				{
					n--;
					m = j;
					do
					{
						a[m] = a[m + 1];
						m++;
					}while (m < n);
					j--;
				}
				else if (a[i] == a[j] && j == n - 1)
				{
					n--;
					j--;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sum == 0)
			{
				System.out.printf("%d",a[i]);
				sum++;
			}
			else
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}

}

