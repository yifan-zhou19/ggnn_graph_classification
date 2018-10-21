package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * str = c;
		int flag;
		int k;
		flag = 1;
		k = 0;
		str = new Scanner(System.in).nextLine();
		while (*str != null)
		{
			if ((*str >= '0' && *str <= '9') && (flag == 0) && (k>0))
			{
				System.out.print("\n");
			}
			if (*str >= '0' && *str <= '9')
			{
				System.out.printf("%c",*str);
				flag = 1;
				k++;
			}
			else
			{
				flag = 0;
			}
			str++;

		}

			return 0;
	}
}
