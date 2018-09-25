package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[300]);
		char[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int n;
		int i;
		int j;
		int k;
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (str.charAt(i) == b[j])
				{
					a[j]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",b[i],a[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				k = 1;
				break;
			}
			else
			{
				k = 0;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}

	}
}
