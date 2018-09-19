package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i = 0;
	 String str = new String(new char[10000]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 str = tempVar.charAt(0);
	 }
	 while (str.charAt(i) != '\0')
	 {
	  i++;
	 }
	 for (i--;i >= 0;i--)
	 {
	 System.out.printf("%c",str.charAt(i));
	 }
	 System.out.print("\n");
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	}
}

