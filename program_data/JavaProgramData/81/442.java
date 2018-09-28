package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[][] b = new int[5][5];
		int n;
		int m;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *point;
		int point;
		int change = new int(int * p,int m,int n);
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		point = b[0][0];
	tangible.RefObject<Integer> tempRef_point = new tangible.RefObject<Integer>(point);
		if (change(tempRef_point, m, n) == 0)
		{
			point = tempRef_point.argValue;
			System.out.print("error");
		}
		else
		{
			point = tempRef_point.argValue;
			for (i = 0;i < 5;i++)
			{
			   for (j = 0;j < 5;j++)
			   {
				   if (j == 0)
				   {
					   System.out.printf("%d",b[i][j]);
				   }
				   else
				   {
					   System.out.printf(" %d",b[i][j]);
				   }
			   }
			   System.out.print("\n");
			}
		}
	}
	public static int change(tangible.RefObject<Integer> p, int x, int y)
	{
		int z;
		int g;
		int temp;
		if (x >= 0 && x < 5 && y >= 0 && y < 5)
		{
			z = 1;
			for (g = 0;g < 5;g++)
			{
				temp = (p.argValue + g + 5 * x);
				*(p.argValue + g + x * 5) = *(p.argValue + g + y * 5);
				*(p.argValue + g + y * 5) = temp;
			}
		}
		else
		{
			z = 0;
		}
		return (z);
	}
}

