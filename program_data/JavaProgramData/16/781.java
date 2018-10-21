package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 if ((a >= 1000) && (a < 9999))
		 {
			b = a / 1000;
		 c = (a % 1000) / 100;
		 d = (a % 100) / 10;
		 e = a % 10;
		 System.out.printf("%d%d%d%d",e,d,c,b);
		 }
		 if ((a >= 100) && (a < 999))
		 {
			 b = a / 100;
		 c = (a % 100) / 10;
		 d = a % 10;
		 System.out.printf("%d%d%d",d,c,b);
		 }
		 if ((a >= 10) && (a < 99))
		 {
			 b = a / 10;
		 c = a % 10;
		 System.out.printf("%d%d",c,b);
		 }
		 if ((a >= 1) && (a < 9))
		 {
		 System.out.printf("%d",a);
		 }
		 if (a == 0)
		 {
		 System.out.print("0");
		 }
		 if (a == 10000)
		 {
		 System.out.print("00001");
		 }
	}
}

