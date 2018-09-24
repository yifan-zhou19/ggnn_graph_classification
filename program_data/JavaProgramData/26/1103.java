package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int t;
		a = new Scanner(System.in).nextLine();
		t = 1;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		if (a.charAt(i) == ' ')
		{
			if (t == 1)
			{
			System.out.print(" ");
			t++;
			}
		}
		else
		{
			System.out.printf("%c",a.charAt(i));
			t = 1;
		}
		}
		return 0;
	}


}
