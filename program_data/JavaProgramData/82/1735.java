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
				if (a[i] < a[i + 1])
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
		int n;
		int shousuo;
		int shuzhang;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 0;
		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shousuo = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shuzhang = Integer.parseInt(tempVar3);
			}
			if (shousuo >= 90 && shousuo <= 140 && shuzhang >= 60 && shuzhang <= 90)
			{
				a[i] = 1;
			}
				else
				{
					a[i] = 0;
				}
		}
		for (i = 0;i < n;i++)
		{
			switch (a[i])
			{
				case 1:
				b[j]++;
				break;
				default:
					j++;
			}
		}
		bubble_sort(b, 99);
		System.out.printf("%d",b[0]);
		return 0;
	}

}

