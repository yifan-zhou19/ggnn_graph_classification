package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] t = new int[100][6];
		int i;
		int a;
		int b;
		int[] result = new int[100];
		int k;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				t[i][3] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				t[i][4] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				t[i][5] = Integer.parseInt(tempVar6);
			}
			if (t[i][0] == 0 && t[i][1] == 0)
			{
				break;
			}
			a = t[i][0] * 60 * 60 + t[i][1] * 60 + t[i][2];
			b = (12 + t[i][3]) * 60 * 60 + t[i][4] * 60 + t[i][5];
			result[i] = b - a;
		}
		k = i;
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",result[i]);
		}
		return 0;
	}

}

