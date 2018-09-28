package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[105][105];
		int flag = 1;
		int loci = 0;
		int locj = 0;
		int row;
		int col;
		int upwall = 0;
		int downwall;
		int rightwall;
		int leftwall = -1;
		int i;
		int j;
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
		rightwall = col;
		downwall = row;
		for (i = 1;i < row * col;)
		{
			if (locj + 1 < rightwall && flag == 1)
			{
				System.out.printf("%d\n",a[loci][locj++]);
				i++;
			}
			else if (locj - 1 > leftwall && flag == 2)
			{
				System.out.printf("%d\n",a[loci][locj--]);
				i++;
			}
			else if (loci + 1 < downwall && flag == 3)
			{
				System.out.printf("%d\n",a[loci++][locj]);
				i++;
			}
			else if (loci - 1 > upwall && flag == 4)
			{
				System.out.printf("%d\n",a[loci--][locj]);
				i++;
			}
			else if (locj + 1 == rightwall && flag == 1)
			{
				rightwall--;
				flag = 3;
			}
			else if (locj - 1 == leftwall && flag == 2)
			{
				leftwall++;
				flag = 4;
			}
			else if (loci + 1 == downwall && flag == 3)
			{
				downwall--;
				flag = 2;
			}
			else if (loci - 1 == upwall && flag == 4)
			{
				upwall++;
				flag = 1;
			}
		}
		System.out.printf("%d\n",a[loci][locj]);
	}
}

