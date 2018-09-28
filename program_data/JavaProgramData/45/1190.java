package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String qian = new String(new char[60]);
		String quan = new String(new char[110]);
		quan = new Scanner(System.in).nextLine();
		int i;
		int j;
		int numquan;
		int numqian = 0;
		numquan = quan.length();
		for (i = 0;i < 60;i++)
		{
			if (quan.charAt(i) != ' ')
			{
				qian = tangible.StringFunctions.changeCharacter(qian, i, quan.charAt(i));
				numqian++;
			}
			else
			{
				break;
			}
		}
		int jishu = 0;
		for (j = numqian + 1;j < numquan;j++)
		{
			for (i = 0;i < numqian;i++)
			{
				if (qian.charAt(i) != quan.charAt(j))
				{
					jishu = 0;
					break;
				}
				else
				{
					jishu++;
					j++;
					if (jishu == numqian)
					{
							System.out.printf("%d",j - 2 * numqian - 1);
					}
				}
			}
		}
	return 0;

	}
}

