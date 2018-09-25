package <missing>;

public class GlobalMembers
{
	public static int tree(int num,int a)
	{
		int back;
		if (a == 1)
		{
			back = num;
		}
		else if (tree(num, a - 1) % 2 == 0)
		{
			back = tree(num, a - 1) / 2;
		}
		else
		{
			back = (tree(num, a - 1) - 1) / 2;
		}
		return back;
	}
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 1;tree(x, i) > 0;i++)
		{
			for (j = 1;tree(y, j) > 0;j++)
			{
				if (tree(x, i) == tree(y, j))
				{
					System.out.printf("%d",tree(x, i));
					return 0;
				}
			}
		}
			System.out.print("error");
			return 0;
	}
}

