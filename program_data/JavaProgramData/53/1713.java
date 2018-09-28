package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100];
		int[] str = new int[100];
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int index = 0;
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
		}
		System.out.printf("%d",num[0]);
		for (i = 1;i < n;i++)
		{
			index = 0;
			for (j = 0;j < i;j++)
			{
				if (num[i] == num[j])
				{
					index++;
				}
			}
			if (index == 0)
			{
				System.out.printf(",%d",num[i]);
			}
		}
	}

}

