package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[500]);
		int k;
		int i;
		char chr;
		int num;
		int you = 0;

		str = new Scanner(System.in).nextLine();

		for (k = 97;k < 123;k++)
		{
			chr = k;
			num = 0;

			for (i = 0;i < str.length();i++)
			{
				if (str.charAt(i) == k)
				{
					num++;
					you = 1;
				}
			}
				if (num != 0)
				{
					System.out.printf("%c=%d\n",chr,num);
				}

		}
		if (you == 0)
		{
			System.out.print("No");
		}
	}
}
