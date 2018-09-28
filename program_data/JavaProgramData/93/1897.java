package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 char b = '3';
	 char c = '5';
	 char d = '7';
	 char e = 'n';

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
	 {
		 System.out.printf("%s","3 5 7");
	 }
	 else if (a % 3 == 0 && a % 5 == 0)
	 {
		 System.out.printf("%s","3 5");
	 }
	 else if (a % 5 == 0 && a % 7 == 0)
	 {
		 System.out.printf("%s", "5 7");
	 }
	 else if (a % 3 == 0 && a % 7 == 0)
	 {
		 System.out.printf("%s", "3 7");
	 }
	 else if (a % 3 == 0)
	 {
		 System.out.printf("%c",b);
	 }
	 else if (a % 5 == 0)
	 {
		 System.out.printf("%c",c);
	 }
	 else if (a % 7 == 0)
	 {
		 System.out.printf("%c",d);
	 }
	 else
	 {
		 System.out.printf("%c",e);
	 }

	 return 0;

	}
}

