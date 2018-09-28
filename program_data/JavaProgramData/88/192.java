package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int n;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		n = s.length();

		for (ps = s; * ps != '\0';ps++)
		{
			if (*ps >= '0' && *ps <= '9')
			{
				System.out.printf("%c",*ps);
			}
			else
			{
				if (*(ps + 1) < 58 && *(ps + 1)>47)
				{
					System.out.print("\n");
				}
			}

		}
	}
}
