package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int ss(int a);
	public static int Main()
	{
		int i = 0;
		int n;
		int m;
		int sum = 0;
		int count = 0;
		int[] b = new int[10000];
		for (i;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			int[] a = new int[10000];
			int p = 0;
			int j = 0;
			int k = 0;
			int number = 0;
			for (j = 0;j < n;j++)
			{
				a[j] = 1;
			}
			while (number < n - 1)
			{
				if (a[p] != 0)
				{
					k++;
					if (k == m)
					{
						a[p] = 0;
						k = 0;
						number++;
					}
				}
				p = (p + 1) % n;
			}
			for (j = 0;j < n;j++)
			{
				if (a[j] != 0)
				{
					b[i] = j + 1;
					count++;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			System.out.printf("%d",b[i]);
			if (i != count - 1)
			{
			System.out.print("\n");
			}
		}

		return 0;
	}





}

