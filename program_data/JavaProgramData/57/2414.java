package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int j;
		int l = 0;
		int a;
		String temp = new String(new char[4]);
		String temp1 = new String(new char[4]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[100]);
		String result = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			l = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			a = s.length();
			if (s.charAt(a - 2) == 'e' || s.charAt(a - 2) == 'l')
			{
				for (j = a - 2;s.charAt(j) != '\0';j++)
				{

					temp = tangible.StringFunctions.changeCharacter(temp, l, s.charAt(j));
					l++;
				}
				temp = tangible.StringFunctions.changeCharacter(temp, l, '\0');
				if (strcmp(temp,"er") == 0)
				{
					for (j = 0;j < a - 2;j++)
					{
						result = tangible.StringFunctions.changeCharacter(result, j, s.charAt(j));
					}
					result = tangible.StringFunctions.changeCharacter(result, j, '\0');
					System.out.printf("%s\n",result);
				}
				if (strcmp(temp,"ly") == 0)
				{
					for (j = 0;j < a - 2;j++)
					{
						result = tangible.StringFunctions.changeCharacter(result, j, s.charAt(j));
					}
					result = tangible.StringFunctions.changeCharacter(result, j, '\0');
					System.out.printf("%s\n",result);
				}
			}
			if (s.charAt(a - 3) == 'i')
			{
				for (j = a - 3;s.charAt(j) != '\0';j++)
				{

					temp1 = tangible.StringFunctions.changeCharacter(temp1, l, s.charAt(j));
					l++;
				}
				temp1 = tangible.StringFunctions.changeCharacter(temp1, l, '\0');
				if (strcmp(temp1,"ing") == 0)
				{
					for (j = 0;j < a - 3;j++)
					{
						result = tangible.StringFunctions.changeCharacter(result, j, s.charAt(j));
					}
					result = tangible.StringFunctions.changeCharacter(result, j, '\0');
					System.out.printf("%s\n",result);
				}
			}

		}
	}


}

