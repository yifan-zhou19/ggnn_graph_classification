package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[1001]);
		int time;
		int m;
		int n;
		int i;
		int j;
		int k;
		String = new Scanner(System.in).nextLine();
		m = String.length();
		for (i = 0;i < m;i++)
		{
			if (String[i] >= 'a' && string.charAt(i) <= 'z')
			{
				String[i] = string.charAt(i) - 32;
			}
		}
		time = 1;
		for (i = 0;i < m;i++)
		{
			if (String[i + 1] == string.charAt(i))
			{
				time = time+1;
			}
			else
			{
				System.out.printf("(%c,%d)",string.charAt(i),time);
				time = 1;
			}
		}
	}
}
