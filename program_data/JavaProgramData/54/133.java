package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k;
		int j;
		int temp;
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
		j = 0;
		i = 1;
		while (i < n)
		{
			j = j + 1;
			temp = j * n + k;
			for (i = 2;i <= n;)
			{
				if (temp % (n - 1) != 0)
				{
					i = i - 1;
					break;
				}
				else
				{
					temp = temp / (n - 1) * n + k;
					i = i + 1;
				}
			}
		}
		System.out.printf("%d\n",temp);
	}

}

