package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a;
		int[][] b;
		int[][] c;
		int i;
		int j;
		int k;
		//printf("intput x1,y1?");
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
	   // printf("intput Array A(%d,%d):\n", x1, y1);
		a = new int[x1];
		for (i = 0;i < x1;++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * y1);
			for (j = 0;j < y1;++j)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		System.out.print("\n");

	   // printf("intput x2,y2:");
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		if (y1 != x2)
		{
			System.out.print("Wrong parameter.");
			for (i = 0;i < x1;++i)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(a[i]);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a);
			return 0;
		}
	  //  printf("intput Array A(%d,%d):\n", x2, y2);
		b = new int[x2];
		for (i = 0;i < x2;++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			b[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * y2);
			for (j = 0;j < y2;++j)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		System.out.print("\n");

		c = new int[x1];
		for (i = 0;i < x1;++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			c[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * y2);
			for (j = 0;j < y2;++j)
			{
				c[i][j] = 0;
				for (k = 0;k < y1;++k)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for (i = 0;i < x1;++i)
		{ //??c
			for (j = 0;j < y2 - 1;++j)
			{
				System.out.printf("%d ", c[i][j]);

			}
	System.out.print(c[i][y2 - 1]);
			System.out.print("\n");
		}

		//????
		for (i = 0;i < x1;++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a[i]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(c[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(c);

		for (i = 0;i < x2;++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(b[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);

		return 0;
	}
}

