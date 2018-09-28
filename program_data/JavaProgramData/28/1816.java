package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100000]);
	public static int Main()
	{
		int l;
		int i;
		int start;
		int end;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		start = 0;
		end = 0;
		while (true)
		{
			for (i = start;i < l;i++)
			{
				if (s.charAt(i) == ' ')
				{
					end = i;
					break;
				}
				if (i == (l - 1))
				{
					end = l;
					break;
				}
			}
			if (start == 0)
			{
				System.out.printf("%d",end);
			}
			else
			{
				System.out.printf(",%d",end - start);
			}
			if (end == l)
			{
				break;
			}
			for (i = end;;i++)
			{
				if (s.charAt(i) != ' ')
				{
					start = i;
					break;
				}
			}
			end = start;
		}
		return 0;
	}
}
