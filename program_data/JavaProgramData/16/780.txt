package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] ch = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int s = 0;
		ch = new Scanner(System.in).nextLine();
		i = 0;
		while (ch[i] != '\0')
		{
			s = i;
			i++;
		}
		for (i = s;i >= 0;i--)
		{
			System.out.printf("%c",ch[i]);
		}

	}
}
