package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		char leap = 0;
		for (int i = 0; i < 10000; i++)
		{
			cin.get(a.charAt(i));
			if (a.charAt(i) != ' ')
			{
				leap = 1;
				System.out.print(a.charAt(i));
			}
			if (a.charAt(i) == ' ')
			{
				if (leap == 1)
				{
					System.out.print(a.charAt(i));
					leap = 0;
				}
			}
			if (a.charAt(i) == '\n')
			{
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}
}
