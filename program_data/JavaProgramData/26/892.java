package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int q = 0;
	int i;
	int j;
	String tra = new String(new char[1000]);
	String yaode = new String(new char[1000]);
	tra = new Scanner(System.in).nextLine();
	for (i = 0,j = 0;i < 1000;i++)
	{
	if (tra.charAt(i) != ' ')
	{
			yaode = tangible.StringFunctions.changeCharacter(yaode, j, tra.charAt(i));
			j++;
			q = 0;
	}
		else
		{
			if (tra.charAt(i) == ' ' && q == 0)
			{
				yaode = tangible.StringFunctions.changeCharacter(yaode, j, tra.charAt(i));
				q++;
				j++;
			}
			else
			{
				if (tra.charAt(i) == '.')
				{
					yaode = tangible.StringFunctions.changeCharacter(yaode, j, tra.charAt(i));
					break;
				}
			}
		}
	}
				System.out.printf("%s",yaode);

	}




}

