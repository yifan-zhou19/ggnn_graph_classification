package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  do
		  {
		  if (n == 1)
		  {
			  System.out.print("End");
			  n = 0;
		  }
		  if (n != 0 && n != 1 && n % 2 == 1)
		  {
			  a = n * 3 + 1;
			  System.out.printf("%d*3+1=%d\n",n,a);
			  n = a;
		  }

	  if (n != 0 && n != 1 && n % 2 == 0)
	  {
			  a = n / 2;
			  System.out.printf("%d/2=%d\n",n,a);
			  n = a;
	  }
	  i++;
		  } while (n != 0);



		return 0;
	}


}

