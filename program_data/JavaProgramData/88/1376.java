package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ch;
		int num = 0;
		int flag = 0;
		int count = 0;

		while (ch = System.in.read())
		{
				  if (!Character.isDigit(ch) && flag != 0)
				  {
						  System.out.printf("%d\n", num);
						  count++;
						  num = flag = 0;
				  }
				  if (Character.isDigit(ch))
				  {
						num = 10 * num + ch - '0';
						flag = 1;
						continue;
				  }
				  if (ch == '\n')
				  {
					  break;
				  }

		}

		return 0;
	}
}
