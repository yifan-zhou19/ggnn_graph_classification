package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;a.charAt(i) == ' ';i++)
		{
			;
		}
		for (;i < k;)
		{
			if (a.charAt(i) != ' ')
			{
				for (j = i + 1;a.charAt(j) != ' ' && j < k;j++)
				{
					;
				}
				System.out.printf("%d",j - i);
				i = j;
			}
			else
			{
				for (j = i + 1;a.charAt(j) == ' ' && j < k;j++)
				{
					;
				}
				System.out.print(",");
				i = j;
			}
		}
		System.out.print("\n");
		return 0;
	}
}
