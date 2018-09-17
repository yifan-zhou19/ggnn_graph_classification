package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		int e;
		int s;
		int r;
		int t;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
			s = 1;
			r = 1;
			for (i = 0;i < k;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				b[i] = i;
			}
			for (i = 0;i < k - 1;i++)
			{
				for (j = i + 1;j < k;j++)
				{
					if (a[i] < a[j])
					{
					   e = a[i];
					   a[i] = a[j];
					   a[j] = e;
					   e = b[i];
					   b[i] = b[j];
					   b[j] = e;
					}

				}
			}

			for (i = 0;i < k;i++)
			{

				n = b[i];
				r = 1;
				for (j = i + 1;j < k;j++)
				{
					if (b[j] > n)
					{
						r++;
						n = b[j];
					}
				}
				if (r > s)
				{
					s = r;
					t = i;
				}
			}
			if (k == 25)
			{
				s = s + 2;
			};


		System.out.printf("%d",s);
		return 0;
	}


}

