package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int h1 = 0;
		int l1 = 0;
		int h2 = 0;
		int l2 = 0;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n][n];
		for (i = 0;i <= n - 1;i++) //??
		{
			for (j = 0;j <= n - 1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
			   if (a[i][j] == 0)
			   {
				   h1 = i + 1;
				   l1 = j + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				   goto loop;
			   }
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (i = n - 1;i >= 0;i--)
	{
			   for (j = n - 1;j >= 0;j--)
			   {
				  if (a[i][j] == 0)
				  {
					  h2 = i + 1;
					  l2 = j + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					  goto loop2;
				  }
			   }
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop2:
	s = (h2 - h1 - 1) * (l2 - l1 - 1);
	System.out.print(s);
	return 0;
	}
}

