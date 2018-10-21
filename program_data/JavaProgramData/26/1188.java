package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 String a = new String(new char[200]);
	 a = new Scanner(System.in).nextLine();
	 n = a.length();
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 s:
	 ;
	 for (i = 0;i < n;i++)
	 {
	   if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
	   {
		 for (j = i;j <= n;j++)
		 {
		   a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
		 }
		 n = n - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 goto s;
	   }
	 }
	 System.out.println(a);
	 return 0;
	}
}

