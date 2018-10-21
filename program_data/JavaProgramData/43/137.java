package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  int a;
	  int i;
	  for (a = 3;a <= (m / 2);a = a + 2)
	  {
		  int c = 0;
		  for (i = 2;i < a;i++)
		  {
		  if (a % i == 0)
		  {
		  c++;
		  }
		  }
		  int d = 0;
		  for (i = 2;i < m - a;i++)
		  {
		  if ((m - a) % i == 0)
		  {
		  d++;
		  }
		  }


		 if (c == 0 && d == 0)
		 {
		System.out.printf("%d %d\n",a,m - a);
		 }
	  }
	  System.in.read();
	  System.in.read();
	}
}

