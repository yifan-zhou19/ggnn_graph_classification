package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i = 0;
		 char c;

		 while ((c = System.in.read()) != '\n')
		 {
		 if (c != ' ')
		 {
			 System.out.print(c);
			 i = 0;
			 continue;
		 }

		 while (c == ' ')
		 {
			 i = i + 1;
			 if (i >= 2)
			 {
				 break;
			 }
			 System.out.print(c);
		 }
		 }
			  return 0;
	}


}
