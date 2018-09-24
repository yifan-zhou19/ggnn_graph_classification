package <missing>;

public class GlobalMembers
{
	public static String sen = new String(new char[200]);
	public static String m = new String(new char[200]);
	public static String c = new String(new char[200]);
	public static String check = new String(new char[200]);
	public static int Main()
	{
		sen = new Scanner(System.in).nextLine();
		m = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int mark = 0;
		for (int i = 0;i < sen.length();i++)
		{
			   if (sen.charAt(i) != ' ')
			   {
				   check = tangible.StringFunctions.changeCharacter(check, mark, sen.charAt(i));
				   mark++;
			   }
				  else
				  {
						  if (!strcmp(check,m))
						  {
							System.out.printf("%s ",c);
						  }
							else
							{
							System.out.printf("%s ",check);
							}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
							memset(check,0,(Character.SIZE / Byte.SIZE));
							mark = 0;
				  }
		}
		if (!strcmp(check,m))
		{
							System.out.printf("%s\n",c);
		}
							else
							{
							System.out.printf("%s\n",check);
							}

		return 0;
	}

}

