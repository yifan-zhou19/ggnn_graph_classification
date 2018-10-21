package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		int l;
		int m;
		int k;
		int i;
		int[] a = new int[30];
		l = s.length();
		m = 1;
		for (k = 97;k <= 122;k++)
		{
			a[k] = 0;
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == k)
				{
					m = 2;
					a[k]++;
				}
			}
			if (a[k] != 0)
			{
				System.out.printf("%c=%d\n",k,a[k]);
			}
		}
		if (m == 1)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}
