package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] u = new int[20000];
		int a;
		int n;
		int i;
		int j;
		int k;
		int l;
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
				u[i] = Integer.parseInt(tempVar2);
			}
		}
	   k = 0;
	   for (i = 0;i < n;i++)
	   {
			for (j = i + 1;j < n;j++)
			{
				if (u[i] == u[j])
				{
					u[j] = 0;

				}
			}
	   }
		for (i = 0;i < n;i++)
		{
			if (u[i] != 0)
			{
				k++;
			}
		}
		i = 0;
		l = 0;
		while (i < n)
		{
			if (u[i] != 0)

			{
				if (l < k - 1)
				{
					System.out.printf("%d ",u[i]);
					l++;
				}

			else
			{
					System.out.printf("%d",u[i]);
			}
			}
		i++;
		}


		return 0;
	}

}

