package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[1000][45];
		int n;
		int i;
		int j;
		int k;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		sum = 0;
		for (i = 0;i < n - 1;i++)
		{
			k = sum + String.valueOf(s[i]).length();
			if (k < 80)
			{
				if ((k + 1 + String.valueOf(s[1 + i]).length()) > 80)
				{
					System.out.printf("%s\n",s[i]);
					sum = 0;
				}
				else
				{
					System.out.printf("%s ",s[i]);
					sum += String.valueOf(s[i]).length() + 1;
				}
			}
			else
			{
				if (k == 80)
				{
					System.out.printf("%s\n",s[i]);
					sum = 0;
				}
			}
		}
		System.out.printf("%s",s[n - 1]);
		return 0;
	}
}

