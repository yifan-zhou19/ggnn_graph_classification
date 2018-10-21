package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (int i = 1;i < 1000;i++)
	  {
		if (n != 1 && n % 2 == 0)
		{
		  a = n;
		  n = n / 2;
		  System.out.printf("%d/2=%d\n",a,n);
		}
		else if (n != 1 && n % 2 != 0)
		{
		  a = n;
		  n = n * 3 + 1;
		  System.out.printf("%d*3+1=%d\n",a,n);
		}
		else if (n == 1)
		{
		  System.out.print("End\n");
		  break;
		}
	  }

	  return 0;
	}
}

