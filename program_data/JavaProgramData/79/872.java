package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[300];
		int[] m = new int[300];
		int[] a = new int[300];
		int i = 0;
		int j = 0;
		int count;
		int remain;
		int group;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[0] = Integer.parseInt(tempVar2);
		}
		group = 1;
		while (n[i] != 0)
		{
			group++;
			i++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < group;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				a[j] = 1;
			}
			remain = n[i];
			j = -1;
			count = 0;
			while (remain > 1)
			{
				j++;
				if (j == n[i])
				{
					j = 0;
				}
				if (a[j] == 0)
				{
					continue;
				}
				count++;
				if (count % m[i] == 0)
				{
					count = 0;
					a[j] = 0;
					remain--;
				}
			}
			for (j = 0;j < n[i];j++)
			{
				if (a[j] == 1)
				{
					System.out.printf("%d\n",j + 1);
				}
			}
		}
	}


}

