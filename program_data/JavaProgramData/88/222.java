package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		String str;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		str = new Scanner(System.in).nextLine();
		//puts(str);
		for (p = str;p < str + str.length();p++)
		{
			if (48 <= *p && *p <= 57)
			{

			System.out.printf("%c",*p);
			}
				if ((48 <= *(p - 1) && *(p - 1) <= 57) && (!(48 <= *p && *p <= 57)))
				{
					System.out.print("\n");
				}

		}
	}
}
