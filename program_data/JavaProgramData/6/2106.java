package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int l;
		int[][] number = new int[100][100];
		int num;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = null;
		int p = null;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				for (l = 0;l < n;l++)
				{
					number[j][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			num = 0;
			p = number;
			for (j = 0;j < n;j++) //??????????????
			{
				if (m == 1)
				{
					num += *(p + j); //??????????
				}
				else
				{
					num = num + *(p + j) + *(*(number + m - 1) + j);
				}
			}
			p = number;
			for (j = 1;j < m - 1;j++) //????????????
			{
				if (n == 1)
				{
					num += **(number + j);
				}
				else
				{
					num = num + **(number + j) + *(*(number + j) + n - 1);
				}
			}
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

