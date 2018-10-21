package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int[] Husband = new int[50];
	public static int marry(String engage)
	{
		int j;
		int k;
		for (j = 1 ; j < i ; j++)
		{
			if (!engage[j].equals(engage[0]) && !engage[j].equals('X'))
			{
				k = j - 1;
				while (engage[k].equals('X'))
				{
					k--;
				}
				if (engage[k].equals(engage[0]))
				{
					Husband[j] = k;
					engage[j] = 'X';
					engage[k] = 'X';
					if (k == 0)
					{
						return 0;
					}
				}
			}
		}
		marry(engage);
	}
	public static int Main()
	{
		int t;
		String engage = new String(new char[100]);
		String couple = new String(new char[100]);
		engage = ConsoleInput.readToWhiteSpace(true).charAt(0);
		i = engage.length();
		for (t = 0 ; t < i ; t++)
		{
			couple = tangible.StringFunctions.changeCharacter(couple, t, engage.charAt(t));
		}
		marry(engage);
		for (t = 1 ; t < i ; t++)
		{
			if (couple.charAt(t) != couple.charAt(0))
			{
				System.out.print(Husband[t]);
				System.out.print(" ");
				System.out.print(t);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

