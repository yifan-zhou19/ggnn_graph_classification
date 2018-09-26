package <missing>;

public class GlobalMembers
{
	//**********************************
	//*??????**
	//*??????????**
	//*???2012.12.9**
	//**********************************
	public static int Main()
	{
		String ch = new String(new char[150]);
		int size;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		i = 0;
		while ((ch[i] = System.in.read()) != '\n')
		{
			i++;
		}
		size = i;
		ch = tangible.StringFunctions.changeCharacter(ch, size, ch.charAt(0));
		ch = tangible.StringFunctions.changeCharacter(ch, size + 1, '\0');
		for (p = ch; * p != '\0'; p++)
		{
			*p += *(p + 1);
		}
		for (i = 0, p = ch; i < size; i++, p++)
		{
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}










}

