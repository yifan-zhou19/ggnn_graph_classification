package <missing>;

public class GlobalMembers
{
	public static int check(String a, int point, int lenth)
	{
		if (point > 0 && a[point - 1].equals(a[point + lenth]))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		String code = new String(new char[500]);
		int[] flag = new int[500];
		int i;
		int j;
		int lenth;
		int outlet;
		for (i = 0; i < 500; i++)
		{
			flag[i] = 1;
		}
		code = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (outlet = 0, lenth = 0; outlet < code.length(); lenth += 2)
		{
			for (i = 0; i < code.length(); i++)
			{
				if (flag[i] != 0)
				{
					if (check(code, i, lenth) != 0)
					{
						for (j = i - 1; j <= i + lenth; j++)
						{
							System.out.print(code.charAt(j));
							flag[i - 1] = 1;
						}
						System.out.print("\n");
					}
					else
					{
						outlet++;
					}
						flag[i] = 0;
				}
			}
		}
		return 0;
	}
}

