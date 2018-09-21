package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[3000]);
		char[][] danci =
		{
			{'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		int k;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0,j = 0,k = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				zfc = tangible.StringFunctions.changeCharacter(zfc, i, '\0');
				danci[j] = (zfc.Substring(k));
				k = i + 1;
				j++;
			}

		}
		danci[j] = (zfc.Substring(k));
		j++;
		int max = String.valueOf(danci[0]).length();
		int min = String.valueOf(danci[0]).length();
		String chang = new String(new char[50]);
		String duan = new String(new char[50]);
		chang = danci[0];
		duan = danci[0];
		for (i = 0;i < j;i++)
		{
			if (String.valueOf(danci[i]).length() > max)
			{
				max = String.valueOf(danci[i]).length();
				chang = danci[i];
			}
			if (String.valueOf(danci[i]).length() < min)
			{
				min = String.valueOf(danci[i]).length();
				duan = danci[i];
			}
		}
		System.out.printf("%s\n%s\n",chang,duan);
		return 0;
	}
}

