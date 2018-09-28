package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int c;
		 int d;
		 int i;
		 int j;
		 String f = new String(new char[90]);
		 String g = new String(new char[20]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 g = new Scanner(System.in).nextLine();
		 for (i = 0;i < a;i++)
		 {
						 f = new Scanner(System.in).nextLine();
						 if (f.charAt(0) == '_')
						 {
									 d = 0;
									 for (j = 1;j < 90;j++)
									 {
										 if ((f.charAt(j) >= '0' && f.charAt(j) <= '9') || (f.charAt(j) >= 'a' && f.charAt(j) <= 'z') || (f.charAt(j) >= 'A' && f.charAt(j) <= 'Z') || f.charAt(j) == '_')
										 {
											 ;
										 }
										 else if (f.charAt(j) == '\0')
										 {
										 break;
										 }
										 else
										 {
											  System.out.print("0\n");
											  d = 1;
											  break;
										 }
									 }
						 if (d == 0)
						 {
						 System.out.print("1\n");
						 }
						 }
						 else if ((f.charAt(0) >= 'a' && f.charAt(0) <= 'z') || (f.charAt(0) >= 'A' && f.charAt(0) <= 'Z'))
						 {
									 d = 0;
									 for (j = 1;j < 90;j++)
									 {
										 if ((f.charAt(j) >= '0' && f.charAt(j) <= '9') || (f.charAt(j) >= 'a' && f.charAt(j) <= 'z') || (f.charAt(j) >= 'A' && f.charAt(j) <= 'Z') || f.charAt(j) == '_')
										 {
											 ;
										 }
										 else if (f.charAt(j) == '\0')
										 {
										 break;
										 }
										 else
										 {
											  System.out.print("0\n");
											  d = 1;
											  break;
										 }
									 }
						 if (d == 0)
						 {
						 System.out.print("1\n");
						 }
						 }
						 else
						 {
						 System.out.print("0\n");
						 }
		 }
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}

}

