import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d;
		int day;
		int row;
		int list;
		int n;
		int sum;
		char[][] A = new char[102][102];
		row = 0;
		while (row < 102)
		{
			list = 0;
			while (LinkedList < 102)
			{
				A[row][list] = '#';
				list++;
			}
			row++;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		row = 1;
		while (row < n + 1)
		{
			list = 1;
			while (LinkedList < n + 1)
			{
				if (list == n)
				{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					A[row][list] = tempVar2.charAt(0);
				}
				}
				else
				{
					String tempVar3 = ConsoleInput.scanfRead(null, 1);
					if (tempVar3 != null)
					{
						A[row][list] = tempVar3.charAt(0);
					}
				}
				list++;
			}
			row++;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			day = Integer.parseInt(tempVar4);
		}
		d = 1;
		while (d < day)
		{
			row = 1;
			while (row < n + 1)
			{
				list = 1;
				while (LinkedList < n + 1)
				{
					if (A[row][list] == '@')
					{
						if (A[row + 1][list] == '.')
						{
							A[row + 1][list] = 'x';
						}
						if (A[row - 1][list] == '.')
						{
							A[row - 1][list] = 'x';
						}
						if (A[row][list + 1] == '.')
						{
							A[row][list + 1] = 'x';
						}
						if (A[row][list - 1] == '.')
						{
							A[row][list - 1] = 'x';
						}
					}
					list++;
				}
				row++;
			}
			row = 1;
			while (row < n + 1)
			{
				list = 1;
				while (LinkedList < n + 1)
				{
					if (A[row][list] == 'x')
					{
						A[row][list] = '@';
					}
					list++;
				}
				row++;
			}
			d++;
		}
		row = 1;
		sum = 0;
		while (row < n + 1)
		{
			list = 1;
			while (LinkedList < n + 1)
			{
				if (A[row][list] == '@')
				{
					sum = sum + 1;
				}
				list++;
			}
			row++;
		}
		System.out.printf("%d",sum);
		return 0;
	}


}

