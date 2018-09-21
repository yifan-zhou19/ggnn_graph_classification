package <missing>;

public class GlobalMembers
{
	public static int turn(tangible.RefObject<String> a)
	{
		int i = 0;
		int j;
		int k;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (p = a.argValue; * p != '\0';p++)
		{
			n++;
		}
		for (p = a.argValue.Substring(n) - 1;p >= a.argValue;p--)
		{
			if (*p != ' ')
			{
				i++;
			}
			else
			{
				for (q = p + 1;q <= p + i;q++)
				{
					System.out.printf("%c",*q);
				}
				System.out.print(" ");
				i = 0;
			}
			if (p == a.argValue)
			{
				for (q = p;q < p + i;q++)
				{
					System.out.printf("%c",*q);
				}
			}
		}

	}

	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		turn(tempRef_a);
		a = tempRef_a.argValue;
	}

}

