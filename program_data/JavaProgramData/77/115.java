package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char a;
		char b;
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		a = str.charAt(0);
		for (n = 0;;n++)
		{
			if (str.charAt(n) != a)
			{
				b = str.charAt(n);
				break;
			}
		}
		for (n = 0;str.charAt(n) != '\0';)
		{
			n = n + 1;
		}
		for (i = 1;i <= n / 2;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (str.charAt(j) == a)
				{
					for (k = j + 1;;k++)
					{
						if (str.charAt(k) != '\0')
						{
							break;
						}
					}
					if (str.charAt(k) == b)
					{
						System.out.printf("%d %d\n",j,k);
						str = tangible.StringFunctions.changeCharacter(str, j, '\0');
						str = tangible.StringFunctions.changeCharacter(str, k, '\0');
						break;
					}
				}
			}
		}
		return 0;
	}
}

