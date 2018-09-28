package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int e;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		int[] num = new int[100];
		for (int i = 0;i < len;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(num[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (int k = 1;k < len;k++)
		{
			for (int i = 0;i < len - k;i++)
			{
				if (num[i] < num[i + 1])
				{
					e = num[i + 1];
					num[i + 1] = num[i];
					num[i] = e;
				}
			}
		}
		System.out.printf("%d\n%d\n",num[0],num[1]);
	}

}

