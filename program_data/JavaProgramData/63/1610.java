package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=null;
		int b = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c=null;
		int c = null;
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
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
		a = new int[x1 * y1];
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y1;j++)
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (int)malloc(x2 * y2 * (Integer.SIZE / Byte.SIZE));

		for (int i = 0;i < x2;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i * y2 + j] = tempVar6;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (int)malloc(x1 * y2 * (Integer.SIZE / Byte.SIZE));
			int sum = 0;
		  for (int i = 0;i < x1;i++)
		  {
			for (int j = 0;j < y2;j++)
			{
				sum = 0;
				for (int k = 0;k < y1;k++)
				{
					sum = sum + a[i * y1 + k] * b[k * y2 + j];
				}
				c[i * y2 + j] = sum;
			}
		  }
		  for (int i = 0;i < x1;i++)
		  {
			int j;
			for (j = 0;j < y2 - 1;j++)
			{
				System.out.printf("%d ",c[i * y2 + j]);
			}
			System.out.printf("%d",c[i * y2 + j]);
			System.out.print("\n");
		  }
	}
}

