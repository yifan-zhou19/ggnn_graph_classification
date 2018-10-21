package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p3;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p4;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p5;
		String p6;
		int i;
		int l;
		int j;
		int flag;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (j = 1;j <= l - 1;j++)
		{
			p1 = a;
			p2 = a.charAt(j);
			for (i = 0;i < l - j;i++,p1++,p2++)
			{
				p5 = p1;
				p3 = p1;
				p6 = p2;
				p4 = p2;
				flag = 0;
				for (;p3 <= p4;p3++,p4--)
				{
					if (*p3 != *p4)
					{
						flag++;
					}
				}
				if (flag == 0)
				{
					for (;p5 <= p6;p5++)
					{
						System.out.printf("%c",*p5);
					}
					System.out.print("\n");
				}

			}
		}
		return 0;
	}

}
