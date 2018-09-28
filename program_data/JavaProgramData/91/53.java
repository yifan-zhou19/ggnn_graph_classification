package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int length;
		String sz1 = new String(new char[101]);
		String sz2 = new String(new char[101]);
		String character;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * family;
		character = sz1;
		character = new Scanner(System.in).nextLine();
		family = sz2;
		for (i = 0; * (character.Substring(i) + 1) != '\0';i++)
		{
			*family = (character.Substring(i)) + *(character.Substring(i) + 1);
			family++;
		}
		*family++= character + *(character.Substring(i));
		*family = '\0';
		family = sz2;
		if (*family != '\0')
		{
			System.out.printf("%s",family);
		}
		return 0;
	}

}
