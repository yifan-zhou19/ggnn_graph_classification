package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l1;
		int l2;
		int t1;
		int t2;
		int temp;
		int i;
		int j;
		int n;
			 int sum;
		int[] a = new int[2000];
		int[] b = new int[2000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			sum = 0;
			l1 = 1;
			l2 = n;
			t1 = 1;
			t2 = n;
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 1;i < n;i++)
			{
				for (j = i + 1;j <= n;j++)
				{
					if (a[i] < a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 1;i < n;i++)
			{
				for (j = i + 1;j <= n;j++)
				{
					if (b[i] < b[j])
					{
						temp = b[i];
						b[i] = b[j];
						b[j] = temp;
					}
				}
			}
			while (l1 <= l2)
			{
				if (a[l1] > b[t1])
				{
					sum = sum + 200;
					l1++;
					t1++;
				}
				else
				{
					if (a[l2] > b[t2])
					{
						sum = sum + 200;
						l2--;
						t2--;
					}
					else
					{
						if (a[l2] > b[t1])
						{
							sum = sum + 200;
						}
						if (a[l2] < b[t1])
						{
							sum = sum - 200;
						}
						l2--;
						t1++;
					}

				}
			}
			System.out.printf("%d\n",sum);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
	}


}

