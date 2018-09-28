package <missing>;

public class GlobalMembers
{
	public static int sushu(int i)
	{
		double c;
			   int e;
			   int l = 0;
			   c = Math.sqrt(i);
			   for (e = 2;e <= c;e++)
			   {
				  if ((i) % e == 0)
				  {
			   break;
				  }
			   }
			   if (e > c)
			   {
			  return 1;
			   }
			  else
			  {
			  return 0;
			  }

	}
	public static int Main()
	{
		int d;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		if (d > 4)
		{
			for (i = 5;i <= d;i++)
			{

			   if (sushu(i) == 1)
			   {
			if (sushu(i - 2) == 1)
			{
				  System.out.printf("%d %d\n",i - 2,i);
			}
			   }
			}
		}

	else
	{
	System.out.print("empty");
	}
	}

}

