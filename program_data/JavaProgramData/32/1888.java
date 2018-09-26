package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int len1;
		int len2;
		char[][] num = new char[2][100];
		String emp = new String(new char[1]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[0] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[1] = tempVar3.charAt(0);
			}
			len1 = String.valueOf(num[0]).length();
			len2 = String.valueOf(num[1]).length();
			for (j = 0;j < len2;j++)
			{
				if (num[0][len1 - 1 - j] >= num[1][len2 - 1 - j])
				{
					num[0][len1 - 1 - j] = num[0][len1 - 1 - j] - num[1][len2 - 1 - j] + '0';
				}
				else
				{
					num[0][len1 - 1 - j] = num[0][len1 - 1 - j] + 10 - num[1][len2 - 1 - j] + '0';
					num[0][len1 - 2 - j] = num[0][len1 - 2 - j] - 1;
				}
			}
			System.out.println(num[0]);
			emp = new Scanner(System.in).nextLine();
		}
	}
}

