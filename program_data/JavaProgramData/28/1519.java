package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[20000]);
		int i;
		int j = 0;
		int k;
		int[] s = new int[30000];
		int n;
		z = new Scanner(System.in).nextLine();

		n = z.length();
		if (z.charAt(0) == ' ')
		{
			for (i = 1;i < n;i++)
			{
				if ((z.charAt(i - 1) == ' ') && (z.charAt(i) != ' '))
				{
					j++;
					s[j] = 0;
					for (k = i;k < n;k++)
					{
						s[j]++;
						if ((z.charAt(k) != ' ') && (z.charAt(k + 1) == ' '))
						{
							break;
						}

					}
				}
			}
		}
		if (z.charAt(0) != ' ')
		{
			for (i = 0;i < n;i++)
			{
				if ((i == 0) || ((i > 0) && (z.charAt(i - 1) == ' ') && (z.charAt(i) != ' ')))
				{
					j++;
					s[j] = 0;
					for (k = i;k < n;k++)
					{
						s[j]++;
						if ((z.charAt(k) != ' ') && (z.charAt(k + 1) == ' '))
						{
							break;
						}

					}
				}
			}
		}

		for (i = 1;i <= j - 1;i++)
		{
			System.out.printf("%d",s[i]);
			System.out.print(",");
		}
		System.out.printf("%d",s[j]);




		return 0;
	}

}
