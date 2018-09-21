package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String st = new String(new char[1000]);
		char[][] s = new char[50][50];
		int i;
		int j;
		int[] k = new int[50];
		int p;
		int q;
		int max;
		int min;
		int l;
		st = new Scanner(System.in).nextLine();
		l = st.length();
		j = 0;
		for (i = 0;i < 50;i++)
		{
			k[i] = 0;
		}
		for (i = 0;i < l;i++)
		{
			if (st.charAt(i) != ' ')
			{
				s[j][k[j]] = st.charAt(i);
				k[j] = k[j] + 1;
			}
			else
			{
				j = j + 1;
			}
		}
		max = 0;
		min = 50;
		for (i = 0;i <= j;i++)
		{
			if (k[i] < min)
			{
				min = k[i];
				q = i;
			}
			if (k[i] > max)
			{
				max = k[i];
				p = i;
			}
		}
		for (i = 0;i < max;i++)
		{
			System.out.printf("%c",s[p][i]);
		}
		System.out.print("\n");
		for (i = 0;i < min;i++)
		{
			System.out.printf("%c",s[q][i]);
		}
		System.out.print("\n");
	}
}
