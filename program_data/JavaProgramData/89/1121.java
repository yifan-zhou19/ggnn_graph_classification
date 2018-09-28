package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct person
	//	{
	//		int j;
	//		int count;
	//	}
	//	p[10000];
		int n;
		int k = 1;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			p[i].count = 0;
		}
		while (true)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].j = ConsoleInput.readToWhiteSpace(true);
			if (i == 0 && p[i].j == 0)
			{
				break;
			}
			p[p[i].j].count++;
		}
		for (i = 0; i < n; i++)
		{
			if (p[i].count == n - 1)
			{
				System.out.print(i);
				k = 0;
			}
		}
		if (k != 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

