package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int flag = 0;
		int c;
		c = System.in.read();
		while (c != EOF)
		{
			if (flag == 0 && isgraph(c))
			{
				System.out.printf("%c",c);
			}
			  else if (flag == 0)
			  {
				   System.out.printf("%c",c);
				   flag = 1;
			  }
				   else if (isgraph(c))
				   {
						System.out.printf("%c",c);
						flag = 0;
				   }
			c = System.in.read();
			i++;
		}
	}

}
