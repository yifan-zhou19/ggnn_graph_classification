package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		final String word = "";
		int i;
		int j;
		int k;
		int a;
		int h;
		int u;
		h = 0;
		a = 0;
		u = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			if (str.charAt(i) == ' ')
			{
				a++;
			}
			if (str.charAt(i) == '\0')
			{
				k = i;
				break;
			}
		}
			for (j = 0;j < k;j++)
			{
				if (str.charAt(j) == ' ')
				{
					h++;
					u = 0;
				}
				else
				{
				word.charAt(h)[u] = str.charAt(j);
				u = u + 1;
				}
			}
		for (i = a;i > 0;i = i - 1)
		{
			System.out.printf("%s ",word.charAt(i));
		}
		System.out.printf("%s",word.charAt(0));
	}
}
