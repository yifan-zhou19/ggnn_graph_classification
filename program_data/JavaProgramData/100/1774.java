package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[N]);
		char j;
		str = new Scanner(System.in).nextLine();
		int len;
		int i;
		int x = 1;
		len = str.length();
		for (j = 'A';j <= 'Z';j++)
		{
			int sum = 0;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == j)
			{
				sum++;
				x = 0;
			}
		}
			if (sum != 0)
			{
				System.out.printf("%c=%d\n",j,sum);
			}
		}
		for (j = 'a';j <= 'z';j++)
		{
			int sum = 0;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == j)
			{
				sum++;
				x = 0;
			}
		}
			if (sum != 0)
			{
				System.out.printf("%c=%d\n",j,sum);
			}
		}
		 if (x != 0)
		 {
			 System.out.print("No");
		 }
		 return 0;
	}
}
