package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[301]);
		int[] num = new int[26];
		int i;
		int len;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				num[str.charAt(i) - 'a'] = num[str.charAt(i) - 'a'] + 1;
				n = 1;
			}
		}
		if (n == 1)
		{
			for (i = 0;i < 26;i++)
			{
				if (num[i] != 0)
				{
					System.out.printf("%c=%d\n",i + 'a',num[i]);
				}
				else
				{
					;
				}
			}
		}
		else
		{
			System.out.print("No\n");
		}
	}

}

