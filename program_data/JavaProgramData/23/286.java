package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i = 0;
		int j = 1;
		int total = 1;
		int[] num = new int[100];
		int[] end = new int[100];
		int[] start = new int[100];
		int k;
		str = new Scanner(System.in).nextLine();
		start[1] = 1;
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == ' ')
			{
			num[j] = i;
			end[j] = i;
			start[j + 1] = i + 2;
			j++;
			total++;
			}
		}
		end[total] = str.length();

		for (j = total;j > 1;j--)
		{
			for (k = start[j] - 1;k <= end[j] - 1;k++)
			{
			if (k != end[j] - 1)
			{
			System.out.printf("%c",str.charAt(k));
			}
			else
			{
				System.out.printf("%c ",str.charAt(k));
			}
			}
		}
				if (j = 1)
				{
					for (k = 0;k < end[1];k++)
					{
					System.out.printf("%c",str.charAt(k));
					}
				}
		return 0;
	}
}
