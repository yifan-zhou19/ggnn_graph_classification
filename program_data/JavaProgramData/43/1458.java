package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 2;
		int t;
		int su = 1;
		int put;
		int temp;
		int[] a = new int[20000];
		a[0] = 2;
		a[1] = 3;
		for (i = 4;i < 10000;i++)
		{
			su = 1;
			for (j = 2;j * j <= i;j++)
			{
				if (i % j == 0)
				{
					su = 0;
				}
			}
			if (su == 1)
			{
				a[k] = i;
				k++;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			put = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 2000;i++)
		{
			temp = put - a[i];
			for (t = i;t < 2000;t++)
			{
				if (a[t] == temp)
				{
					System.out.printf("%d %d\n",a[i],a[t]);
				}
				if (a[t] > temp)
				{
					break;
				}
			}
		}
		return 0;
	}





}

