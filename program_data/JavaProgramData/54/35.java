package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int[] apple = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			apple[i] = k;
		}
		do
		{
			apple[0] = apple[0] + n;
			for (i = 1;i < n;i++)
			{
				if (apple[i - 1] % (n - 1) != 0)
				{
					break;
				}
				else
				{
				apple[i] = apple[i - 1] * n / (n - 1) + k;
				}
			}
		}while (i < n);
		System.out.printf("%d",apple[n - 1]);
	}


}

