package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int t;
		int s;
		int p;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (n != 1)
	  {
		  if (n % 2 == 0)
		  {
			System.out.printf("%d/2=%d",n,n / 2);

		n = n / 2;
		  }
		else if (n % 2 != 0)
		{
		System.out.printf("%d*3+1=%d",n,n * 3 + 1);
		n = n * 3 + 1;
		}
		System.out.print("\n");
	  }
	  System.out.print("End");
	}
}

