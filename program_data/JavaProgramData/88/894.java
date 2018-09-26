package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[35]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char* end=a+strlen(a);
		char end = a + a.length();
		for (char * i = a;i < end;i++)
		{
			if (i >= '0' && i <= '9')
			{
				System.out.printf("%c", i);
			}
			else
			{
				while (!(i >= '0' && i <= '9'))
				{
					i++;
				}
				i--;
				System.out.print("\n");
			}
		}
		return 0;
	}
}
