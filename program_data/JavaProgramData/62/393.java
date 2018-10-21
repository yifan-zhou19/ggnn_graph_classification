package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[300]);
		int a;
		int b;
		int n;
		int i;
		int j;
		w = new Scanner(System.in).nextLine();
		System.out.printf("%c",w.charAt(0));
		for (i = 1;w.charAt(i) != '\0';i++)
		{
			if ((w.charAt(i - 1) == ' ') && (w.charAt(i) == ' '))
			{

			}
			else
			{
				System.out.printf("%c",w.charAt(i));
			}
		}
		return 0;
	}
}
