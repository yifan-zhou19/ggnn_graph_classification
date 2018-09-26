package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int i;
		 int j;
		 int a;
		 int b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		 for (i = 1;i <= m / 2;i++)
		 {
				   a = 2;
			  while (i % a != 0 && a <= i)
			  {
				a++;
			  }
			 if (a == i)
			 {
						b = 2;
			   while (((m - i) % b != 0) && (b <= m - i))
			   {
				  b++;
			   }
			 if (b == m - i)
			 {
			   System.out.printf("%d %d\n",i,m - i);
			 }
			 }
		 }
		return 0;
	}
}

