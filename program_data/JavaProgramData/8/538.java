package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * change(int x[100],int y);
		int change = new int(int x[100],int y);
		int a1;
		int a2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt1,*pt2;
		int pt1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt2;
		int pt2;
		int[] b = new int[100];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		pt1 = change(b, a1);
		for (i = 0;i < a2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		pt2 = change(c, a2);
		for (i = 0;i < a1;i++)
		{
			System.out.printf("%d ",*(pt1 + i));
		}
		for (i = 0;i < a2 - 1;i++)
		{
			System.out.printf("%d ",*(pt2 + i));
		}
		System.out.printf("%d",*(pt2 + a2 - 1));
	}
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int * change(int x[100],int y)
	public static int change(int[] x, int y)
	{
		int j;
		int k;
		int temp = 0;
		for (j = 1;j < y;j++)
		{
			for (k = 0;k < y - j;k++)
			{
				if (x[k] > x[k + 1])
				{
					temp = x[k + 1];
					x[k + 1] = x[k];
					x[k] = temp;
				}
			}
		}
		return (x);
	}
}

