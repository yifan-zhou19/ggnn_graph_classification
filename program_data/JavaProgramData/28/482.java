package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		String s = new String(new char[6000]);
		s = new Scanner(System.in).nextLine();
		n = s.length() - 1; //printf("%d\n",n);
		for (i = 0;i <= n;i++)
		{
			if (s.charAt(i) != ' ' && i != n)
			{
				t++;
			}
			else if (s.charAt(i) == ' ' && t != 0)
			{
				System.out.printf("%d",t);
				t = 0;
			}
			if (i == n)
			{
				System.out.printf("%d",t + 1);
			}
			if (i != n && t == 0 && s.charAt(i - 1) != ' ')
			{
				System.out.print(",");
			}
		}

	}
}
