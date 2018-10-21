public class num
{
	public int hang;
	public int lie;
	public int shu;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int p;
		int q;
		int[][] a = new int[8][8];
		int flag = 0;
		num[] b = tangible.Arrays.initializeWithDefaultnumInstances(8); //b->row max  c->col min
		num[] c = tangible.Arrays.initializeWithDefaultnumInstances(8);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
			p = a[i][0];
			for (j = 0;j < col;j++)
			{
				if (a[i][j] >= p)
				{
					p = a[i][j];
					b[i].shu = p;
					b[i].hang = i;
					b[i].lie = j;
				}
			}
		}
		for (j = 0;j < col;j++)
		{
			q = a[0][j];
			for (i = 0;i < row;i++)
			{
			   if (a[i][j] <= q)
			   {
				   q = a[i][j];
				   c[j].shu = q;
				   c[j].hang = i;
				   c[j].lie = j;
			   }
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{

				if (b[i].shu == c[j].shu)
				{
				   System.out.printf("%d+%d",b[i].hang,b[i].lie);
				   flag = 1;
				   break;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

