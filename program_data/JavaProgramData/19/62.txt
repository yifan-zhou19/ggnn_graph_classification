package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[100]);
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String str3 = new String(new char[200]);
		int n1;
		int n2;
		int i = 0;
		int s;
		int j;
		int a = 0;
		int b;
		String = new Scanner(System.in).nextLine();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		n1 = str1.length();
		n2 = str2.length();
		while (i < 100)
		{
			b = 0;
			for (j = 0;j < n1;j++)
			{
				if ((String[i + j] == str1.charAt(j)))
				{
					b += 1;
				}
				else
				{
					b = 0;
				}
			}







			if (i == 0)
			{
				if (b == n1 && string.charAt(i + n1) == ' ')
				{
					for (s = 0;s < n2;s++)
					{
						str3 = tangible.StringFunctions.changeCharacter(str3, a, str2.charAt(s));
						a++;
					}
			i += n1;
				}
			else
			{
				 str3 = tangible.StringFunctions.changeCharacter(str3, a, string.charAt(i));
				 a += 1;
				 i += 1;
			}
			}







			else
			{
				if (b == n1 && string.charAt(i + n1) == ' ' && string.charAt(i - 1) == ' ')
				{
					for (s = 0;s < n2;s++)
					{
						str3 = tangible.StringFunctions.changeCharacter(str3, a, str2.charAt(s));
						a++;
					}
			i += n1;
				}
			else
			{
				 str3 = tangible.StringFunctions.changeCharacter(str3, a, string.charAt(i));
				 a += 1;
				 i += 1;
			}
			}




		}
		System.out.printf("%s",str3);
		return 0;
	}
}

