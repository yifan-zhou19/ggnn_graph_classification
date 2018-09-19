package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[][] a = new int[100][100];
	int x;
	int y;
	int x1;
	int y1;
	int s;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	  for (j = 0;j < n;j++)
	  {
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	}
	for (i = 0;i < n;i++)
	{
	  for (j = 0;j < n;j++)
	  {
		if (a[i][j] == 0)
		{
			x = i;
			y = j;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto l;
		}
	  }
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l:
	x1 = x;
	y1 = y;

	   while (x1 < n && a[x1][y] == 0)
	   {
		 x1++;
	   }
	   while (y1 < n && a[x][y1] == 0)
	   {
		 y1++;
	   }
	s = (x1 - x - 2) * (y1 - y - 2);
	//cout<<x1<<y1<<x<<y<<endl ;
	System.out.print(s);
	System.out.print("\n");
	return 0;
	}

}

