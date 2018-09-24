package <missing>;

public class GlobalMembers
{
	public static String z = new String(new char[10000]);
	public static String a = new String(new char[10000]);
	public static String b = new String(new char[10000]);
	public static String temp = new String(new char[10000]);

	public static int Main()
	{
		int i;
		int j;

		z = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		//cout<< z << endl << a << endl << b << endl;
		int length = z.length();
		for (i = 0; i < length; i++)
		{
			while (z.charAt(i) == ' ')
			{
				System.out.print(' ');
				i++;
			}
			int k = 0;
			for (j = i; j < length; j++)
			{
				if (z.charAt(j) != ' ')
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k++, z.charAt(j));
				}
				else
				{
					break;
				}
			}
			temp = tangible.StringFunctions.changeCharacter(temp, k, '\0');
			if (strcmp(temp, a) == 0)
			{
				System.out.print(b);
			}
			else
			{
				System.out.print(temp);
			}
			i = j;
			i--;
		}
		System.out.print("\n");
		return 0;
	}
}

