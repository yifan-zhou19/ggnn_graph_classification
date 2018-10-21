package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String letter = new String(new char[300]);
		letter = new Scanner(System.in).nextLine();
		int len = letter.length();
		int judge = 0;
		char CH = 'A';
		for (CH = 'A';CH <= 'Z';CH++)
		{
			int i = 0;
			int num1 = 0;
			for (i = 0;i < len;i++)
			{
				if (letter.charAt(i) == CH)
				{
					num1 += 1;
				}
				if (i == len - 1 && num1 != 0)
				{
					judge += 1;
					System.out.printf("%c=%d\n",CH,num1);
					num1 = 0;
				}
			}
		}
		char ch = 'a';
		for (ch = 'a';ch <= 'z';ch++)
		{
			int j = 0;
			int num2 = 0;
			for (j = 0;j < len;j++)
			{
				if (letter.charAt(j) == ch)
				{
					num2 += 1;
				}
				if (j == len - 1 && num2 != 0)
				{
					judge += 1;
					System.out.printf("%c=%d\n",ch,num2);
					num2 = 0;
				}
			}
		}
		if (judge == 0)
		{
			System.out.print("No");
		}
	}
}
