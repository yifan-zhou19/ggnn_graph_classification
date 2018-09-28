package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] num = new int[100];
		int max = 0;
		int max2 = 0;
		int e;
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
				num[i] = Integer.parseInt(tempVar2);
			}
			if (num[i] > max && num[i] > max2)
			{
				e = max;
				max = num[i];
				max2 = e;
			}
			else if (num[i] > max2)
			{
				max2 = num[i];
			}

		}

		System.out.printf("%d\n%d\n",max,max2);
	}
}

