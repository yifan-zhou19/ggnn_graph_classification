package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a = 2;
		int b;
		int i = 2;
		int j = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (a <= m / 2)
		{
			int i = 2;
			int j = 2;
			while (i < a)
			{
			  if (a % i != 0)
			  {
			  i++;
			  }
			  else
			  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  goto loop1;
			  }
			}
		  b = m - a;
		  while (j < b)
		  {
			  if (b % j != 0)
			  {
			  j++;
			  }

			  else
			  {
			  break;
			  }

			  if (j == b)
			  {
			  System.out.printf("%d %d\n",a,b);
			  break;
			  }
		  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			loop1:
			a++;
		}

	}
}

