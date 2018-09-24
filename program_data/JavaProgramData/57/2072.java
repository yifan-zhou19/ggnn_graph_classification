package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int n;
		 int j = 1;
		 int i;
		 int len;
	  String a = new String(new char[200]);
	  final String b = "";
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	while (j <= n)
	{
		 a = new Scanner(System.in).nextLine();
		 len = a.length();
	 if (a.charAt(len - 1) == 'r' || a.charAt(len - 1) == 'y')
	 {
	  for (i = 0;i <= len - 3;i++)
	  {
		  System.out.printf("%c",a.charAt(i));
	  }
	 }
	   else if (a.charAt(len - 1) == 'g')
	   {
		 for (i = 0;i <= len - 4;i++)
		 {
			 System.out.printf("%c",a.charAt(i));
		 }
	   }
		 System.out.print("\n");
		 j++;
	}
	}
}

