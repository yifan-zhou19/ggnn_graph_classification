package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			String a = new String(new char[100000]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			int[] b = new int[26];
			for (j = 0;j < len;j++)
			{
				for (k = 97;k < 123;k++)
				{
					if (a.charAt(j) == k)
					{
						b[k - 97]++;
						break;
					}

				}
			}

			for (j = 0;j < len;j++)
			{
				if (b[a.charAt(j) - 97] == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					s = 1;
					break;
				}
			}
			if (s == 0)
			{
				System.out.print("no\n");
			}

		}
		return 0;
	}
}

