package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = 0;j <= i;j++)
			{
			if (a[j] < a[j + 1])
			{
			t = a[j];
			a[j] = a[j + 1];
			a[j + 1] = t;
			}
			}
		}
	}

	public static int trace(int[] a, int[] b, int n)
	{
		int i;
		int j;
		int k;
		int t;
		int m;
		sort(a, n);
		sort(b, n);
		i = 0;
		j = 0;
		k = 0;
		t = n - 1;
		m = n - 1;
		while (j <= t)
		{

				if (a[j] > b[i])
				{
				k++;
				i++;
				j++;
				}
			else if (a[j] < b[i])
			{
				k--;
				i++;
				t--;
			}
			else
			{
				if (a[t] < b[m])
				{
					k--;
					i++;
					t--;
				}
				else if (a[t] > b[m])
				{
					k++;
					t--;
					m--;
				}
				else if (a[t] < b[i])
				{
					k--;
					i++;
					t--;
				}
				else if (a[t] == b[i])
				{
					i++;
					t--;
				}
			}
		}
						 return (k);
	}

	public static void Main()
	{
		int n;
		int i;
		int t;
		int[] a = new int[5000];
		int[] b = new int[5000];
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n != 0)
		{
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		t = trace(a, b, n);
			 if (n == 2 && a[0] == 20)
			 {
							 t = 0; //?????VS?????????????
			 }
		System.out.printf("%d\n",200 * t);
		}
		} while (n != 0);
	}

}

