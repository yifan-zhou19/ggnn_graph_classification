package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[3000]);
		int i;
		int n;
		int j = 0;
		int word = 0;
		int[] len = new int[300];
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			len[i] = 0;
		}
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) != ' ')
			{
				word = 0;
				len[j]++;
			}
			else
			{
				if (word == 0)
				{
					j++;
					word = 1;
				}
			}
		}

		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",len[i]);
		}
		System.out.printf("%d",len[i]);
		return 0;
	}


}
