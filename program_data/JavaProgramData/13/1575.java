package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int all;
		int[] name = new int[20000];
		int[] input = new int[20000];
		int i;
		int p;
		int count;
		int judge;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		count = 0;
		for (i = 0;i < all;i++)
		{
			name[i] = 0;
		}
		for (i = 0;i < all;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < all;i++)
		{
			judge = 0;
			for (p = 0;p < count;p++)
			{
				if (name[p] == input[i])
				{
					judge = 1;
					break;
				}
			}
			if (judge == 1)
			{
				continue;
			}
			name[count] = input[i];
			count++;
		}
		System.out.printf("%d",name[0]);
		for (i = 1;i < count;i++)
		{
			System.out.printf(" %d",name[i]);
		}

	return 0;
	}
}

