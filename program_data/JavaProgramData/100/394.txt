package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int[] b = new int[26];
		int len;
		int s = 0;
		String a = new String(new char[301]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < 26;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				b[(a.charAt(i) - 'a')]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			s += b[i];
		}
		if (s == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (b[i] != 0)
				{
					System.out.printf("%c=%d\n",i + 'a',b[i]);
				}
			}
		}
	}
}
