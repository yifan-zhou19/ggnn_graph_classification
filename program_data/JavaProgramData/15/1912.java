package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[1000][1000];
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][j] = Integer.parseInt(tempVar2);
			}
		}
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
			if (s[i][j] == 0)
			{
				a = i;
				b = j;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto A;
			}
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		A:
		for (i = n - 1;i >= 0;i--)
		{
		for (j = n - 1;j >= 0;j--)
		{
		   if (s[i][j] == 0)
		   {
		   c = i;
		   d = j;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		   goto B;
		   }
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		B:
		sum = (c - a - 1) * (d - b - 1);
		System.out.printf("%d\n",sum);
	}
}

