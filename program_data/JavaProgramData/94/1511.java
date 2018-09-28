package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int LEN;
		int[] a = new int[500];
		int[] t = new int[500];
		int j = 0;
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


		for (i = 0;i < n;i++)
		{
			 if (a[i] % 2 != 0)
			 {
				 t[j] = a[i];
				 j = j + 1;
			 }
		}

		LEN = j;

		int maxIndex;
		int e;
		for (int k = 1;k <= LEN;k++)
		{
			maxIndex = 0;
			for (int j = 0;j <= LEN - k;j++)
			{
				if (t[j] > t[maxIndex])
				{
						maxIndex = j;
				}
			}
			if (maxIndex != LEN - k)
			{
			   e = t[maxIndex];
			   t[maxIndex] = t[LEN - k];
			   t[LEN - k] = e;
			}
		}

		for (j = 0;j < LEN - 1;j++)
		{
			System.out.printf("%d,",t[j]);
		}
		System.out.printf("%d",t[LEN - 1]);








		return 0;
	}






}

