package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[16];
		int i;
		int sum = 0;
		int b;
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		while (b != -1)
		{
			a[0] = b;
			i = 0;
				while (a[i] != 0)
				{
			i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
				}

				for (j = 1;j < i;j++)
				{
				   for (k = 0;k < i - j;k++)
				   {
					  if (a[k] > a[k + 1])
					  {
						 m = a[k];
						 a[k] = a[k + 1];
						 a[k + 1] = m;
					  }
				   }
				}
				for (j = 0;j < i - 1;j++)
				{
				   for (k = j + 1;k < i;k++)
				   {
					  if (2 * a[j] == a[k])
					  {
					  sum++;
					  }
				   }
				}
				System.out.printf("%d\n",sum);
				sum = 0;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
		}
	}

}

