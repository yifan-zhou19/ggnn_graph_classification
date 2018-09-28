package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String temp = new String(new char[500]);
		String temp2 = new String(new char[500]);
		int i;
		int k;
		int j;
		int b;
		a = new Scanner(System.in).nextLine();
		b = a.length();
		for (i = 2;i <= b;i++)
		{
			for (j = 0;j < b - i + 1;j++)
			{
				temp = String.valueOf(a.charAt(j)).substring(0, i);
				for (k = 0;k < i;k++)
				{

					temp2 = tangible.StringFunctions.changeCharacter(temp2, k, temp.charAt(i - k - 1));
				}
				temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
				temp2 = tangible.StringFunctions.changeCharacter(temp2, i, '\0');
				if (strcmp(temp,temp2) == 0)
				{
					System.out.printf("%s\n",temp);
				}
			}
		}


	}
}

