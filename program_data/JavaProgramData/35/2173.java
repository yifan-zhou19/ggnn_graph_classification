package <missing>;

public class GlobalMembers
{
	public static int[][] w = new int[10][10];
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < a;i++)
		{
			for (int j = 0;j < b;j++)
			{
				w[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[] p = new int[10];
		int[] q = new int[10];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(p,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(q,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < a;i++)
		{
			for (int j = 1;j < b;j++)
			{
				if (w[i][j] > w[i][p[i]])
				{
					p[i] = j;
				}
			}
		}

		for (int i = 1;i < a;i++)
		{
			for (int j = 0;j < b;j++)
			{
				if (w[i][j] < w[q[j]][j])
				{
					q[j] = i;
				}
			}
		}

		for (int i = 0;i < a;i++)
		{
			for (int j = 0;j < b;j++)
			{
			if ((p[i] == j) && (q[j] == i))
			{
				System.out.print(i);
				System.out.print('+');
				System.out.print(j);
				System.out.print("\n");
				return 0;
			}
			}
		}

		System.out.print("No");
		System.out.print("\n");
		return 0;
	}


}

