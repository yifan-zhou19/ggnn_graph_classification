package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		int num = 0;
		int w;
		int i = 0;
		int j = 0;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		w = 0;
		while (a.charAt(i) != null)
		{
			if ((a.charAt(i) != ' ') && (w = 0) != 0)
			{


				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				w = 1;
			}
			else
			{
				if ((a.charAt(i) != ' ') && (w = 1) != 0)
				{
					j++;
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
					w = 1;
				}
				else
				{
					if (a.charAt(i) == ' ')
					{

						if ((k == 0) && (w == 1))
						{
							System.out.printf("%d",j);
						}
						else
						{
							if ((k == 1) && (w == 1))
							{

								System.out.printf(",%d",j);
							}
						}
						w = 0;
						k = 1;
						j = 0;
					}
				}
			}
			i++;
		}
		if ((k == 0) && (w == 1))
		{
							System.out.printf("%d",j);
		}
						else
						{
							if ((k == 1) && (w == 1))
							{

								System.out.printf(",%d",j);
							}
						}
	}
}

