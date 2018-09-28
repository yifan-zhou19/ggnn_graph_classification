package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String string = new String(new char[200]);
		String = new Scanner(System.in).nextLine();
		n = 0;
		for (i = 1;i <= 100;i++)
		{
			if (String[i] != '\0')
			{
				n++;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%c",string.charAt(i) + string.charAt(i + 1));
		}
		System.out.printf("%c",string.charAt(n) + string.charAt(0));
		return 0;
	}
}
