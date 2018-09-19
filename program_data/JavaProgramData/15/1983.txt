package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int[][] an = new int[500][500];
	  int a;
	  int b;
	  int c;
	  int d;
	  int e = 0;
	  int f = 0;
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
			   an[i][j] = Integer.parseInt(tempVar2);
		   }
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n;j++)
		{
		   if (an[i][j] == 0)
		   {
			  a = i;
			  b = j;
			  e = 1;
			  break;
		   }
		}
		if (e == 1)
		{
		break;
		}
	  }
	  for (i = n - 1;i >= 0;i--)
	  {
		for (j = n - 1;j >= 0;j--)
		{
			if (an[i][j] == 0)
			{
			   c = i;
			   d = j;
			   f = 1;
			   break;
			}
		}
		if (f == 1)
		{
		break;
		}
	  }
	  int s;
	  s = (c - a - 1) * (d - b - 1);
	  System.out.printf("%d",s);
	  return 0;
	}
}

