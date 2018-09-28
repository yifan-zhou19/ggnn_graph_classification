package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  i = Integer.parseInt(tempVar);
		  }
		  while (i > 1)
		  {
					if (i % 2 == 0)
					{
							  j = i / 2;
							  System.out.printf("%d/2=%d\n",i,j);
							  i = j;
					}
					 else
					 {
								  j = i * 3 + 1;
								  System.out.printf("%d*3+1=%d\n",i,j);
								  i = j;
					 }
		  }
		  System.out.print("End");
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

