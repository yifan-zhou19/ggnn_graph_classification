package <missing>;

public class GlobalMembers
{
	public static int change(tangible.RefObject<Integer> p3, tangible.RefObject<Integer> p4, int n, int m)
	{
		int[] b = new int[6];
		int i;
		if (m > 4 || n > 4)
		{
			return (0);
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				b[i] = (p3.argValue + i);
				*(p3.argValue + i) = *(p4.argValue + i);
				*(p4.argValue + i) = b[i];
			}
			return (1);
		}
	}


	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int v;
		int[] p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		int[] p = a[0];
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
		p1 = a[n];
		p2 = a[m];
	tangible.RefObject<Integer> tempRef_p1 = new tangible.RefObject<Integer>(p1);
	tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
		v = change(tempRef_p1, tempRef_p2, n, m);
		p2 = tempRef_p2.argValue;
		p1 = tempRef_p1.argValue;
		if (v != 0)
		{
			for (i = 0;i < 5;i++,p++)
			{
				for (j = 0;j < 4;j++,p++)
				{
				System.out.printf("%d ",p[0]);
				}
				System.out.printf("%d",p[0]);
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
		}
	}


}

