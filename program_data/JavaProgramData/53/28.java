package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int i;
		int j;
		int[] no = new int[N];
		int[] judge = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				no[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < a;i++)
		{
			if (judge[i] == 0)
			{
				for (j = i + 1;j < a;j++)
				{
					if (no[j] == no[i])
					{
						judge[j] = 1;
					}
				}
			}
		}
		System.out.printf("%d",no[0]);
		for (i = 1;i < a;i++)
		{
			if (judge[i] == 0)
			{
				System.out.printf(",%d",no[i]);
			}
		}
		System.out.print("\n");
	}
}

