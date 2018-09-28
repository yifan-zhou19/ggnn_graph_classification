package <missing>;

public class GlobalMembers
{
	public static int convert(int[] pt, int x, int y)
	{
		 int temp;
		 int i;
		 if (x < 0 || x>4 || y < 0 || y>4)
		 {
							   return 0;
		 }
		 else
		 {
			 for (i = 0;i < 5;i++)
			 {
							 temp = (pt[x] + i);
							 *(pt[x] + i) = *(pt[y] + i);
							 *(pt[y] + i) = temp;
			 }
		 }
		 return 1;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int num;
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
		num = convert(a, n, m);
		if (num == 0)
		{
				  System.out.print("error");
		}
		if (num == 1)
		{
				  for (p = a[0];p < a[0] + 25;p++)
				  {
									 if ((p - a[0]) % 5 == 0 && p != a[0])
									 {
													  System.out.print("\n");
													  System.out.printf("%d ", p);
									 }
									 else if ((p - a[0]) % 5 == 4)
									 {
													  System.out.printf("%d", p);
									 }
									 else
									 {
													  System.out.printf("%d ", p);
									 }
				  }
		}
		return 0;
	}

}

