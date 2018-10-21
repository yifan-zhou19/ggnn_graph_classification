package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n = 1;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] a = new int[k];
		int[] b = new int[k];
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 1;
		}


		 for (i = k - 1;i >= 0;i--)
		 {
			for (j = k - 1;j > i;j--)
			{
				if (a[i] >= a[j])
				{
					b[i] = b[i] > b[j] != 0?b[i]:b[j] + 1;
				}


			}
		 }


		for (i = 0;i < k;i++)
		{
			n = n > b[i] != 0?n:b[i];
		}
		System.out.printf("%d", n);



	}


}

