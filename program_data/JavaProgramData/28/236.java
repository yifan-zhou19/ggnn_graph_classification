package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[4000]); //?400???4000
		s = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0;;i++)
		{
			if (s.charAt(i) != ' ')
			{
				for (j = 1;;j++)
				{
					if (s.charAt(i + j) == ' ' || s.charAt(i + j) == '\0')
					{
						if (i == 0)
						{
							System.out.printf("%d",j);
						}
						else
						{
							System.out.printf(",%d",j);
						}
						break;
					}
				}
				i = i + j;
			}
			if (s.charAt(i) == '\0')
			{
				break;
			}
		}
		System.out.print("\n");
	}
}
