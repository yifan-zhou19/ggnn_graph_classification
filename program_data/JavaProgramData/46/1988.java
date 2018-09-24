package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
	int row;
	int col;
	int i = 0;
	int j = 0;
	int left = 0;
	int right = 0;
	int up = 0;
	int down = 0;
	int x = 0;
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
	down = row;
	right = col;
	for (; i < row; i++)
	{
	for (j = 0; j < col; j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	i = 0,j = 0;
	for (; ;)
	{
	for (; j < right; j++)
	{
	System.out.printf("%d\n",a[i][j]);
	x++;
	}
	j--;
	if (x >= col * row)
	{
	break;
	}
	i++;
	for (; i < down; i++)
	{
	System.out.printf("%d\n",a[i][j]);
	x++;
	}
	i--;
	if (x >= col * row)
	{
	break;
	}
	j--;
	for (; j >= left; j--)
	{
	System.out.printf("%d\n",a[i][j]);
	x++;
	}
	j++;
	if (x >= col * row)
	{
	break;
	}
	i--;
	for (; i > up; i--)
	{
	System.out.printf("%d\n",a[i][j]);
	x++;
	}
	if (x >= col * row)
	{
	break;
	}
	i++;
	j++;
	right--;
	left++;
	up++;
	down--;
	}
	return 0;
	}
}

