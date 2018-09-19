package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char b;
		int n;
		int j;
		int l;
		int i;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
							  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
							  {
								  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
							  }
		}
	   for (i = 0 ;i < l;i++)
	   {
								  j = 1;
								  b = a.charAt(i);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							   loop:
							   if (a.charAt(i) == a.charAt(i + 1))
							   {
											j++;
										i++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
										 goto loop;
							   }
							   else
							   {
							 System.out.printf("(%c,%d)",b,j);
							   }

	   }
		  System.in.read();
		  System.in.read();
	}
}

