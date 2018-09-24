package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int s;
		int i;
		int n;
		int j;
		int a1;
		int b1;
		int a2;
		int b2;
		int p = 0;
		int l;
		int w;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i = i + 1)
	{
	  for (j = 0;j < n;j = j + 1)
	  {
	   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	}
	for (i = 0;i < n;i = i + 1)
	{
		 if (p == 0)
		 {
	  for (j = 0;j < n;j = j + 1)
	  {
		   if (a[i][j] == 0)
		   {
			   a1 = i;
			   b1 = j;
			   p = p + 1;
		   }
	  }
		 }
	}
	p = 0;
	for (i = n - 1;i >= 0;i--)
	{
		if (p == 0)
		{
	 for (j = n - 1;j >= 0;j = j - 1)
	 {
		  if (a[i][j] == 0)
		  {
			  a2 = i;
			  b2 = j;
			  p = p + 1;
		  }
	 }
		}
	}
	l = b2 - b1 + 1;
	w = a1 - a2 + 1;
	s = w * l;
	System.out.print(s);
	return 0;

	}
}

