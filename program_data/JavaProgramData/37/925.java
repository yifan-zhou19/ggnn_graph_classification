package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int flag;
		String str = new String(new char[100001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			flag = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			m = str.length();
			for (j = 0;str.charAt(j);j++)
			{
				for (k = 0;str.charAt(k);k++)
				{
					if (j == k)
					{
						continue;
					}
					if (str.charAt(j) == str.charAt(k))
					{
						break;
					}
				}
				if (k == m)
				{
					System.out.printf("%c\n",str.charAt(j));
					flag = 0;
					break;
				}
				if (flag == 0)
				{
					break;
				}
			}
			if (j == m)
			{
				System.out.print("no\n");
			}
		}
	}
}

