package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num = 0;
		int n;
		String a = new String(new char[20000]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				num++;
			}
			else if (a.charAt(i) == ' ' && num != 0)
			{
				System.out.printf("%d",num);
				if (i != n - 1)
				{
					System.out.print(",");
				}
				num = 0;
			}
			if (i == n - 1)
			{
				System.out.printf("%d",num);
			}
		}
	}
}
