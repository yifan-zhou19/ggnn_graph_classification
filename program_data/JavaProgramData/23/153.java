package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[200]);
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		int i;
		int j;
		int temp = len - 1;
		for (i = len - 1;i >= 0;i--)
		{
			if (s.charAt(i) == ' ')
			{
				for (j = i + 1;j <= temp;j++)
				{
					System.out.print(s.charAt(j));
				}
				System.out.print(s.charAt(i));
				temp = i - 1;
			}
			else
			{
				if (i == 0)
				{
					for (j = i;j <= temp;j++)
					{
						System.out.print(s.charAt(j));
					}
				}
			}


		}
	}
}
