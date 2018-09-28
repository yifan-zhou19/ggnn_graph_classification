package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1111]; //?????????i???????
	public static String s = new String(new char[1111]); //?????

	public static int i;
	public static int n = 0;
	public static int Main()
	{
	 s = ConsoleInput.readToWhiteSpace(true).charAt(0);
	 String b = new String(new char[2]);
	 b = tangible.StringFunctions.changeCharacter(b, 0, s.charAt(0));
	 for (i = 0; s.charAt(i); ++i) //???s?i????
	 {
	  if (s.charAt(i) == b.charAt(0))
	  {
		  a[++n] = i; //?????????????
	  }
	  else
	  {
		  System.out.print(a[n--]);
		  System.out.print(" ");
		  System.out.print(i);
		  System.out.print("\n");
	  }
	 }
	 return 0;
	}
}

