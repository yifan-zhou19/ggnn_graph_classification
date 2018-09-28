package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int min;
		int len;
		int i;
		int j;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String max_index;
		String min_index;
		String a = new String(new char[1024]);
		a = new Scanner(System.in).nextLine();
		max = 0;
		min = 100;
		for (p = q = a;;)
		{
			if (*q == ' ' || *q == '\0')
			{
				len = q - p;
				if (len > max)
				{
					max = len;
					max_index = p;
				}
				if (len < min)
				{
					min = len;
					min_index = p;
				}
				if (*q == '\0')
				{
					break;
				}
				q = p = q + 1;
			}
			else
			{
				q++;
			}

		}
		for (; max_index != ' ' && max_index != null;max_index++)
		{
			System.out.printf("%c", max_index);
		}
		System.out.print("\n");
		for (; min_index != ' ' && min_index != null;min_index++)
		{
			System.out.printf("%c", min_index);
		}
		System.out.print("\n");

	}
}
