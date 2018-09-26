package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int result = 0;
		int p = 0;
		int num;
		int n;
		int i = 1;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		while (i <= n != 0 && n <= 100)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			  if (i == 1)
			  {
				 result = num;
			  }
			  else
			  {
				  if (num > result)
				  {
					 p = result;
					  result = num;
				  }
				  else if (num < result && num> p)
				  {
					  p = num;
				  }
			  }
			   i++;
		}
		System.out.printf("%d\n%d", result,p);
		return 0;
	}
}

