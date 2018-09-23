package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int[] letter = new int[26];
		int[] num = new int[26];
		int i;
		int j = 0;
		int n;
		int p = 0;
		int q;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < 26;i++)
		{
			num[i] = 0;
		}
		for (i = 'a',q = 0;i <= 'z';i++,q++)
		{
			for (j = 0;j < n;j++)
			{
				if (a.charAt(j) == i)
				{
					letter[q] = i;
					num[q]++;
					p++;
				}
			}

		}
		if (p == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (j = 0;j < 26;j++)
			{
				if (num[j] != 0)
				{
					System.out.printf("%c=%d\n",letter[j],num[j]);
				}
			}
		}
	}
}
