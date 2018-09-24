package <missing>;

public class GlobalMembers
{
	public static int leastapple(int monkey,int thraway)
	{
		int last = 0;
		int i;
		double least;
		while (true)
		{
			last++;
			for (i = 0;i < monkey;i++)
			{
				if (i == 0)
				{
					least = last * monkey + thraway;
				}
				else
				{
					least = least / (monkey - 1) * monkey + thraway;
				}
				if (least - (int)least != 0)
				{
					break;
				}
			}
			if (i == monkey)
			{
				break;
			}
		}
		return least;
	}
	public static void Main(String[] args)
	{
		int n;
		int k;
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
		System.out.printf("%ld",leastapple(n, k));
	}
}

