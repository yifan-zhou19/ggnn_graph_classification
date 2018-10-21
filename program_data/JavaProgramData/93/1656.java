package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] mm = {3, 5, 7};
		int[] flag = new int[3];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0; i < 3; i++)
		{
			if (n % mm[i] == 0)
			{
				flag[i] = 1;
			}
		}
		int space = -1;
		for (i = 0; i < 3; i++)
		{
			if (flag[i] == 1)
			{
				space++;
				if (space == 0)
				{
					System.out.printf("%d", mm[i]);
				}
				else
				{
					System.out.printf(" %d", mm[i]);
				}
			}
		}
		if (space == -1)
		{
			System.out.print("n");
		}
		System.out.print("\n");
	}
}

