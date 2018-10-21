package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int j;
		int n;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 1;i < n;i++)
		{
			for (p1 = s; * (p1 + i) != '\0';p1++)
			{
				p2 = p1 + i;
				for (j = 0;j < i;j++)
				{
					if (*(p1 + j) != *(p2 - j))
					{
						break;
					}
				}
				if (j == i)
				{
					for (p = p1;p <= p2;p++)
					{
						System.out.printf("%c",*p);
					}
					System.out.print("\n");
				}
			}
		}
	}

}
