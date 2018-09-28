package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[6000]);
		int i;
		int word = 0;
		char c;
		String = new Scanner(System.in).nextLine();
		for (i = 0;((c = string.charAt(i)) != '\0');i++)
		{
			if (c != ' ')
			{
				 if (String[i + 1] != '\0')
				 {
					word = word + 1;
				 }
				else if (String[i + 1] == '\0')
				{
				System.out.printf("%d",word + 1);
				}

			}
		else if (c == ' ')
		{
				  if (String[i - 1] != ' ')
				  {
				  System.out.printf("%d,",word);
				  word = 0;
				  }
				  else
				  {
					  ;
				  }
		}
		}
	}
}
