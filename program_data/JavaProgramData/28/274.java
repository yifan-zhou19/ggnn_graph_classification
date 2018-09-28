package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * temp;
		String s = new String(new char[1000]);
		int p = 0;
		s = new Scanner(System.in).nextLine();
		temp = s;
		for (temp = s; * temp != '\0';temp++)
		{
			if (*temp == ' ')
			{
				if (p > 0)
				{
					System.out.printf("%d,",p);
				}
				p = 0;
			}
			else
			{
				p++;
			}
		}
		System.out.printf("%d",p);
	}



}
