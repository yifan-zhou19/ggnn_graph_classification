import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] A = new int[5][5];
		int m;
		int n;
		int row;
		int list;
		int i;
		row = 0;
		while (row < 5)
		{
			list = 0;
			while (LinkedList < 5)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					A[row][list] = Integer.parseInt(tempVar);
				}
				list++;
			}
			row++;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m < 0 || n < 0 || m>4 || n>4)
		{
			System.out.print("error");
		}
		else
		{
			i = 0;
			while (i < 5)
			{
				row = A[m][i];
				A[m][i] = A[n][i];
				A[n][i] = row;
				i++;
			}
			row = 0;
			while (row < 5)
			{
				list = 0;
				while (LinkedList < 5)
				{
					if (list == 4)
					{
						System.out.printf("%d\n",A[row][list]);
					}
					else
					{
					System.out.printf("%d ",A[row][list]);
					}
					list++;
				}
				row++;
			}
		}
		return 0;
	}


}

