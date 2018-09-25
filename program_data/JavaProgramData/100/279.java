package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		int i;
		int[] num = new int[26];
		int len;
		int k;
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				num[a.charAt(i) - 'a']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (num[i] != 0)
			{
				k = 0;
				break;
			}
			else
			{
				k = 1;
			}
		}
		if (k == 1)
		{
			System.out.print("No\n");
		}
		else if (k == 0)
		{
			for (i = 0;i < 26;i++)
			{
				if (num[i] == 0)
				{
					continue;
				}
				else
				{
					System.out.printf("%c=%d\n",'a' + i,num[i]);
				}
			}
		}
	}
}
