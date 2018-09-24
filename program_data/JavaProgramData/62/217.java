package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int i;
		int t;
		t = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				t++;
				if (t != 1)
				{
					continue;
				}
			}
			else
			{
				t = 0;
			}
			System.out.printf("%c",a.charAt(i));
		}
		return 0;
	}



}
