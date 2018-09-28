package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]); //??????????????
		String b = new String(new char[251]);
		int[] an = new int[251]; //????????????
		int[] bn = new int[251];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int la = a.length();
		int lb = b.length();
		for (int i = 0;i < la;i++)
		{
			an[i] = a.charAt(i) - '0';
		}
		for (int i = 0;i < lb;i++)
		{
			bn[i] = b.charAt(i) - '0';
		}
		if (la > lb) //???????????????????????????
		{
			for (int i = 1;i <= lb;i++)
			{
				an[la - i] += bn[lb - i];
			}
			for (int i = 1;i < la;i++)
			{
				an[la - i - 1] += an[la - i] / 10;
				an[la - i] = an[la - i] % 10;
			}
			int flag = 0;
			for (int i = 0;i < la;i++)
			{
				if (i == la - 1 && flag == 0) //???????????????????
				{
					System.out.print(a.charAt(i));
					break;
				}
				if (an[i] == 0 && flag == 0) //????????
				{
					continue;
				}
				flag = 1;
				System.out.print(an[i]);
			}
		}
		else //????????????????????
		{
			for (int i = 1;i <= la;i++)
			{
				bn[lb - i] += an[la - i];
			}
			for (int i = 1;i < lb;i++)
			{
				bn[lb - i - 1] += bn[lb - i] / 10;
				bn[lb - i] = bn[lb - i] % 10;
			}
			int flag = 0;
			for (int i = 0;i < lb;i++)
			{
				if (i == lb - 1 && flag == 0)
				{
					System.out.print(b.charAt(i));
					break;
				}
				if (bn[i] == 0 && flag == 0)
				{
					continue;
				}
				flag = 1;
				System.out.print(bn[i]);
			}
		}
		return 0;
	}
}

