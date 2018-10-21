package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String s1 = new String(new char[200]);
		s1 = new Scanner(System.in).nextLine();
		k = s1.length() - 1;
		i = 0;
		m = 0;
		while (s1.charAt(i) == ' ')
		{
			i++;
		}
		while (s1.charAt(k) == ' ')
		{
			k--;
		}
		while (i <= k - 1)
		{

			if (s1.charAt(i) != ' ')
			{
					System.out.print(s1.charAt(i));
					i++;
			}

			else
			{
				System.out.print(s1.charAt(i));
				while (s1.charAt(i) == ' ')
				{
					i++;
				}
			}
		}
		System.out.print(s1.charAt(k));
		System.out.print("\n");

		return 0;
	}

}
