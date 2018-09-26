package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= a;i++)
		{
			int m;
			int n;
			int t = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] x = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
			int p;
			for (int i = 0;i < m;i++) //??
			{
				for (int j = 0;j < n;j++) //??
				{
					*(*(x + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			if (m == 1 && n == 1)
			{
				System.out.print((x));
				System.out.print("\n");
			} //???????
			if (m == 1 && n != 1) //?????
			{
				for (int j = 0;j < n;j++)
				{
					t = t + *((x) + j);
				}
			   System.out.print(t);
			   System.out.print("\n");
			}
			if (m != 1 && n == 1) //?????
			{
				for (int i = 0;i < m;i++)
				{
					t = t + *(*(x + i));
				}
				System.out.print(t);
				System.out.print("\n");
			}
			if (m != 1 && n != 1) //?????
			{
			for (int j = 0;j < n;j++)
			{
				t = t + *((x) + j); //???
			}
			for (int j = 0;j < n;j++)
			{
				t = t + *(*(x + m - 1) + j); //????
			}
			for (int i = 0;i < m;i++)
			{
				t = t + *(*(x + i) + 0); //???
			}
			for (int i = 0;i < m;i++)
			{
				t = t + *(*(x + i) + n - 1); //????
			}
			System.out.print(t - *(*(x + 0) + 0) - *(*(x + 0) + n - 1) - *(*(x + m - 1) + 0) - *(*(x + m - 1) + n - 1));
			System.out.print("\n");
			}
		}
			return 0;
	}

}

