package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 3;i <= (n / 2);i = i + 2)
	  {
		a = Math.sqrt(i);
		b = 1;
		for (j = 2;j <= a;j++)
		{
			if (i % j == 0)
			{
				b = j;
			}
		}
		if (b == 1)
		{
		 c = n - i;
		 d = Math.sqrt(c);
		 e = 1;
		 for (j = 2;j <= d;j++)
		 {
			 if (c % j == 0)
			 {
				 e = j;
			 }
		 }
		 if (e == 1)
		 {
			 System.out.printf("%d %d\n",i,c);
		 }
		}
	  }
	}
}

