package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		int i = 0;
		int n;
		int j = 0;
		s = new Scanner(System.in).nextLine();
		while (s.charAt(i) != ' ')
		{
			i++;
		}
		n = i;
		while (n != 0)
		{
			while (j < n)
			{
				if (s.charAt(j) != s.charAt(i + 1 + j))
				{
					break;
				}
				if (j == n - 1)
				{
					System.out.printf("%d\n",i - n);
					n = 0;
				}
				j++;
			}
			i++;
		}
	}

}
