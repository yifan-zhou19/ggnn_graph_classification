package <missing>;

public class GlobalMembers
{
	//??????????????????????????????????
	//Goofy 2010 12 10
	public static int Main()
	{
		String sen = new String(new char[length]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = sen;
		int counter = 0;
		sen = new Scanner(System.in).nextLine();
		while (*p != '\0')
		{
			if (*p != ' ')
			{
				System.out.print(p);
				counter = 0;
			}
			else if (counter == 0) //?????
			{
				counter++;
				System.out.print(p);
			}
			p++;
		}
		System.out.print("\n");
		return 0;
	}
}
