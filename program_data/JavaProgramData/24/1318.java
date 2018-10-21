package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		String max_index;
		String min_index;
		int len;
		int max = 0;
		int min = 100000;
		str = new Scanner(System.in).nextLine();
		for (p = q = str; * p;p++)
		{
			if (*p == ' ')
			{
				len = p - q;
			if (len > max)
			{
				max = len,max_index = q;
			}
			if (len < min)
			{
				min = len,min_index = q;
			}
			q = p + 1;
			}
			if (*(p + 1) == '\0')
			{
				len = p + 1 - q;
			if (len > max)
			{
				max = len,max_index = q;
			}
			if (len < min)
			{
				min = len,min_index = q;
			}
			}
		}
			while (max_index != ' ' && max_index != '\0')
			{
				System.out.printf("%c", max_index);
				max_index = max_index.Substring(1);
			}
			System.out.print("\n");
			while (min_index != ' ' && min_index != '\0')
			{
				System.out.printf("%c", min_index);
				min_index = min_index.Substring(1);
			}
	}


}
