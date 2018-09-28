package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int xh;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (xh = 1;xh <= t;xh++)
		{
			String s = new String(new char[100005]);
		int i;
		int j;
		int[] p = new int[26];
		int[] count = new int[26];
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < 100001;j++)
			{
				if (s.charAt(j) == '0' + 49 + i)
				{
						p[i] = j;

						break;
				}
			}
		}
		for (i = 0;i < 100001;i++)
		{
			if (s.charAt(i) == '\0')
			{
				break;
			}
			count[s.charAt(i) - 97]++;
		}
		char z;
		int flag = 0;
		for (i = 0;i < 26;i++)
		{

			if (count[i] == 1 && flag == 0)
			{
				   z = s.charAt(p[i]);
				   flag = 1;
			}
			if (count[i] == 1 && flag == 1)
			{
				if (p[i] < p[z - 97])
				{
					z = s.charAt(p[i]);
				}
			}
		}
		if (flag == 0)
		{

			System.out.print("no");
			System.out.print("\n");
		}
		else
		{
			System.out.print(z);
			System.out.print("\n");
		}
		}

		return 0;
	}
}

