package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int t;
		int b = 0;
		int k = 0;
		int i;
		a = new Scanner(System.in).nextLine();
		t = a.length();
		for (i = 0;i < t;i++)
		{
			b = b * 10 + a.charAt(i) - 48;
			if (b >= 13)
			{
				k = 1;
				System.out.printf("%d",b / 13);
				b = b % 13;
			}
			else if (k)
			{
				System.out.print("0");
			}
		}
		if (k == 0)
		{
			System.out.print("0");
		}
		System.out.printf("\n%d",b);
	}

}
