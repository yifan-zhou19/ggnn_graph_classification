package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void CONVERT(char c[100],char d[100],char B,int N,int x);
		int m;
		int n;
		int l;
		int i;
		int j;
		int[] k = new int[100];
		int t;
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = s.length();
		n = a.length();
		l = b.length();
		for (i = 0;i < m;i++)
		{
			k[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			t = k[i];
			for (j = i;j < i + n;j++)
			{
				if (s.charAt(j) == a.charAt(j - i))
				{
					k[i] = 1;
				}
				else
				{
					k[i] = t;
					break;
				}
			}
			if ((s.charAt(i - 1) != ' ') && (i != 0))
			{
				k[i] = t;
			}
			if (k[i] == 1)
			{
				for (j = i + 1;j < i + n;j++)
				{
					k[j] = 2;
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			if (k[i] == 1)
			{
				for (j = 0;j < l;j++)
				{
					System.out.printf("%c",b.charAt(j));
				}
			}
			if (k[i] == 0)
			{
				System.out.printf("%c",s.charAt(i));
			}
		}

	}

}
