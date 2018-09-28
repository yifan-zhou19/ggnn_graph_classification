package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int t;
		int n;
		int p;
		int[] a = new int[26];
		int r;
		char[] str = {0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < t;i++)
		{
			r = 0;
			str = new Scanner(System.in).nextLine();
			n = str.length();
			for (j = 0;j < n;j++)
			{
				p = (int)(str[j] - 97);
				a[p]++;
			}
			for (k = 0;k < n;k++)
			{
				if (a[(int)(str[k] - 97)] == 1)
				{
					r++;
					System.out.printf("%c\n",str[k]);
					break;
				}
			}
			if (r == 0)
			{
				System.out.print("no\n");
			}
	for (l = 0;l < 26;l++)
	{
	a[l] = 0;
	}
		}
	}

}

