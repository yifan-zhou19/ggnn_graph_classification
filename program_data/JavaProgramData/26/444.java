package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		char c;
		while ((c = System.in.read()) != '\n')
		{
		 if (c == ' ')
		 {
			 if (i == 0)
			 {
				 System.out.print(c);
				 i++;
			 }
		 }
		 else
		 {
			 System.out.print(c);
			 i = 0;
		 }
		}
		return 0;
	}

}
