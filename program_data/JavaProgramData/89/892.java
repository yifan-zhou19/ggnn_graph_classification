package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] man = new int[2][1000000];
		int a;
		int b;
		int n;
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		p = man[0];
		q = man[1];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
				break;
			}
			man[0][a]++;
			man[1][b]++;
		}
		for (int i = 0;i < n;i++)
		{
			if (p == 0 && q == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
			}
			p++;
			q++;
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

