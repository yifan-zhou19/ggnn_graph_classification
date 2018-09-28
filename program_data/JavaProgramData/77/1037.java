package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String pupils = new String(new char[100]);
		char g;
		int i = 0;
		int j;
		int k;
		pupils = new Scanner(System.in).nextLine();
		k = pupils.length();
		g = pupils.charAt(k - 1);
		while (i < k)
		{
			if (pupils.charAt(i) == g)
			{
				j = 1;
				while (pupils.charAt(i - j) == 0)
				{
					j++;
				}
				pupils = pupils.substring(0, i);
				pupils = pupils.substring(0, i - j);
				System.out.printf("%d %d\n",i - j,i);
			}
			i++;
		}
	}
}
