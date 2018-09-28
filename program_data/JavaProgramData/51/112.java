package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int k;
	int i;
	int j;
	int x;
	int y;
	int z;
	z = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String a = new String(new char[500]);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	m = a.length();
	int[] c = new int[m - n + 1];
	for (i = 0;i < m - n + 1;i++)
	{
		c[i] = 0;
	}
	char[][] b = new char[m - n + 1][n];
	for (i = 0;i < m - n + 1;i++)
	{
	   for (j = 0;j < n;j++)
	   {
		  b[i][j] = a.charAt(j + i);
	   }
	}
	for (i = 0;i < m - n + 1;i++)
	{
	   for (j = i;j < m - n + 1;j++)
	   {
		   x = 0;
		   for (k = 0;k < n;k++)
		   {
			  if (b[i][k] == b[j][k])
			  {
				  x++;
			  }
		   }
		   if (x == n)
		   {
			   c[i]++;
		   }
	   }
	}
	for (i = 0;i < m - n + 1;i++)
	{
	   y = 0;
	   for (j = 0;j < m - n + 1;j++)
	   {
		   if (c[i] >= c[j])
		   {
			   y++;
		   }
	   }
	   if (y == (m - n + 1) && c[i] != 1 && z == 0)
	   {
		  System.out.printf("%d\n",c[i]);
		  z = 1;
	   }
	   if (y == (m - n + 1) && c[i] != 1)
	   {
		  for (j = 0;j < n - 1;j++)
		  {
			  System.out.printf("%c",b[i][j]);
		  }
		  System.out.printf("%c\n",b[i][n - 1]);
	   }
	   if (y == (m - n + 1) && c[i] == 1)
	   {
	   System.out.print("NO");
	   break;
	   }
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		i = Integer.parseInt(tempVar3);
	}
	return 0;
	}


}

