package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String strd = new String(new char[20]);
		String strb = new String(new char[20]);
		char[][] zfc = new char[50][200];

		str = new Scanner(System.in).nextLine();

		int i;
		int k;
		int j = 0;
		int n = 0;

		for (i = 0;str.charAt(i) != '\0';i++)
		{

			if (str.charAt(i) == ' ')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '\0');
				zfc[n] = (str.Substring(j));
				n++;
				j = i + 1;
			}
		}
		zfc[n] = (str.Substring(j));
		n++;

		strb = new Scanner(System.in).nextLine();
		strd = new Scanner(System.in).nextLine();

		for (k = 0;k < n;k++)
		{


			if (strcmp(strb,zfc[k]) == 0)
			{
				zfc[k] = strd;

			}
		}

		System.out.printf("%s",zfc[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %s",zfc[i]);
		}

		return 0;
	}




}

