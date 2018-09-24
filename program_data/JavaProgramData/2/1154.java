package <missing>;

public class GlobalMembers
{
	public static int Book_num(String a)
	{
		int j;
		int num;
		j = 1;
		if ((j = 1) != 0 && a[j].equals(' '))
		{
			num = a[0] - 48;
		}
		else
		{
			j++;
		}
		if ((j = 2) != 0 && a[j].equals(' '))
		{
			num = a[1] - 48 + (a[0] - 48) * 10;
		}
		else
		{
			j++;
		}
		if ((j = 3) != 0 && a[j].equals(' '))
		{
			num = a[2] - 48 + (a[1] - 48) * 10 + (a[0] - 48) * 100;
		}
		return num;
	}

	public static int Main()
	{
		int m;
		int bk1;
		int i;
		int max;
		int j;
		int wrt;
		int[][] author = new int[26][999];
		char[][] data = new char[999][30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			data[i] = new Scanner(System.in).nextLine();
			data[i][String.valueOf(data[i]).length()] = '\0';
		}
		max = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;data[i][j] != '\0';j++)
			{
				if (data[i][j] > 64)
				{
					wrt = data[i][j] - 65;
					for (bk1 = 0;author[wrt][bk1] != 0;bk1++)
					{
						;
					}
					author[wrt][bk1] = Book_num(data[i]);
					if (bk1 > max)
					{
						max = bk1;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (author[i][max] != 0)
			{
				System.out.printf("%c\n",i + 65);
				System.out.printf("%d\n",max + 1);
				for (j = 0;j <= max;j++)
				{
					System.out.printf("%d\n",author[i][j]);
				}
				break;
			}
		}
		return 0;
	}




}

