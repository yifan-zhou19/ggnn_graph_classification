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
		 int b;
		 if (a == 0)
		 {
			 System.out.print("0\n");
		 }
		 else
		 {
			 while (a != 0)
			 {
					b = a % 10;
					a = a / 10;
					System.out.printf("%d",b);
			 }
			 System.out.print("\n");
		 }
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}



}

