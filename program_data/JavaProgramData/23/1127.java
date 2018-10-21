package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int s;
		int l = 1;
		int k;
		int j;
		int h;
		int i;
		a = new Scanner(System.in).nextLine();
		s = a.length();
		j = s;
		for (k = 0;k <= s;k++)
		{
			if (a.charAt(k) == ' ')
			{
				l++;
			}
		}
		if (l == 1)
		{
			System.out.printf("%s",a);
		}
		else
		{
		for (i = 1;i <= l - 1;i++)
		{
			k = j - 1;
			while (a.charAt(k) != ' ')
			{
				k--;
			}
			//printf("%d",k);
			for (h = k + 1;h <= j - 1;h++)
			{
				System.out.printf("%c",a.charAt(h));
			}
			System.out.print(" ");
			j = k;
		}
		i = 0;
		while (a.charAt(i) != ' ')
		{
			System.out.printf("%c",a.charAt(i));
			i++;
		}
		}
	}

}
