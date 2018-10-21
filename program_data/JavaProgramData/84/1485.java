package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int a;
	  int max = 0;
	  int min = 0;
	  int temp = 0;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1; i <= n; i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if (i <= 1)
		{

		  max = max > a != 0?max:a;

		}
		if (max < a && i>1)
		{
		 min = max;
		 max = a;
		}
		if (max > a && min < a && i>1)
		{
		min = a;
		}

	  }
	   System.out.printf("%d\n%d",max,min);

	   return 0;
	}

}

