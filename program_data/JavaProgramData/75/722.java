package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[1000]; //?????????
		int[][] inout = new int[1000][2]; //???????
		int max;
		int n = 0;
		int i;
		int j;
		int d;
		char c = ',';
		while (c == ',') //??????
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				d = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			inout[n][0] = d;
			n++;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			inout[0][1] = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < n;i++) //??????
		{
			String tempVar4 = ConsoleInput.scanfRead(",");
			if (tempVar4 != null)
			{
				inout[i][1] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			//printf("%d %d\n",inout[i][0],inout[i][1]);//debug
			for (j = inout[i][0];j < inout[i][1];j++)
			{
				num[j]++;
			}
		}
		max = 0;
		for (i = 0;i < 1000;i++)
		{
			if (max < num[i])
			{
				max = num[i];
			}
		}
		System.out.printf("%d %d",n,max);
		return 0;
	}

}

