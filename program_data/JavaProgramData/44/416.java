package <missing>;

public class GlobalMembers
{
	public static int re(int num)
	{
		int[] sz = new int[30];
		int i;
		int value;
		int x;
		value = 1;
		i = 0;
		if (num < 0)
		{
			num = -num;
			value = -1;
		}
		for (int j = 0;j < 30;j++)
		{
			sz[j] = 0;
		}
		while (num > 0)
		{
					 sz[i++] = num % 10;
					 num = num / 10;
		}
		for (i = 29;i >= 0;i--)
		{
						   if (sz[i] != 0)
						   {
										x = i;
										break;
						   }
		}
		for (i = 0,num = 0;i <= x;i++)
		{
			num = num * 10 + sz[i];
		}
		num = num * value;
	}

	public static int Main()
	{
		int[] num = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
						 String tempVar = ConsoleInput.scanfRead();
						 if (tempVar != null)
						 {
							 num[i] = Integer.parseInt(tempVar);
						 }
						 num[i] = re(num[i]);
		}
		for (i = 0;i < 6;i++)
		{
						 if (i == 5)
						 {
							 System.out.printf("%d",num[i]);
						 }
						 else
						 {
							 System.out.printf("%d\n",num[i]);
						 }
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

