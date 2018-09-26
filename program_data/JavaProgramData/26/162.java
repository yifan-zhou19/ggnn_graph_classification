package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * str;
	int i;
	int l;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	str = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
	str = new Scanner(System.in).nextLine();
	l = str.length();
	for (i = 0;i < l;i++,str++)
	{
		if (*str == ' ' && *(str + 1) == ' ')
		{
			i = i;
		}
		else
		{

			System.out.printf("%c",*str);
		}


	}
	return 0;
	}
}
