public class map
{
	public int file;
	public int flag;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		map[][] a = new map[200][200];
		int count = 0;
		int i;
		int j;
		int col;
		int row;
		char direction = 'd';
		for (i = 1;i <= 200;i++)
		{
			for (j = 1;j <= 200;j++)
			{
				a[i - 1][j - 1].flag = 0;
			}
		}
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
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j].file = Integer.parseInt(tempVar3);
				}
				a[i][j].flag = 1;
			}
		}
		i = 1;
		j = 1;
		do
		{
			count++;
			switch (direction)
			{
			case'd':
				a[i][j].flag = 0;
				if (a[i][j + 1].flag == 1)
				{
					System.out.printf("%d\n",a[i][j].file);
					j++;
				}
				else
				{
					System.out.printf("%d\n",a[i][j].file);
					direction = 's';
					i++;
				}
				break;
			case's':
				a[i][j].flag = 0;
				if (a[i + 1][j].flag == 1)
				{
					System.out.printf("%d\n",a[i][j].file);
					i++;
				}
				else
				{
					System.out.printf("%d\n",a[i][j].file);
					direction = 'a';
					j--;
				}
				break;
			case'a':
				a[i][j].flag = 0;
				if (a[i][j - 1].flag == 1)
				{
					System.out.printf("%d\n",a[i][j].file);
					j--;
				}
				else
				{
					System.out.printf("%d\n",a[i][j].file);
					direction = 'w';
					i--;
				}
				break;
			case'w':
				a[i][j].flag = 0;
				if (a[i - 1][j].flag == 1)
				{
					System.out.printf("%d\n",a[i][j].file);
					i--;
				}
				else
				{
					System.out.printf("%d\n",a[i][j].file);
					direction = 'd';
					j++;
				}
				break;
			default:
				break;
			}
		}while (count != row * col);
	}
}

