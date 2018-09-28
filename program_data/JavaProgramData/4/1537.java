package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int r;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100];
		int[] p = new int[100];
		int i;
		int j;
		int v;
		for (i = 0;i < 100;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(p[i] + j) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (v = 0;v <= r + c - 2;v++)
		{
			for (i = 0;i <= v;i++)
			{
				if (i < r)
				{
					j = v - i;
					if (j < c)
					{
						System.out.printf("%d\n",*(p[i] + j));
					}
				}
			}
		}
	}

}

