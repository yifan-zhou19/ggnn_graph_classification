package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i = 0;
	 String str = new String(new char[10]);
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
	}

}

