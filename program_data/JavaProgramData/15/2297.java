package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int b;
		int c;
		int s;
		int y = 0;
		int[][] a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][j] = Integer.parseInt(tempVar2);
		}
		}
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
						if (a[i][j] == 0)
						{
						   m = i + 1;
						k = j + 1;
						y = 1;
						break;
						}
						if (y == 1)
						{
						break;
						}
		}
		}
						y = 0;
		for (i = n - 1;i >= 0;i--)
		{
		for (j = n - 1;j >= 0;j--)
		{
						   if (a[i][j] == 0)
						   {
							   b = i + 1;
						   c = j + 1;
						   y = 1;
						   break;
						   }
						   if (y == 1)
						   {
						break;
						   }
		}
		}
		s = (b - m - 1) * (c - k - 1);
		System.out.printf("%d",s);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
						free(a[i]);
						a[i] = 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
						free(a);
						a = 0;


	}

}

