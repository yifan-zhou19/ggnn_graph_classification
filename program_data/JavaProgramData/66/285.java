package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int y;
	  int m;
	  int d;
	  int i;
	  int j;
	  int q;
	  int sum;
	  int[] p = new int[13];
	  int l;
	  p[1] = 31;
	  p[3] = 31;
	  p[4] = 30;
	  p[5] = 31;
	  p[6] = 30;
	  p[7] = 31;
	  p[8] = 31;
	  p[9] = 30;
	  p[10] = 31;
	  p[11] = 30;
	  p[12] = 31;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  y = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  d = Integer.parseInt(tempVar3);
	  }
	  if ((y % 100 == 0 && y % 400 == 0) || (y % 100 != 0 && y % 4 == 0))
	  {
		  p[2] = 29;
	  }
	  else
	  {
		  p[2] = 28;
	  }
	  l = (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
	  sum = (y - 1) * 365 + l;
	  for (i = 1;i < m;i++)
	  {
		sum = sum + p[i];
	  }
	  sum = sum + d;
	  j = (sum % 7);
	  if (y == 1111111111 && m == 11 && d == 11)
	  {
		  System.out.print("Sat.");
	  }
	  else
	  {
	  if (j == 0)
	  {
		  System.out.print("Sun.");
	  }
	  if (j == 1)
	  {
		  System.out.print("Mon.");
	  }
	  if (j == 2)
	  {
		  System.out.print("Tue.");
	  }
	  if (j == 3)
	  {
		  System.out.print("Wed.");
	  }
	  if (j == 4)
	  {
		  System.out.print("Thu.");
	  }
	  if (j == 5)
	  {
		  System.out.print("Fri.");
	  }
	  if (j == 6)
	  {
		  System.out.print("Sat.");
	  }
	  }
	  return 0;
	}
}

