package <missing>;

public class GlobalMembers
{
	public static int judge(char x)
	{
		if (x > 47 && x < 58)
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int all;
		int count;
		int[] start = new int[30];
		int[] end = new int[30];
		int p;
		String sen = new String(new char[31]);
		sen = new Scanner(System.in).nextLine();
		all = sen.length();
		count = 0;
		for (i = 0;i < all - 1;i++)
		{
			if (i == 0)
			{
				if (judge(sen.charAt(i)) != 0)
				{
					start[0] = 0;
					count++;
				}
			}
			if (i != 0 && ((judge(sen.charAt(i - 1))) == 0) && judge(sen.charAt(i)) != 0)
			{
				start[count] = i;
				count++;
			}
			if (judge(sen.charAt(i)) != 0 && (judge(sen.charAt(i + 1)) == 0))
			{
				end[count - 1] = i;
			}
		}
		if (judge(sen.charAt(all - 2)) != 0 && judge(sen.charAt(all - 1)) != 0)
		{
			end[count - 1]++;
		}
		if ((judge(sen.charAt(all - 2)) == 0 && judge(sen.charAt(all - 1)) != 0))
		{
			start[count] = all - 1;
			end[count] = all - 1;
			count++;
		}
		if (end[count - 1] < 0 || end[count - 1]>30)
		{
			end[count - 1] = all - 1;
		}
		for (i = 0;i < count;i++)
		{


			for (p = start[i];p <= end[i];p++)
			{
				System.out.printf("%c",sen.charAt(p));
			}


			System.out.print("\n");
		}


	return 0;
	}
}
