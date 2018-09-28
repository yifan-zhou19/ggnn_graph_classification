package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j;
	  int a;
	  int b;
	  char aa;
	  char bb;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 6;i <= n;)
	  {
		  for (a = 3;a <= i / 2;)
		  {
			  b = i - a;
			  aa = bb = 'y';
			  for (j = 3;j <= Math.sqrt(a);)
			  {
				  if (a % j == 0)
				  {
					  aa = 'n';
					  break;
				  }
				  j = j + 2;
			  }
			  if (aa == 'y')
			  {
			  for (j = 3;j <= Math.sqrt(b);)
			  {
				  if (b % j == 0)
				  {
					  bb = 'n';
					  break;
				  }
				  j = j + 2;
			  }
			  }
			  if (aa == 'y' && bb == 'y')
			  {
				  System.out.printf("%d=%d+%d",i,a,b);
				  System.out.print("\n");
				  break;
			  }
			  a = a + 2;
		  }
		  i = i + 2;
	  }
	}
}

