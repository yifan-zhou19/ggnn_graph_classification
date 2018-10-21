package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int max;
		int[][] bp = new int[N][2];
		int[] state = new int[N];
		int[] hou = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bp[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bp[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (((bp[i][0] >= 90) && (bp[i][0] <= 140)) && ((bp[i][1] >= 60) && (bp[i][1] <= 90)))
			{
			  state[i] = 1;
			} //????????????????1
		}
		state[n] = 0;
		for (i = 0;i <= n;i++)
		{
			if (state[i] == 1)
			{
			   j++;
			}
			else
			{
				hou[i] = j;
				j = 0;
			}
		} //?hou[i]??????????????
		max = hou[0];
		for (i = 0;i <= n;i++)
		{
			if (max < hou[i])
			{
				max = hou[i];
			}
		} //?hou[i]???
		System.out.printf("%d",max);
		return 0;
	}



}

