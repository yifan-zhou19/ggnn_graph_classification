package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		int i;
		int n;
		int j;
		int[] s1 = new int[1000];
		s = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;i < s.length();i++)
		{
			if (s.charAt(i) == ' ')
			{
				s1[j] = i;
				j++;
			}
		}
		if (j != 0)
		{
		System.out.printf("%d,",s1[0]);
		for (i = 0;i < j - 1;i++)
		{
			if ((s1[i + 1] - s1[i] - 1) == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%d,",s1[i + 1] - s1[i] - 1);
			}
		}
		System.out.printf("%d",s.length() - s1[j - 1] - 1);
		}
		else
		{
			System.out.printf("%d",s.length());
		}

	}

}
