package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int b;
	 int c;
	 int i;
	 String a = new String(new char[100]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 b = a.charAt(0) - '0';
	 if (a.charAt(1) == '\0' || (a.charAt(2) == '\0' && (a.charAt(2) - '0') < 3 && (a.charAt(0) - '0') == 1))
	 {
	   System.out.print("0");
	 }
	 for (i = 1;a.charAt(i) != '\0';i++)
	 {
	  b = b * 10 + (a.charAt(i) - '0');
	  c = b / 13;
	  b = b % 13;
	  if (i == 1 && c == 0)
	  {
		  continue;
	  }
	  System.out.printf("%d",c);
	 }
	  System.out.printf("\n%d",b);
	 return 0;
	}
}

