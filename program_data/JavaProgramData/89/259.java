package <missing>;

public class GlobalMembers
{
	public static int[] know = new int[100000];
	public static int[] be_known = new int[100000];
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			int temp1 = 0;
			int temp2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				temp2 = Integer.parseInt(tempVar3);
			}
			if ((temp1 == 0) && (temp2 == 0))
			{
				break;
			}
			else
			{
				know[temp1]++;
				be_known[temp2]++;
			}
		}
		int flag = -1;
		for (int i = 0;i < n;i++)
		{
			if ((know[i] != n - 1) && (be_known[i] == n - 1))
			{
				flag = i;
				break;
			}
		}
		if (flag != -1)
		{
			System.out.printf("%d",flag);
		}
		else
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

