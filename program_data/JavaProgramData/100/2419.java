package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sum = new int[52];
		String a = new String(new char[301]);
		int n;
		int i;
		int f = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < 52;i++)
		{
			sum[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))
			{
				sum[26 + a.charAt(i) - 'a']++;
			}
			else if ((a.charAt(i) >= 'A') && (a.charAt(i) <= 'Z'))
			{
				sum[a.charAt(i) - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (sum[i] != 0)
			{
				f++;
				System.out.printf("%c=%d\n",i + 'A',sum[i]);
			}
		}
		for (i;i < 52;i++)
		{
			if (sum[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a' - 26,sum[i]);
				f++;
			}
		}
		if (f == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}
