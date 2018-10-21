package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int n = 1;
		int c = a.length();
		int[] sz = new int[n];
		int[] sz1 = new int[n];
		sz[0] = -1;
		for (int i = 1;a.charAt(i) != '\0';i++)
		{
			 if (a.charAt(i) == ' ')
			 {
				 sz[n] = i;
				 n++;
			 }
		}
		sz[n] = c;
		for (int i = 0;i <= n;i++)
		{
			sz1[i] = sz[i + 1] - sz[i] - 1;
		}
		for (int i = 0;i < n - 1;i++)
		{
			if (sz1[i] > 0 && sz1[i] < 10000)
			{
				System.out.printf("%d,",sz1[i]);
			}
		}
		System.out.printf("%d",sz1[n - 1]);
		return 0;
		}
}
