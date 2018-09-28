package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct people
	//	{
	//		int k;
	//		int kn;
	//	}
	//	p[10001];
		int n;
		int p1;
		int p2;
		int m = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			p[i].k = 0;
			p[i].kn = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n * n;i++)
		{
			p1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p1 == 0 && p2 == 0)
			{
				break;
			}
			else
			{
				p[p1].k++;
				p[p2].kn++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].k == 0 && p[i].kn == n - 1)
			{
				m++;
				System.out.print(i);
			}
		}
		if (m == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}


}

