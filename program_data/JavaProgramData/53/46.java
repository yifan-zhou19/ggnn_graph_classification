package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[] a = new int[300];
		int[] state = new int[300];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		int j;
		for (i = 0;i < n - 1;i++)
		{
			if (state[i] == 0)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[j] == a[i])
					{
						state[j] = 1;
					}
				}
			}
		}
		int k = 0;
		int[] result = new int[300];
		for (i = 0;i < n;i++)
		{
			if (state[i] == 0)
			{
				result[k] = a[i];
				k++;
			}
		}

		System.out.printf("%d",result[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",result[i]);
		}
	}

}

