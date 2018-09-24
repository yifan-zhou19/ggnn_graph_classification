package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
		int len;
		int i;
		int[] A = new int[26];
		int[] a = new int[26];
		int flag = 1;
		int k;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < len;i++)
		{
			for (k = 0;k < 26;k++)
			{
				if (str.charAt(i) == 'A' + k)
				{
					A[k]++;
					break;
				}
				if (str.charAt(i) == 'a' + k)
				{
					a[k]++;
					break;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (A[i] != 0)
			{
				System.out.printf("%c=%d\n",'A' + i,A[i]);
				flag = 0;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",'a' + i,a[i]);
				flag = 0;
			}
		}
		if (flag != 0)
		{
			System.out.print("No");
		}
		return 0;

	}
}
