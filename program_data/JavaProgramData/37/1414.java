package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int n;
		int j;
		int k;
		String str = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			n = str.length();
			for (j = 0;j < n - 1;j++)
			{
				for (k = j + 1;k < n;k++)
				{
					if (str.charAt(j) == str.charAt(k))
					{
						str = tangible.StringFunctions.changeCharacter(str, j, str[k] = 1);
						break;
					}
				}
				if (k == j + 1)
				{
					j = k;
				}
				else if (k == n)
				{
					System.out.printf("%c\n",str.charAt(j));
					break;
				}
			}
			if (j >= n - 1)
			{
				System.out.print("no\n");
			}
		}
	}
}

