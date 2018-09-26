package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char i;
		char j;
		int[] ta = new int[24];
		int[] tb = new int[24];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i <= 23;i++)
		{
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == 'a' + i)
				{
					ta[i]++;
				}
			}
		}
		for (i = 0;i <= 23;i++)
		{
			for (j = 0;j < b.length();j++)
			{
				if (b.charAt(j) == 'a' + i)
				{
					tb[i]++;
				}
			}
		}
		for (i = 0;i < 23;i++)
		{
			if (ta[i] != tb[i])
			{
				System.out.print("NO");
				break;
			}
		}
		if (i == 23)
		{
			System.out.print("YES");
		}
		return 0;
	}
}

