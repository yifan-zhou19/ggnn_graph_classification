package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int m;
	  int i;
	  int j;
	  int t;
	  int l;
	  int x;
	  int y;
	  int a;
	  int b;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  y = m / 2;
	  for (x = 3;x <= y;x++)
	  {
		n = 2 * x;
		for (i = n;x <= i;i--)
		{
		  if (i % 2 != 0)
		  {
		   a = Math.ceil((double)Math.sqrt(i));
		   for (j = 2;j <= a;j++)
		   {
			if (i % j == 0)
			{
			   break;
			}
			else
			{
				if (j == Math.ceil(a))
				{
					  t = n - i;
					  b = Math.ceil((double)Math.sqrt(t));
					  for (l = 2;l <= b;l++)
					  {
						 if (t % l == 0)
						 {
							break;
						 }
						 else
						 {
						   if (l == Math.ceil(b))
						   {
							 System.out.printf("%d=%d+%d\n",n,t,i);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							 goto finish;
						   }
						 }
					  }
				}
			}
		   }
		  }
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 finish:
		 x;
	  }
	}

}

