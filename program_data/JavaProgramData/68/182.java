package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int k;
		int p = 1;
		int u = 1;
		int c;
		int x;
		int m;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			m = (int)i / 2;
		   for (j = 3;j <= m;j++)
		   {
			   c = (int)Math.sqrt(j);
					  if (j % 2 == 0)
					  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					   goto loop;
					  }
			   for (k = 3;k <= c;k++)
			   {
				   if (j % k == 0)
				   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					   goto loop;
				   }
			   }
				   x = i - j;
				   y = (int)Math.sqrt(x);
					  for (t = 3;t <= y;t += 2)
					  {
						 if (x % 2 == 0)
						 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto loop;
						 }
						 else if (x % t == 0)
						 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto loop;
						 }

					  }
						   System.out.printf("%d=%d+%d\n",i,j,x);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						   goto er;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   loop:
			   ;
		   }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	er:
	;
		}
		return 0;
	}
}

