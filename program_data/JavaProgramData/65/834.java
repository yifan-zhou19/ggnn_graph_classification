package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] num = new int[n][2];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (num[i][1] - num[i][0] == 1 || num[i][0] - num[i][1] == 2)
			{
				a++;
			}
			if (num[i][0] - num[i][1] == 1 || num[i][1] - num[i][0] == 2)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		if (b > a)
		{
			System.out.print("B");
		}
		return 0;
	}




}

