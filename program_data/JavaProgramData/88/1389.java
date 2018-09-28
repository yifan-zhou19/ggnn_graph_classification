package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int c;
		int d = 0;
		int e;
		int f;
		int g;
		String str;
		String ch = new String(new char[30]);
		str = ch;
		str = new Scanner(System.in).nextLine();
		a = str.length();
		for (i = 0;i < a;i++)
		{
			if (*(str.Substring(i)) >= '0' && *(str.Substring(i)) <= '9')
			{
				System.out.printf("%c",*(str.Substring(i)));
			}
			else if (*(str.Substring(i) - 1) < '0' || *(str.Substring(i) - 1)> '9' || i == 0)
			{
				continue;
			}
			else
			{
				System.out.print("\n");
				d++;
			}
		}
		return 0;
	}

}
