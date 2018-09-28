package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String aa = new String(new char[1024]);
	 String p = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(aa, 0x00, (Character.SIZE / Byte.SIZE));
	 aa = new Scanner(System.in).nextLine();
	 p = aa.charAt(aa.length() - 1);
	 while (' ' == *p--)
	 {
	  p = tangible.StringFunctions.changeCharacter(p, 1, '\0');
	 }
	 p = aa;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
	 while (' ' == *p++)
	 {
		 ;
	 }
	 p--;
	 aa = p;
	 while (null != (p = tangible.StringFunctions.strStr(aa, "  ")))
	 {
	  p = p.charAt(1);
	 }
	System.out.printf("%s\n", aa);
	 return 0;
	}
}

