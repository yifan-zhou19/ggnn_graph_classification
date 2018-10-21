package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[45]);
	public static int Main()
	{
		int n;
		int cnt = 0;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (cnt <= n)
		{
			while (true)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Character.SIZE / Byte.SIZE));
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			cnt++;
		  if (cnt == 1 || cnt == n)
		  {
			  if (cnt == 1)
			  {
				  System.out.print(c);
				  s = c.length();
			  }
									  else
									  {
										  System.out.print(' ');
										  System.out.print(c);
										  System.out.print("\n");
									  }
		  }
		  else
		  {
			  s += c.length() + 1;
				if (s > 80)
				{
					System.out.print("\n");
					System.out.print(c);
					break;
				}
			else
			{
				System.out.print(' ');
				System.out.print(c);
			}
		  }
			}
			s = c.length();
		}

	}
}

