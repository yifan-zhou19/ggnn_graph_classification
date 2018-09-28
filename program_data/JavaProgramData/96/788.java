package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		int f;
		int num;
		int s = 0;
		int i;

		c = new Scanner(System.in).nextLine();

		f = c.charAt(0) - 48;
		for (i = 1;c.charAt(i) != 0;i++)
		{
			num = f * 10 + c.charAt(i) - 48;
			if (num / 13 == 0 && s == 0)
			{
				f = num % 13;
			}
			else
			{
				System.out.printf("%d",num / 13);
				f = num % 13;
				s = 1;
			}
		}
		if (s == 0)
		{
			System.out.print("0");
		}
		System.out.printf("\n%d\n",f);
		return 0;
	}

}
