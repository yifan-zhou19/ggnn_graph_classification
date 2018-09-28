package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  int n;
	  int i;
	  int y;
	  int m1;
	  int m2;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  int x = 0;
		  int m = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  y = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  m1 = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  m2 = Integer.parseInt(tempVar4);
		  }
		  if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
		  {
			 a[1] = 29;
		  }
		  if (m1 > m2)
		  {
			  m = m1;
			  m1 = m2;
			  m2 = m;
		  }
			for (j = m1 - 1;j < m2 - 1;j++)
			{
			 x += a[j];
			}
		  if (x % 7 == 0)
		  {
			  System.out.print("YES\n");
		  }
		  else
		  {
			  System.out.print("NO\n");
		  }
		a[1] = 28;
	  }
	}
}

