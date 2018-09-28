package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
		String p = str;
		str = new Scanner(System.in).nextLine();
		int l;
		l = str.length();
		int[] num = new int[1000];
		int i;
		int j = 0;
		int x = 0;
		int y = 0;
		int[] q = num;
		int m = 1;
		for (i = x;i < l;i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				q[j] = (q + j) + 1;
				y = 0;
			}
			else if (y == 0)
			{
				y = 1;
				j = j + 1;
				x = i + 1;
				m = j;
			}
		}
		if (m != 1)
		{
			for (j = 0;j < m;j++)
			{
				System.out.printf("%d,",q[j]);
			}
			System.out.printf("%d",q[m]);
		}
		else
		{
			System.out.printf("%d",q[0]);
		}
	return 0;
	}

}
