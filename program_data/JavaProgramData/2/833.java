package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int[] num = new int[1000];
		int i;
		int k;
		int l = 0;
		int[] a = new int[26];
		char[][] nam = new char[1000][10];
		char j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				nam[i] = tempVar3.charAt(0);
			}
		}
		for (j = 'A';j <= 'Z';j++)
		{
			for (i = 0;i < m;i++)
			{
				if (tangible.StringFunctions.strChr(nam[i],j))
				{
					a[j - 65]++;
				}
			}
		}
				for (i = 0,k = a[0];i < 26;i++)
				{
					if (a[i] > k)
					{
						k = a[i];
						l = i;
					}
				}
					System.out.printf("%c\n",l + 65);
					System.out.printf("%d\n",k);
					for (i = 0;i < m;i++)
					{
						if (tangible.StringFunctions.strChr(nam[i],l + 65))
						{
							System.out.printf("%d\n",num[i]);
						}
					}
	}

}

