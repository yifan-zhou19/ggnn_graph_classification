package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		int i;
		void guolv(char * p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000);
		p = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
		guolv(tempRef_p);
		p = tempRef_p.argValue;
			return 0;
	}

	public static void guolv(tangible.RefObject<String> p)
	{
		 int i;
		 for (i = 0;(*(p.argValue.Substring(i))) != '\0';i++)
		 {
									if (((*(p.argValue.Substring(i))) == ' ') && ((*(p.argValue + (i + 1))) == ' '))
									{
										;
									}
									else
									{
									System.out.printf("%c",*(p.argValue.Substring(i)));
									}
		 }
	}
}

