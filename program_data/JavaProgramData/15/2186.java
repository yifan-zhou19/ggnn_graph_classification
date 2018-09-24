package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] pp;
	int n;
	int i;
	int j;
	int k = 0;
	int t = 0;
	int b;
	int c;
	int area;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	pp = new int[n];
	for (i = 0;i < n;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	pp[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pp[i][j] = Integer.parseInt(tempVar2);
			}
		}
	}
	for (i = 1;i < n - 1;i++)
	{
		for (j = 1;j < n - 1;j++)
		{
			if (pp[i - 1][j] - pp[i][j] == 255 && pp[i][j - 1] - pp[i][j] == 255)
			{
			k = i;
			t = j;
			}
			if (pp[i][j + 1] - pp[i][j] == 255 && pp[i + 1][j] - pp[i][j] == 255)
			{
			b = i;
			c = j;
			}
		}
	}
	area = (b - k - 1) * (c - t - 1);
	System.out.printf("%d\n",area);
	for (i = 0;i < n;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(pp[i]);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(pp);
	return 0;
	}

}

