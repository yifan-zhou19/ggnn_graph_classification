package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[30000]);
		a = new Scanner(System.in).nextLine();
		int[] len = new int[30000];
		int i = 0;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
		p1 = len;
		for (p = a; * p != '\0';p++)
		{
			if (*p != ' ')
			{
				(*(p1 + i))++;
				k = 0;
			}
			if (*p == ' ')
			{
				if (k == 0)
				{
					i++;
					k = 1;
				}
				else
				{
					continue;
				}
			}
		}
		for (p1 = len;(*(p1 + 1)) != 0;p1++)
		{
			System.out.printf("%d,", p1);
		}
		System.out.printf("%d\n", p1);
	}

}
