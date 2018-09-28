package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a[101][101],lie,hang,i,j,h,l;
		int[][] a = new int[101][101];
		int lie;
		int hang;
		int i;
		int j;
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= hang;i++)
		{
			for (j = 1;j <= lie;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				a[i][j] = (int)malloc((Integer.SIZE / Byte.SIZE));
			}
		}

		for (i = 1;i <= hang;i++)
		{
			for (j = 1;j <= lie;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 1;j <= lie;j++)
		{
			h = 1;
			l = j;
			while (l >= 1 && h <= hang)
			{
				System.out.printf("%d\n",a[h][l]);
				h++;
				l--;
			}
		}
		for (i = 2;i <= hang;i++)
		{
			l = lie;
			h = i;
			while (l >= 1 && h <= hang)
			{
				System.out.printf("%d\n",a[h][l]);
				h++;
				l--;
			}
		}
	}
}

