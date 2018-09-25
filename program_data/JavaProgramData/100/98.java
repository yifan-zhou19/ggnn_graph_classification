package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int array[],int l);
		int i;
		int m;
		int n;
		int t;
		int[] b = new int[26];
		String str = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		t = str.length();
		for (i = 0;i < t;i++)
		{
			m = 0;
			m = str.charAt(i) - 97;
			b[m]++;
		}
		n = f(b, t);
		if (n == 0)
		{
			System.out.print("No");
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 97,b[i]);
			}
		}
	}

	public static int f(int[] array, int l)
	{
		int i;
		int word = 0;
		for (i = 0;i < l;i++)
		{
			if (array[i] != 0)
			{
				word++;
			}
		}
		return (word);
	}
}
