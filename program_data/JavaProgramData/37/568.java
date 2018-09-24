package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100001]);
		int i;
		int j;
		int k;
		int t;
		int n;
		int b;
		int c;

		a = new Scanner(System.in).nextLine();
		t = Integer.parseInt(a);

		for (i = 0;i < t;i++)
		{
			a = new Scanner(System.in).nextLine();
			n = a.length();
			c = 0;
			for (j = 0;j < n;j++)
			{
				b = 0;
				for (k = 0;k < n;k++)
				{
					if ((j != k) && (a.charAt(j) == a.charAt(k)))
					{
						b++;
					}
				}
				if (b == 0)
				{
					System.out.printf("%c\n",a.charAt(j));
					c = 1;
					break;
				}
			}
			if (c == 0)
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}
}
