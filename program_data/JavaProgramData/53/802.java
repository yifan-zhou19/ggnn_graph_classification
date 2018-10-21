package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 1;
		int n;
		int[] result = new int[300];
		int[] tem = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			tem[0] = Integer.parseInt(tempVar2);
		}
		result[0] = tem[0];
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				tem[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < i;j++)
			{
				if (tem[i] == result[j])
				{
					break;
				}
				if (j == i - 1)
				{
					result[k] = tem[i];
					k++;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",result[i]);
		}
		System.out.printf("%d",result[k - 1]);
		return 0;
	}

}

