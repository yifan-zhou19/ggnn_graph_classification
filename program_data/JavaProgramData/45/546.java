package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p3;
		int i;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		for (p1 = str; * p1 != ' ';p1++)
		{
			; //???????
		}
		p2 = p1 + 1;
		*p1 = '\0';
		p1 = str; //p1?p2????????
		for (i = 0;k < 1;p2++,i++)
		{
			p1 = str;
			p3 = p2;
			if (*p3 == *p1)
			{
				for (; * p1 != '\0';p3++,p1++)
				{
					if (*p1 == *p3)
					{
						k = k + 1;
					}
					else
					{
						k = k * 0;
						break;
					}
				}
			}
		}
		if (k != 0)
		{
		System.out.printf("%d",i - 1);
		}

	}
}
