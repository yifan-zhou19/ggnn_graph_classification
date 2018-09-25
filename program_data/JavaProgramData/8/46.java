package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void sort(int array[],int n);
		int m;
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		sort(a, m);
		sort(b, n);
		for (i = 0;i < m + n;i++)
		{
			if (i < m)
			{
				c[i] = a[i];
			}
			else
			{
				c[i] = b[i - m];
			}
		}
		for (i = 0;i < m + n;i++)
		{
			if (i < m + n - 1)
			{
				System.out.printf("%d ",c[i]);
			}
			else
			{
				System.out.printf("%d\n",c[i]);
			}
		}
	}

	public static void sort(int[] array, int n)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (array[j] < array[k])
				{
					k = j;
				}
			}
				t = array[k];
				array[k] = array[i];
				array[i] = t;
		}
	}


}

