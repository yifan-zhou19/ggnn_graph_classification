package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int j;
		int count;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		count = 0;
		for (i = 0;i < l - 1;i++)
		{
				if (a.charAt(i) == ' ')
				{
				  if (a.charAt(i + 1) == ' ')
				  {
						for (j = i;j < l - 1;j++)
						{
								   a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
						}
								   count++;
								   a = tangible.StringFunctions.changeCharacter(a, l - count, '\0');
								   i = i - 1;
				  }
				}
		}
		   System.out.printf("%s",a);
		   System.in.read();
		   System.in.read();
	}


}

