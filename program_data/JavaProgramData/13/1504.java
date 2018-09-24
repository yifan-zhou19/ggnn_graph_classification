package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		String a = new String(new char[50000]);
		int[] b = new int[20001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		k = a.length();
		i = 0;
		j = 1;
		while (i <= k - 1)
		{
			b[j] = (a.charAt(i) - 48) * 10 + (a.charAt(i + 1) - 48);
			i = i + 3;
			j = j + 1;
		}
		j = j - 1;
		System.out.printf("%d",b[1]);
		i = 2;
		while (i <= j)
		{
			m = 1;
			while (m < i)
			{
				if (b[i] == b[m])
				{
					break;
				}
				m = m + 1;
			}
			if (m == i)
			{
				System.out.printf(" %d",b[i]);
			}
			i = i + 1;
		}
		return 0;
	}
}

