package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] p = new int[5];
		p = a;
		int[][] max = new int[5][1];
		int[][] min = new int[5][1];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pmax[5]={max[0],max[1],max[2],max[3],max[4]};
		int[] pmax = {max[0], max[1], max[2], max[3], max[4]};
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pmin[5]={min[0],min[1],min[2],min[3],min[4]};
		int[] pmin = {min[0], min[1], min[2], min[3], min[4]};
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0;i < 5;i++)
		{
			pmax[i] = (p[i] + 0);
			pmin[i] = (p[0] + i);
			for (j = 0;j < 5;j++)
			{
				if (pmax[i] < *(p[i] + j))
				{
					pmax[i] = (p[i] + j);
				}
				if (pmin[i] > *(p[j] + i))
				{
					pmin[i] = (p[j] + i);
				}
			}
		}
		int flag = 0;
		for (i = 0;i < 5;i++)
		{
				for (j = 0;j < 5;j++)
				{
				if (pmax[i] == pmin[j] && pmax[i] == *(p[i] + j))
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print((p[i] + j));
					System.out.print("\n");
					flag = 1;
					break;
				}

				}
				if (flag == 1)
				{
					break;
				}
		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

