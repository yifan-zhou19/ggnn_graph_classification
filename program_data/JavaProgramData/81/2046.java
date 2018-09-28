package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int n;
	public static int m;
	public static int ser()
	{
		int t;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		if ((n > 4 || n < 0) || (m>4 || m < 0))
		{
			return 0;
		}
		else
		{
			p = a[n];
			q = a[m];
			for (i = 0;i < 5;i++,p++,q++)
			{
				t = p;
				*p = q;
				*q = t;
			}
			return 1;
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;
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
		t = ser();
		if (t == 0)
		{
			System.out.print("error");
		}
		if (t == 1)
		{
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][4]);
			}
		}
	}


}

