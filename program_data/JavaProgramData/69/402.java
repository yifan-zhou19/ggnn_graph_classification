package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] aa = new int[252];
		int[] bb = new int[252];
		int[] cc = new int[252];
		int i;
		int k = 0;
		int n;
		int m;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		aa[0] = a.length();
		for (i = 1;i <= aa[0];i++)
		{
			aa[i] = a.charAt(aa[0] - i) - 48;
		}
		bb[0] = b.length();
		for (i = 1;i <= bb[0];i++)
		{
			bb[i] = b.charAt(bb[0] - i) - 48;
		}
		for (i = 1;i <= max(aa[0], bb[0]) + 1;i++)
		{
			cc[i] = ((aa[i] + bb[i]) + k) % 10;
			k = (aa[i] + bb[i] + k) / 10;
		}
		for (i = 251;i >= 1;i--)
		{
			if (cc[i] != 0)
			{
			cc[0] = i;
			break;
			}
		}
		if (i == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (i = cc[0];i > 0;i--)
			{
				System.out.print(cc[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

