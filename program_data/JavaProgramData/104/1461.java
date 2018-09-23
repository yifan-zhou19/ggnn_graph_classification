package <missing>;

public class GlobalMembers
{
	public static int tree(int i,int j)
	{
		if (i == j)
		{
			return i;
		}
		if (i > j)
		{
			return tree(i / 2, j);
		}
		if (i < j)
		{
			return tree(j, i);
		}

	}
	public static int Main()
	{
		int i;
		int j;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(tree(i, j));
		return 0;
	}

}

