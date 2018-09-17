package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[1000]);
		char c;
		String = new Scanner(System.in).nextLine();
		int n;
		int i;
		int x;
		n = String.length();
		x = 0;
		for (i = 0;i < n;i++)
		{
						if (String[i + 1] == string.charAt(i) || Math.abs(String[i + 1] - string.charAt(i)) == 32)
						{
						x = x + 1;
						}
						else
						{
							 if (String[i] <= 90)
							 {
							 System.out.printf("(%c,%d)", string.charAt(i), x + 1);
							 x = 0;
							 }
							 else
							 {
								  System.out.printf("(%c,%d)", string.charAt(i) - 32, x + 1);
								  x = 0;
							 }
						}
		}

		 return 0;
	}

}
