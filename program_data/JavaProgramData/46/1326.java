public class node
{
	public int over;
	public int data;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
		int point = 1;
		int heng = 0;
		int zong = 0;
		node[][] x = new node[102][102];
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

		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j].data = Integer.parseInt(tempVar3);
				}
				x[i][j].over = 1;
			}
		}
		System.out.printf("%d\n",x[0][0].data);
		x[0][0].over = 0;
		for (i = 1;i < (row * col);)
		{
			if (point % 4 == 1)
			{
				if (x[heng][zong + 1].over == 1 && (zong + 1) < col)
				{
					zong++;
					System.out.printf("%d\n",x[heng][zong].data);
					x[heng][zong].over = 0;
					i++;
				}
				else
				{
					point++;
				}
			}
			if (point % 4 == 2)
			{
				if (x[heng + 1][zong].over == 1 && (heng + 1) < row)
				{
					heng++;
					System.out.printf("%d\n",x[heng][zong].data);
					x[heng][zong].over = 0;
					i++;
				}
				else
				{
					point++;
				}
			}
			if (point % 4 == 3)
			{
				if (x[heng][zong - 1].over == 1 && (zong - 1) >= 0)
				{
					zong--;
					System.out.printf("%d\n",x[heng][zong].data);
					x[heng][zong].over = 0;
					i++;
				}
				else
				{
					point++;
				}
			}
			if (point % 4 == 0)
			{
				if (x[heng - 1][zong].over == 1 && (heng - 1) >= 0)
				{
					heng--;
					System.out.printf("%d\n",x[heng][zong].data);
					x[heng][zong].over = 0;
					i++;
				}
				else
				{
					point++;
				}
			}
		}
	}
}

