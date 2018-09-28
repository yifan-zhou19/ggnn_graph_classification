package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int j;
		int k;
		int n;
		int t;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		k = 1;
		for (i = 0;i < n - 1;i++)
		{
			if (i == 0)
			{
				if (b[i] < a[i + 1])
				{
					k = 0;
					break;
				}
			}
			 if ((i != 0) && (b[i] >= b[i - 1]))
			 {
			if (b[i] < a[i + 1])
			{
				k = 0;
				break;
			}
			 }
		}

		if (k == 1)
		{
			t = b[0];
			for (i = 0;i < n;i++)
			{
				if (t < b[i])
				{
					t = b[i];
				}
			}
			System.out.printf("%d %d",a[0],t);
		}
		else
		{
			System.out.print("no");
		}

	}

}

