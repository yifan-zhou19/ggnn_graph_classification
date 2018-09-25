package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] p;
		p = new int[n];
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (p[i][j] == 0)
				{
				if (p[i][j] != p[i - 1][j] && p[i][j] != p[i][j - 1])
				{
					a = i,b = j;
					break;
				}
				if (p[i][j] != p[i + 1][j] && p[i][j] != p[i][j + 1])
				{
					c = i,d = j;
					break;
				}
				}
			}
		}
		s = (c - a - 1) * (d - b - 1);
		System.out.printf("%d\n",s);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);


		return 0;
	}

}

