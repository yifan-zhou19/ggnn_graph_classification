package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char i = 0;
		char j;
		while (cin.get(a.charAt(i)))
		{
			if (a.charAt(i) == '\n')
			{
				break;
			}
			if ((a.charAt(i) == a.charAt(i - 1)) && (a.charAt(i) == 32))
			{
				i--;
			}
			i++;
		}
		for (j = 0; j <= i; j++)
		{
			System.out.print(a.charAt(j));
		}
	return 0;
	}
}
