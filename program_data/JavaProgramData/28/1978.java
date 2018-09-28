package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		n = 0;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ')
			{
				if (s.charAt(i + 1) != ' ')
				{
					System.out.printf("%d,",n);
					n = 0;
				}
				else
				{
					continue;
				}
			}
			else
			{
				n++;
			}
		}
		System.out.printf("%d",n);
		return 0;
	}


}
