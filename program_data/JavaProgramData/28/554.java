package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		s = new Scanner(System.in).nextLine();
		int i;
		int count;
		count = 0;
		i = 0;
		while (s.charAt(i) != ' ' && s.charAt(i) != '\0')
		{
			i++;
			count++;
		}
		System.out.printf("%d",count);
		while (s.charAt(i) != '\0' && s.charAt(i) != '\0')
		{
			if (s.charAt(i) != ' ')
			{
				count = 0;
				while (s.charAt(i) != ' ' && s.charAt(i) != '\0')
				{
				   count++;
				   i++;
				}
				System.out.printf(",%d",count);
			}
			else
			{
				i++;
			}
		}
		return 0;
	}

}
