package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int i;
		int[] sum = new int[52];
		String zifu = new String(new char[301]);
		zifu = new Scanner(System.in).nextLine();
		for (i = 0;i < zifu.length();i++)
		{
			if ('A' - 1 < zifu.charAt(i) && zifu.charAt(i) < 'Z' + 1)
			{
				sum[zifu.charAt(i) - 'A']++;
				a = 1;
			}
			if ('a' - 1 < zifu.charAt(i) && zifu.charAt(i) < 'z' + 1)
			{
				sum[zifu.charAt(i) - 'a' + 26]++;
				a = 1;
			}
		}
		if (a == 0)
		{
			System.out.print("No");
		}
		for (i = 0;i < 26;i++)
		{
			if (sum[i] != 0)
			{
			System.out.printf("%c=%d\n",i + 'A',sum[i]);
			}
		}
		for (i = 26;i < 52;i++)
		{
			if (sum[i] != 0)
			{
				System.out.printf("%c=%d\n",i - 26 + 'a',sum[i]);
			}
		}
		return 0;
	}

}
