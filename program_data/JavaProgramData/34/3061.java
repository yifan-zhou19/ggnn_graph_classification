package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  while (a > 1)
		  {
				if (a % 2 == 0)
				{
				System.out.printf("%d",a);
				a = a / 2;
				System.out.printf("/2=%d\n",a);
				}
				else
				{
				System.out.printf("%d",a);
				a = a * 3 + 1;
				System.out.printf("*3+1=%d\n",a);
				}
		  }
		  System.out.print("End\n");
				System.in.read();
				System.in.read();
				System.in.read();
				System.in.read();
				System.in.read();
	}

}

