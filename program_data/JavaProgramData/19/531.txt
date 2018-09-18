package <missing>;

public class GlobalMembers
{
	public static String sen = new String(new char[100]);
	public static char[][] words = new char[50][50];
	public static String a = new String(new char[50]);
	public static String b = new String(new char[50]);


	public static void Main()
	{
	int wordi = 0;
	int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * ptr;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * wr;
	String out = new String(new char[100]);
	sen = new Scanner(System.in).nextLine();
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
	ptr = sen;
	wr = words;
	do
	{
		if (*ptr == ' ')
		{
			*wr = '\0';
			wordi++;
			ptr++;
			wr = words + wordi;
		}
		else
		{
			*wr = ptr;
			wr++;
			ptr++;
		}
	}while (*ptr != '\0');
	*wr = '\0';
	out = tangible.StringFunctions.changeCharacter(out, 0, '\0');
	for (i = 0;i <= wordi;i++)
	{
		if (strcmp(a,words + i) == 0)
		{
			out += b;
		}
		else
		{
			out += words + i;
		}
		out += " ";
	}
	out = tangible.StringFunctions.changeCharacter(out, out.length() - 1, '\0');
	System.out.println(out);
	}
}

