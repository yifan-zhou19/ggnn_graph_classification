package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] pt;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		pt = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pt + i = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (flag != 0)
			{
			for (j = i + 1;j < n;j++)
			{
				if ((pt[i] + pt[j]) == k)
				{
					flag = 0;
					break;
				}
			}
			}
		}
				if (flag != 0)
				{
					System.out.print("no\n");
				}
				else
				{
					System.out.print("yes\n");
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(pt);
	}

}

