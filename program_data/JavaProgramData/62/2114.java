package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		int flag = 0;
		while ((ch = System.in.read()) != '\n')
		{
				 if (ch == ' ' && flag == 0)
				 {
						  System.out.print(ch);
						  flag = 1;
				 }
				 else if (ch != ' ')
				 {
					  flag = 0;
					  System.out.print(ch);
				 }
		}
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}

}
