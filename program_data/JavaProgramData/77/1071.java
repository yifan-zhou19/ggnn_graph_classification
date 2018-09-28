package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int i;
		int j;
		int k;
		int l;
		String s = new String(new char[101]);
		char mark;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		mark = s.charAt(0);
		for (i = 0;i <= l - 1;i++)
		{
			if (s.charAt(i) == mark)
			{
				a[i] = 1;
			}
			else
			{
				a[i] = 0;
			}
		}
		i = 0;
		k = 0;
		while (k < l / 2)
		{
			if (a[i] == 1)
			{
				j = i + 1;
				while (a[j] == -1)
				{
					j++;
				}
				if (a[j] == 0)
				{
					System.out.printf("%d %d\n",i,j);
					a[i] = -1;
					a[j] = -1;
					k++;
					i = 0;
				}
				else
				{
					i++;
				}
			}
			else
			{
				i++;
			}
		}
		return 0;
	}
}
