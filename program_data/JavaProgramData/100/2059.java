package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] numl = new int[26];
		int[] nums = new int[26];
		int i;
		int n;
		int tag = 0;
		String s = new String(new char[301]);
		char j;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			for (j = 'A';j <= 'Z';j++)
			{
				if (s.charAt(i) == j)
				{
					numl[j - 'A']++;
					tag = 1;
				}
			}
			for (j = 'a';j <= 'z';j++)
			{
				if (s.charAt(i) == j)
				{
					nums[j - 'a']++;
					tag = 1;
				}
			}
		}
		if (tag == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (numl[i] != 0)
				{
					System.out.printf("%c=%d\n",i + 'A',numl[i]);
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (nums[i] != 0)
				{
					System.out.printf("%c=%d\n",i + 'a',nums[i]);
				}
			}
		}
	}
}
