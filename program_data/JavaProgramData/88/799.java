package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String p;
		   int i;
		   int len;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p = (String)malloc(30);
		   p = new Scanner(System.in).nextLine();
		   len = p.length();
		   for (i = 0;i < len;i++)
		   {
			   if (*(p.Substring(i)) >= 48 && *(p.Substring(i)) <= 57)
			   {
				   System.out.printf("%c",*(p.Substring(i)));
			   }
			   else if ((*(p.Substring(i) - 1) >= 48 && *(p.Substring(i) - 1) <= 57) || *(p.Substring(i) + 1) == '\0')
			   {
				   System.out.print("\n");
			   }
		   }
		   System.out.print("\n");
	}

}
