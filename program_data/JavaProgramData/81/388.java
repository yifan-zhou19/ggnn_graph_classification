package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int cha(int k,int t)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2,temp,j;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		int temp;
		int j;
		if (k > 4 || k < 0 || t>4 || t < 0)
		{
			return (0);
		}
		else
		{
			p1 = a[k];
			p2 = a[t];
			for (j = 0;j < 5;j++)
			{
				temp = (p1 + j);
			   *(p1 + j) = *(p2 + j);
			   *(p2 + j) = temp;
			}
			return (1);
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (cha(n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
			System.out.printf("%d %d %d %d %d",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			System.out.print("\n");
			}
		}
		if (cha(n, m) == 0)
		{
			System.out.print("error\n");
		}
	}


}

