package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int[] u = new int[100000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u[i] = Integer.parseInt(tempVar2);
			}
		}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}

			for (int i = 0;i < n;i++)
			{
				if (u[i] == a)
				{
				  for (int j = i;j < n - 1;j++)
				  {
						u[j] = u[j + 1];
				  }
					i--;
					n--;
				}
			}
			for (int i = 0;i < n;i++)
			{
				if (i == n - 1)
				{
					System.out.printf("%d",u[i]);
				}
				else
				{
				  System.out.printf("%d ",u[i]);
				}
			}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					n = Integer.parseInt(tempVar4);
				}
		return 0;
	}
}

