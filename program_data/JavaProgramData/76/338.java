package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] sections = new int[50001][2];
		int[] mark = new int[50001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sections[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sections[i][1] = Integer.parseInt(tempVar3);
			}
			mark[i] = 0;
		}
		int left;
		int right;
		int nmin;
		int node;
		int count;
		count = n;
		for (i = 0; i < n; i++)
		{
			if (i == 0)
			{
				nmin = sections[0][0];
				left = sections[0][0];
				right = sections[0][1];
				node = 0;
			}
			else
			{
				if (sections[i][0] < nmin)
				{
					nmin = sections[i][0];
					left = sections[i][0];
					right = sections[i][1];
					node = i;
				}
			}
		}
		mark[node] = 1;
		count--;
		int temp = count;
		int flag = 0;
		while (count > 0)
		{
			for (i = 0; i < n; i++)
			{
				if (mark[i] == 0)
				{
					if (sections[i][1] <= right)
					{
						mark[i] = 1;
						count--;
					}
					else if (sections[i][0] <= right)
					{
						right = sections[i][1];
						mark[i] = 1;
						count--;
					}
				}
			}
			if (count != 0 && count == temp)
			{
				flag = 1;
				break;
			}
			temp = count;
		}
		if (flag == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d", left, right);
		}
		return 0;
	}


}

