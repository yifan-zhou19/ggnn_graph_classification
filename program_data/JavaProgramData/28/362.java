package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();
		p = str;
		int k;
		k = 0;
		while (*p != '\0')
		{
			if (*p != ' ')
			{
				k++;
				p++;
			}
			else if (*(p - 1) != ' ')
			{
				System.out.printf("%d,",k);
				p++;
				k = 0;
				continue;
			}
			else
			{
				p++;
				continue;
			}
		}
		System.out.printf("%d",k);
	}


}
