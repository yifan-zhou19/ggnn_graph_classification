package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		int counter;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		counter = row * col;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		row -= 1;
		col -= 1;
		for (i = 0;i <= row / 2;i++)
		{
			for (j = i;j <= col - i;j++)
			{
				System.out.printf("%d\n",a[i][j]);
				counter--;
				if (counter == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
			j--;
			for (i += 1;i <= row - (col - j);i++)
			{
				System.out.printf("%d\n",a[i][j]);
				counter--;
				if (counter == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
			i--;
			for (j -= 1;j >= row - i;j--)
			{
				System.out.printf("%d\n",a[i][j]);
				counter--;
				if (counter == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
			j++;
			for (i -= 1;i > j;i--)
			{
				System.out.printf("%d\n",a[i][j]);
				counter--;
				if (counter == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		;
	}
}

