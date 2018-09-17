package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[301]);
		int[] b = new int[500];
		int i;
		int flag;
		for (i = 0;i <= 300;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			b[a.charAt(i) - 'a' + 1]++;
		}
		flag = 0;
		for (i = 1;i <= 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a' - 1,b[i]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}

	}
}

