package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[101]);
		String t = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int found = 0;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(t,'\0',(Character.SIZE / Byte.SIZE));
		for (i = 0,j = 0;a.charAt(i - 1) != '\0';i++,j++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
				t = tangible.StringFunctions.changeCharacter(t, j, a.charAt(i));
			}
			if (a.charAt(i) == ' ' || a.charAt(i) == '\0')
			{
				t = tangible.StringFunctions.changeCharacter(t, j + 1, '\0');
				if (strcmp(t,b) == 0)
				{
					t = c;
				}
				if (found++ != 0)
				{
					System.out.print(" ");
				}
					System.out.printf("%s",t);
					j = -1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(t,'\0',(Character.SIZE / Byte.SIZE));
			}

		}
	}

}

