package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int[] a = new int[52];
		int count = 0;
		int len;
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (s.charAt(i) == j + 'A')
				{
					a[j] += 1;
					count += 1;
				}
			}
			for (j = 0;j < 26;j++)
			{
				if (s.charAt(i) == j + 'a')
				{
					a[26 + j] += 1;
					count += 1;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
			System.out.printf("%c=%d\n",'A' + i,a[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i + 26] != 0)
			{
			System.out.printf("%c=%d\n",'a' + i,a[i + 26]);
			}
		}
		if (count == 0)
		{
			System.out.print("No");
		}
		return 0;
	}




}
