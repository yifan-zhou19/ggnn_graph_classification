package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		int c = 0;
		int n;
		int i = 0;
		int count = 0;
		char a = 97;
		char A = 65;
		zfc = new Scanner(System.in).nextLine();
		while (A >= 65 && A <= 90)
		{
			for (ps = zfc; * ps != '\0';ps++)
			{
				if (*ps == A)
				{
					count++;
				}
			}
				if (count != 0)
				{
					System.out.printf("%c=%d\n",A,count);
					c = 1;
				}
				count = 0;
				A++;

		}
		while (a <= 122 && a >= 97)
		{
			for (ps = zfc; * ps != '\0';ps++)
			{
				if (*ps == a)
				{
					count++;
				}
			}
				if (count != 0)
				{
					System.out.printf("%c=%d\n",a,count);
					c = 1;
				}
				count = 0;
				a++;

		}
		if (c == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}
