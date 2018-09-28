package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int end;
		int begin;
		int len;
		int i;
		int j;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		end = len - 1;
		for (i = len;i >= 0;i--)
		{
			if (str.charAt(i) == ' ' || i == 0)
			{
				if (i == 0)
				{
					begin = 0;
				}
				else
				{
					begin = i + 1;
				}
				for (j = begin;j <= end;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				if (i != 0)
				{
					System.out.print(" ");
				}
				end = i - 1;
			}
		}
		System.out.print("\n");
		return 0;
	}

}
