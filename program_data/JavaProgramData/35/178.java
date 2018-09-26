package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int z = 0;
		int i;
		int j;
		int m1;
		int n1;
		int m2;
		int n2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			p = a[i];
			for (j = 0;j < n;j++)
			{
				if (p < a[i][j])
				{
					p = a[i][j];
					m1 = i;
					n1 = j;
				}
			}
			q = p - 100 * i;
			for (j = 0;j < m;j++)
			{
				if (*q < p)
				{
					break;
				}
				else
				{
					q = q + 100;
				}
			}
			if (j == m)
			{
				z = 1;
				m2 = m1;
				n2 = n1;
			}
		}
		if (z == 1)
		{
			System.out.printf("%d+%d",m2,n2);
		}
		else
		{
			System.out.print("No");
		}
	}

}

