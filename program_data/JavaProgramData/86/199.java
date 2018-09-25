package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int sum = 60;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < a;j++)
			{
				int b;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
				if (b < (sum - 3))
				{
					sum -= 3;
				}
				else if (b >= (sum - 3) && b <= sum)
				{
					sum = b;
				}
			}
				System.out.printf("%d\n",sum);
		}

	}



}

