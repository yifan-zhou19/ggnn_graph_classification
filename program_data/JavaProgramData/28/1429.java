package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int p;
		String ch = new String(new char[max]);

		ch = new Scanner(System.in).nextLine();
		p = 1;

		n = ch.length();
		for (i = 0;i < n;i++)
		{
			while ((ch.charAt(i) == ' ') && (i <= n))
			{
				i++;
			}
			j = i;
			while ((ch.charAt(j) != ' ') && (j <= n))
			{
				j++;
			}
			if (j >= n)
			{
				j--;
			}
			if (p != 0)
			{
				System.out.printf("%d",j - i);
				p = 0;
			}
			else
			{
				System.out.printf(",%d",j - i);
			}
			i = j;
		}

		return 0;
	}
}
