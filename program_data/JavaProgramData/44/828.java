package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int i;
		for (i = 0;(int)Math.pow(10,i) <= a;i++)
		{
			;
		}
		int word;
		word = i;
		int sum;
		sum = 0;
		for (i = 0;i < word;i++)
		{
			sum += (a % 10) * ((int)Math.pow(10,word - i - 1));
			a /= 10;
		}
		return sum;
	}
	public static int Main()
	{
		int[] num = new int[6];
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			num[1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			num[2] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			num[3] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			num[4] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead("\n");
		if (tempVar6 != null)
		{
			num[5] = Integer.parseInt(tempVar6);
		}
		int i;
		for (i = 0;i < 6;i++)
		{
			if (num[i] == 0)
			{
				System.out.print("0\n");
			}
			else
			{
				a = num[i];
				if (num[i] > 0)
				{
					System.out.printf("%d\n",reverse(a));
				}
				else
				{
					a = -num[i];
				System.out.printf("%d\n",-reverse(a));
				}
			}
		}
		return 0;
	}
}

