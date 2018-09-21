package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int max;
	  int max2;
	  int x;
	  max2 = -1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  max = Integer.parseInt(tempVar);
	  }
	  while (scanf(",") != EOF)
	  {
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	if (x > max)
	{
	max2 = max;
	max = x;
	continue;
	}
	if ((x > max2) && (x < max))
	{
		max2 = x;
	}
	  }


	if (max2 < 0)
	{
		System.out.print("No");
	}
	else
	{
		System.out.printf("%d",max2);
	}
	}
}

