package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int a;
		  int c = 0;
		  for (a = 3;a + 2 <= n;a++)
		  {
		  int b;
		  int i = 0;
		  for (b = 2;b < a;b++)
		  {
							 if (a % b == 0)
							 {
							 i++;
							 }
							 if ((a + 2) % b == 0)
							 {
							 i++;
							 }
							 else
							 {
								 ;
							 }
		  }
							 if (i == 0)
							 {
							 System.out.printf("%d %d\n",a,a + 2);
							 c++;
							 }
							 else
							 {
								 ;
							 }
		  }
							 if (c == 0)
							 {
							 System.out.print("empty\n");
							 }
	}
}

