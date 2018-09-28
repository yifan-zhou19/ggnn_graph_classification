package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[100000];
		int temp;
		int i;
		int k;
		int l;
		int p;
		int q;
		int c;
		int w = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		k = n - m;

		for (i = 0;i >= 0 && i <= k;i++)
		{
			a[i] = m + i;
	//		printf("%d ", a[i]);
		}

		for (i = 0;i >= 0 && i <= k;i++)
		{
			temp = a[i];
			q = 0; //q??????????????//
			while (temp > 0)
			{
				p = temp % 10;
				q = q * 10 + p;
				temp = temp / 10;
			}
			 if (q == a[i])
			 {
				for (c = 2;c < a[i];c++)
				{
					if (a[i] % c == 0)
					{
						break;
					}
				}
				if (c >= a[i])
				{
					w++;
					if (w == 1)
					{
						System.out.printf("%d", a[i]);
					}
					else
					{
						System.out.printf(",%d", a[i]);
					}
				}
			 }

		}
		if (w == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
		return 0;
	}

}

