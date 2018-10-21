package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String max_index;
		String min_index;
		int max = 0;
		int min = 100000;
		int len;
		str = new Scanner(System.in).nextLine();
		for (p = q = str; ;)
		{
			if (*q == ' ' || *q == '\0')
			{
				len = q - p;
				if (len > max)
				{
					max = len, max_index = p;
				}
				if (len < min)
				{
					min = len, min_index = p;
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
		for (; max_index != ' ' && max_index != null; max_index++)
		{
			System.out.printf("%c", max_index);
		}
		System.out.print("\n");
		for (; min_index != ' ' && min_index != null; min_index++)
		{
			System.out.printf("%c", min_index);
		}
		System.out.print("\n");
		return 0;
	}
}
