package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int apple;
		int temp;
		int i;
		int n;
		int k;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (apple = 0;;apple++)
		{
			temp = apple;
			for (i = 1;i <= n,temp> k;i++)
			{
				if ((temp - k) % n == 0)
				{
					temp = temp - k - (temp - k) / n;
				}
				else
				{
					break;
				}
			}
			if (i == n + 1)
			{
				break;
			}
		}
		result = apple;
		System.out.printf("%d\n",result);
	}

}

