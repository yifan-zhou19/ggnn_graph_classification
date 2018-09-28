package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static trans(int[][] a, int n, int m)
	{
		if (n > 4 || m > 4 || n < 0 || m < 0)
		{
			return 0;
		}
		else
		{
			int[] p = new int[5];
			(int)(*q)[5];
			int i;
			int k;
			p = a + m;
			q = a + n;
			for (i = 0;i < 5;i++)
			{
				k = (p[0] + i);
				*(p[0] + i) = *(*q + i);
				*(*q + i) = k;
			}
		}
			return 1;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] p = a;
		int i;
		int j;
		int k;
		int l;
		int s;
		for (k = 0;k < 5;k++)
		{
			for (l = 0;l < 5;l++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(p[k] + l) = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		s = trans(a,i,j);
		if (s == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (k = 0;k < 5;k++)
			{
				 System.out.printf("%d",a[k][0]);
				 for (l = 1;l < 5;l++)
				 {
					 System.out.printf(" %d",*(p[k] + l));
				 }
				 System.out.print("\n");
			}
		}
	}


}

