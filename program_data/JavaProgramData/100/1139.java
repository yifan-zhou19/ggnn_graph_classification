package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String A = new String(new char[302]);
		int i;
		int n;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = tempVar.charAt(0);
		}
		k = 0;
		j = 0;
		for (n = 'a';n <= 'z';n++)
		{
			k = 0;
			for (i = 0;A.charAt(i) != 0;i++)
			{
				if (A.charAt(i) == n)
				{
					k++;
				}
			}

	if (k != 0)
	{
				System.out.printf("%c=%d\n",n,k);
				j++;
	}

		}
		if (j == 0)
		{
			System.out.print("No\n");
		}

		return 0;
	}




















}

