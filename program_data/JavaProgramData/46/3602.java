package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int h;
	  int l;
	  int i;
	  int j;
	  int k = 0;
	  int n;
	  int m = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  h = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  l = Integer.parseInt(tempVar2);
	  }
	  int[][] p = new int[h][l];
	  for (i = 0;i < h;i++)
	  {
		for (j = 0;j < l;j++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  p[i][j] = Integer.parseInt(tempVar3);
		  }
		}
	  }
	  i = 0;
	  j = 0;
	for (n = 0;;)
	{
	  while (j < l - k)
	  {
		if (n == h * l - 1)
		{
			System.out.printf("%d",p[i][j]);
			m = 1;
			break;
		}
		else
		{
			System.out.printf("%d\n",p[i][j]);
			n++;
		}
		j++;
	  }
	  j--;
	  i++;
	  if (m == 1)
	  {
		  break;
	  }
	  while (i < h - k)
	  {
		if (n != h * l - 1)
		{
			System.out.printf("%d\n",p[i][j]);
			n++;
		}
		else
		{
			System.out.printf("%d",p[i][j]);
			m = 1;
			break;
		}
		i++;
	  }
	  i--;
	  j--;
	  if (m == 1)
	  {
		  break;
	  }
	  while (j - k >= 0)
	  {
		if (n != h * l - 1)
		{
			System.out.printf("%d\n",p[i][j]);
			n++;
		}
		else
		{
			System.out.printf("%d",p[i][j]);
			m = 1;
			break;
		}
		j--;
	  }
	  j++;
	  i--;
	  k++;
	  if (m == 1)
	  {
		  break;
	  }
	  while (i - k >= 0)
	  {
		if (n != h * l - 1)
		{
			System.out.printf("%d\n",p[i][j]);
			n++;
		}
		else
		{
			System.out.printf("%d",p[i][j]);
			m = 1;
			break;
		}
		i--;
	  }
	  i++;
	  j++;
	  if (m == 1)
	  {
		  break;
	  }
	}
	  return 0;
	}




}

