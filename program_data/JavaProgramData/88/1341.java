package <missing>;

public class GlobalMembers
{
	/** c version **/


	public static int isDigit(char ch)
	{
		if (ch == '\0')
		{
			return -1;
		}
		if ('0' <= ch && ch <= '9')
		{
			return 1;
		}
		return 0;
	}

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char * p = (String) malloc(40 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		do
		{
			p--;
			while (isDigit(*(++p)) == 0)
			{
			} // ignore non-digit chars
			p--;
			while (isDigit(*(++p)) == 1)
			{
				System.out.printf("%c", *p);
			}
			System.out.print("\n");
		} while (*p != '\0');
		return 0;
	}

}
