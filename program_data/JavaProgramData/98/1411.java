package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int begin;
		int end;
		String a = new String(new char[10000]);
		String b = new String(new char[10]);
		b = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != null)
		{
			begin = i;
			for (j = 0;j < 80 && a.charAt(i);j++)
			{
				i++;
			}
			if (a.charAt(i) == 0)
			{
				end = i - 1;
				i--;
			}
			else
			{
				while (a.charAt(i) != ' ')
				{
						i--;
				}
				end = i - 1;
			}
			while (begin <= end)
			{
				System.out.printf("%c",a.charAt(begin));
				begin++;
			}
			System.out.print("\n");
			i++;
		}
		return 0;
	}
}
