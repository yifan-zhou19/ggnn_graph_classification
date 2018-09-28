package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		int x;
		int m = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		int[] a;
		a = new int[x1 * y1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE) * x1 * y1);
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i * y1 + j] = Integer.parseInt(tempVar3);
			  }
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		int[] b;
		b = new int[x2 * y2];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(b,0,(Integer.SIZE / Byte.SIZE) * x2 * y2);
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
			  String tempVar6 = ConsoleInput.scanfRead();
			  if (tempVar6 != null)
			  {
				  b[i * y2 + j] = Integer.parseInt(tempVar6);
			  }
			}
		}
		int[] c;
		c = new int[x1 * y2];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE) * x1 * y2);
		x = y1 > x2 != 0?x2:y1;
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				for (k = 0;k < x;k++)
				{
				c[i * y2 + j] = c[i * y2 + j] + a[i * y1 + k] * b[k * y2 + j];
				}
			}
		}
		for (i = 0;i < x1 * y2;i++)
		{
			if (m == (y2 - 1))
			{
				m = 0;
				System.out.printf("%d\n",c[i]);
			}
			else
			{
				System.out.printf("%d ",c[i]);
				m++;
			}
		}

	}
}

