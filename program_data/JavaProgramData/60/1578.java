package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int x;
	  int i;
	  int j;
	  int k;
	  int a;
	  int b;
	  int sum = 0;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	  for (i = 2;i < x - 1;i++)
	  {
		  a = 1;
		  b = 1;
		  for (j = 2;j < i;j++)
		  {
			  if (i % j == 0)
			  {
			  a = 0;
			  }
		  }
		  for (j = 2;j < i + 2;j++)
		  {
			  if ((i + 2) % j == 0)
			  {
			  b = 0;
			  }
		  }
		  if ((a * b) != 0)
		  {
			  System.out.printf("%d %d\n",i,i + 2);
		  sum++;
		  }
	  }
	  if (sum == 0)
	  {
	  System.out.print("empty");
	  }
	  return 0;


	}

}

