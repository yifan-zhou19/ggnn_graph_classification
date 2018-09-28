package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int j;
	  int m;
	  int a;
	  int b;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 3;i <= m / 2;i++)
	  {
	  j = m - i;
	  for (a = 2;a <= Math.sqrt(i);a = a + 1)
	  {
	 if (i % a == 0)
	 {
		 break;
	 }
	  }
	  for (b = 2;b <= Math.sqrt(j);b = b + 1)
	  {
	 if (j % b == 0)
	 {
		 break;
	 }
	  }
	if (a > Math.sqrt(i) && b > Math.sqrt(j))
	{
		System.out.printf("%d %d\n",i,j);
	}
	  }
	}


}

