package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String sent = new String(new char[100]);
		int n;
		int i;
		int j;
		int k = 0;
		int m;
		sent = new Scanner(System.in).nextLine();
		n = sent.length();
		for (i = n - 1;i >= 0;i--)
		{
			if (sent.charAt(i) == ' ')
			{
				k++;
				m = i;
				for (j = i + 1;sent.charAt(j) != ' ' && j < n;j++)
				{
					System.out.printf("%c",sent.charAt(j));
				}
				System.out.print(" ");
			}

		}
		if (k == 0)
		{
			System.out.println(sent);
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				System.out.printf("%c",sent.charAt(i));
			}
		}

	}

}
