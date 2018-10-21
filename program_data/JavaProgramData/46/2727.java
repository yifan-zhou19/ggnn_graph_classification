package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	int[][] array = new int[100][100];
	int i;
	int j;
	int a;
	int b;
	int c;
	int d = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
	for (i = 0;i <= row - 1;i++)
	{
		for (j = 0;j <= col - 1;j++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   array[i][j] = Integer.parseInt(tempVar3);
		   }
		}
	}
	c = 0;
	for (a = 0;2 * a <= row != 0 && 2 * a <= col;a++)
	{
		for (b = a;b <= col - 1 - a;b++)
		{
			System.out.printf("%d\n",array[c][b]);
			d++;
		}
		if (d == row * col)
		{
		break;
		}
		b = b - 1;
		for (c = a + 1;c <= row - 1 - a;c++)
		{
			System.out.printf("%d\n",array[c][b]);
		d++;
		}
		if (d == row * col)
		{
		break;
		}
		c = c - 1;
		for (b = col - 2 - a;b >= a;b--)
		{
			System.out.printf("%d\n",array[c][b]);
		d++;
		}
		if (d == row * col)
		{
		break;
		}
		b = b + 1;
		for (c = row - 2 - a;c >= a + 1;c--)
		{
		   System.out.printf("%d\n",array[c][b]);
		d++;
		}
		if (d == row * col)
		{
		break;
		}
		c = c + 1;
	}
	return 0;
	}
}

