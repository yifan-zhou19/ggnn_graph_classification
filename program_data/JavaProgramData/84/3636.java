package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int max;
		int secondmax;
		int[] num = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[0] = Integer.parseInt(tempVar2);
		}
		max = num[0];
		secondmax = num[0];

		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}

			if (num[i] > max)
			{
				max = num[i];
			}
			else if (num[i] > secondmax)
			{
				secondmax = num[i];
			}
		}

		System.out.printf("%d\n%d\n",max,secondmax);
	}

}

