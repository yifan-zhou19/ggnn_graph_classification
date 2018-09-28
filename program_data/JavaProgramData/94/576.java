package <missing>;

public class GlobalMembers
{
	public static void bubble_sort(int[] a, int n)
	{
		int i;
		int k;
		int t;
		for (k = n - 1;k > 0;k--)
		{
			for (i = 0;i < k;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}

	}

	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[MAX];
		int u;
		int j = 0;
		int[] b = new int[MAX];
		int m;
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
	   }
	   bubble_sort(a, n);

	   for (i = 0;i < n;i++)
	   {
		   if (a[i] % 2 != 0)
		   {
			b[j] = a[i];
			j++;
		   }
	   }
		m = j;

		for (j = 0;j < m;j++)
		{
			if (j == 0)
			{
				System.out.printf("%d",b[j]);
			}
			else
			{
				System.out.printf(",%d",b[j]);

			}
		}
	   return 0;
	}



}

