package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int[] xx = new int[100];
	int[] yy = new int[100];
	int i = 1;
	int j = 1;
	int k;
	int l;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (x == y)
	{
		 System.out.print(x);
		 return 0;
	}
	if (x == 1 || y == 1)
	{
	   System.out.print(1);
	   return 0;
	}
	xx[0] = x;
	yy[0] = y;
	while (x != 0)
	{
	  xx[i] = x / 2;
	  x /= 2;
	  i++;
	}
	while (y != 0)
	{
	  yy[j] = y / 2;
	  y /= 2;
	  j++;
	}

	for (k = 0;k < i;k++)
	{
	  for (l = 0;l < j;l++)
	  {
		if (xx[k] == yy[l])
		{
		  break;
		}
	  }
	  if (xx[k] == yy[l])
	  {
		  break;
	  }
	}
	System.out.print(xx[k]);

	return 0;
	}

}

