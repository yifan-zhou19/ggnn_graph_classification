public class book
{
	public int num;
	public String str = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] bk = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static void Main()
	{
		int m;
		int i;
		int j;
		int k;
		int s;
		int n = 0;
		char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '\0'};
		int[] b = new int[26];
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
				bk[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bk[i].str = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(bk[i].str).length();j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (a[k] == bk[i].str.charAt(j))
					{
						b[k]++;
					}
				}
			}
		}
					for (i = 0;i < 26;i++)
					{
						if (b[i] > n)
						{
							n = b[i];
							s = i;
						}
					}
						System.out.printf("%c\n%d\n",a[s],b[s]);
						for (i = 0;i < m;i++)
						{
							for (j = 0;j < String.valueOf(bk[i].str).length();j++)
							{
								if (bk[i].str.charAt(j) == a[s])
								{
									System.out.printf("%d\n",bk[i].num);
								}
							}
						}
	}

}

