package <missing>;

public class GlobalMembers
{
	///#include<stdlib.h>
	///#include<math.h>
	public static int Main()
	{
		int n;
		int i;
		int j;
		char c;
		int row1;
		int row2;
		int col1;
		int col2;
		int[][] a = new int[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row2 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row2;i++)
		{
			for (j = 0;j < col2;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}

		i = 0;
		j = -1;
		c = 'r';
		n = row2 * col2;
		row1 = 0;
		col1 = 0;
		row2 = row2 - 1;
		col2 = col2 - 1;
		while (n != 0)
		{

			switch (c)
			{
			case 'l':
				j--;
				if (j == col1)
				{
					c = 'u';
					row2--;
				}
				break;
			case 'r':
				j++;
				if (j == col2)
				{
					c = 'd';
					row1++;
				}
				break;
			case 'u':
				i--;
				if (i == row1)
				{
					c = 'r';
					col1++;
				}
				break;
			case 'd':
				i++;
				if (i == row2)
				{
					c = 'l';
					col2--;
				}
			}
			System.out.printf("%d\n",a[i][j]);
			n--;
		}



		return 0;
	}

}

