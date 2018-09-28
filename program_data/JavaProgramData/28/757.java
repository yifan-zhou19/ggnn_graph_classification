package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int num = 0;
		int n;
		String s = new String(new char[10000]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i <= n;i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				num++;
			}
			else if (s.charAt(i) == ' ')
			{
				if (num == 0)
				{
					continue;
				}
				else
				{
					System.out.printf("%d,",num);
				num = 0;
				}
			}
			else if (s.charAt(i) == '\0')
			{
				System.out.printf("%d\n",num);
			}
		}
	}
}
