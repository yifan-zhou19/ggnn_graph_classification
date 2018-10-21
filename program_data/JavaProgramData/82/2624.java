package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int high;
		int low;
		int number;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		number = 0;
		k = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				high = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				low = Integer.parseInt(tempVar3);
			}
			if ((high <= 140) && (high >= 90) && (low >= 60) && (low <= 90))
			{
				number += 1;
			}
			else
			{
				if (k < number)
				{
					k = number;
				};
				number = 0;
				continue;
			}
			if (k < number)
			{
				k = number;
			};
		}
		System.out.printf("%d",k);
	}
}

