package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zxc = new String(new char[101]);
		int i;
		int j;
		int t;
		int k;
		int l;
		int[] s = new int[100];
		zxc = new Scanner(System.in).nextLine();
		t = 0;
		l = zxc.length();
	k = 0;
		for (i = 0;i < (l - 1);i++)
		{
			if (i == 0)
			{
				k = (zxc.charAt(i) - '0') * 10 + (zxc.charAt(i + 1) - '0');
			}
			else
			{
			k = t * 10 + (zxc.charAt(i + 1) - '0');
			}
			s[i] = k / 13;
			t = k % 13;

		}
		for (j = 0;j < i;j++)
		{
			if (j == 0 && s[j] == 0)
			{
				continue;
			}
			System.out.printf("%d",s[j]);
		}
	if (k <= 12 && (i == 1 || i == 0))
	{
	System.out.print("0");
	if (k == 0)
	{
	t = zxc.charAt(0) - '0';
	}
	}
		System.out.print("\n");
		System.out.printf("%d",t);
	return 0;
	}
}
