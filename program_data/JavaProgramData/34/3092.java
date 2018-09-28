package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  i = Integer.parseInt(tempVar);
		  }
		  while (i != 1)
		  {
					 if (i == 1)
					 {
						 break;
					 }
					 else if (i % 2)
					 {
						 a = 3 * i + 1;
					 System.out.printf("%d*3+1=%d\n",i,a);
					 i = a;
					 continue;
					 }
					 else
					 {
					 a = i / 2;
					 System.out.printf("%d/2=%d\n",i,a);
					 i = a;
					 }

		  }
					 System.out.print("End");
					 System.in.read();
					 System.in.read();
					 System.in.read();
	}
}

