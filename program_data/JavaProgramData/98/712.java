package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String a = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,'\0',10000);
		a = new Scanner(System.in).nextLine();
		int q = a.length();
		for (int i = 0; i <= q;)
		{
			if (a.charAt(i + 80) == '\0')
			{
				System.out.println(a.Substring(i));
				break;
			}
			else if (a.charAt(i + 79) == ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, i + 79, '\n');
				for (int j = i; j <= i + 79; j++)
				{
					System.out.print(a.charAt(j));
				}
				i += 80;
			}
			else if (a.charAt(i + 80) == ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, i + 80, '\n');
				for (int j = i; j <= i + 80; j++)
				{
					System.out.print(a.charAt(j));
				}
				i += 81;
			}
			else
			{
				int j = i + 79;
				for (;a.charAt(j) != ' ';j--)
				{
					;
				}
				a = tangible.StringFunctions.changeCharacter(a, j, '\n');
				for (int l = i; l <= j; l++)
				{
					System.out.print(a.charAt(l));
				}
				i = j + 1;
			}
		}
	}





}

