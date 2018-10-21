package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[9000]);
		int i = 0;
		int t = 0;
		int j = 0;
		s = new Scanner(System.in).nextLine();
		while (s.charAt(i) != '\0')
		{
			 if (s.charAt(i) != ' ')
			 {
				 j++;
			 }
			 else
			 {
				 if (j != 0)
				 {
					System.out.printf("%d,",j);
				 }
				 j = 0;
			 }
			 i++;
		}

		System.out.printf("%d",j);
	}

}
