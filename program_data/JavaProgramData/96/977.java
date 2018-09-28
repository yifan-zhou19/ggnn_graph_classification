package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[110]);
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] shu = new int[110];
		for (int i = 0;i < ch.length();i++)
		{
			shu[i] = ch.charAt(i) - '0';
		}
		if (ch.length() <= 2 && shu[0] * 10 + shu[1] < 13)
		{
			System.out.print(0);
			System.out.print("\n");
			if (ch.length() == 2)
			{
				System.out.print(shu[0]);
				System.out.print(shu[1]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(shu[0]);
			}
		}
		else
		{
			int count = 2;
			int yushu = (shu[0] * 10 + shu[1]) % 13;
			int shang = (shu[0] * 10 + shu[1]) / 13;
			if (shang != 0)
			{
				System.out.print(shang);
			}
			while (count < ch.length())
			{
				System.out.print((yushu * 10 + shu[count]) / 13);
				yushu = (yushu * 10 + shu[count]) % 13;
				count++;
			}
			System.out.print("\n");
			System.out.print(yushu);
		}
		return 0;
	}
}

