package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int i;
	   int max;
	   int second = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   max = m;
	   i = 0;
	   while (i < 300)
	   {
						  String tempVar2 = ConsoleInput.scanfRead(",");
						  if (tempVar2 != null)
						  {
							  m = Integer.parseInt(tempVar2);
						  }
						  if (m > max)
						  {
						  second = max;
						  max = m;
						  }
						  else if (m < max && m> second)
						  {
						  second = m;
						  }
						  i = i + 1;
	   }
	   if (second == 0)
	   {
	   System.out.print("No");
	   }
	   else
	   {
	   System.out.printf("%d\n",second);
	   }
	   return 0;
	}

}

