package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int len;
		int a;
		String jz = new String(new char[LEN]);
		String hjz = new String(new char[LEN]);
		jz = new Scanner(System.in).nextLine();
		hjz = tangible.StringFunctions.changeCharacter(hjz, 0, jz.charAt(0));
		j++;
		for (i = 1;i < LEN;i++)
		{
			if (jz.charAt(i) == ' ' && jz.charAt(i - 1) == ' ')
			{
				continue;
			}
			else
			{
				hjz = tangible.StringFunctions.changeCharacter(hjz, j, jz.charAt(i));
				j++;
			}
		}
		System.out.printf("%s",hjz);
		return 0;
	}





}

