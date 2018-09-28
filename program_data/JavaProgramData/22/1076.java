package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[10000];
	public static String s = new String(new char[3000]);
	public static int Main()
	{
		int i;
		int j = 0;
		int k = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				k = k * 10 + s.charAt(i) - '0';
			}
			else
			{
				num[k]++;
				k = 0;
			}
			if (i == s.length() - 1 && k != 0)
			{
				num[k]++;
			}
		}
		int ok = 0;
		for (i = 9999;i >= 0;i--)
		{
			if (num[i] > 0 && j == 0)
			{
				j = 1;
			}
			else if (num[i] > 0 && j == 1)
			{
				System.out.printf("%d",i);
				ok = 1;
				break;
			}
		}
		if (ok == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

