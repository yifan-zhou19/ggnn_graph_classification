package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String string = "";
		final String substring = "";
		while (scanf("%s%s",String,substring) != EOF)
		{
			final String last = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * pointer_begin;
			String pointer_end;
			int n = 0;
			int k = 0;

			for (pointer_begin = String,pointer_end = String; pointer_begin - String < String.length(); pointer_begin++)
			{
				if (*pointer_begin > k)
				{
					k = pointer_begin;
					pointer_end = pointer_begin;
					n = pointer_end - String;
				}
			}

			last = String.substring(0, n + 1);
			System.out.printf("%s",last);
			System.out.printf("%s",substring);
			System.out.printf("%s\n",pointer_end.Substring(1));
		}
		return 0;
	}

}
