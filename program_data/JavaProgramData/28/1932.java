package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		int m;
		int n;
		int i;
		int k;
		int[] sz = new int[1000];
		int p;
		int s = 0;
		a = new Scanner(System.in).nextLine();
		p = a.length();
		for (i = 0;i < p;i++)
		{
			m = 0;
			for (i = i;i < p;i++)
			{
				if (a.charAt(i) != ' ')
				{
					m++;
				}
				else
				{
					break;
				}
			}
			sz[s] = m;
			s++;
		}
		System.out.printf("%d",sz[0]);
		for (i = 1;i < s;i++)
		{
			if (sz[i] != 0)
			{
			System.out.printf(",%d",sz[i]);
			}
		}
		return 0;
	}
}
