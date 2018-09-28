package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		final String a = "";
		final String c = "";

		for (i = 0;;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		k = i;
		//printf("%s",a);


		c = tangible.StringFunctions.changeCharacter(c, 0, a.charAt(0));


		for (i = 1,j = 1;i < k;)
		{

			if (a.charAt(i) != ' ')
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
				j++;
				i++;
			}
			if ((a.charAt(i) == ' ') && (a.charAt(i - 1) != ' '))
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
				j++;
				i++;
			}
			if ((a.charAt(i) == ' ') && (a.charAt(i - 1) == ' ')) //'\0'????????
			{
				i++;
			}
			//printf("%c",c[j]);
		}

		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",c.charAt(i));
		}
		return 0;
	}

}

