package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words = new String(new char[110]);
		char[][] zfcsz = new char[110][110];
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		int i;
		int n;
		int k;
		int j;
		words = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n = words.length();
		k = 0;
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (words.charAt(i) != ' ')
			{
				zfcsz[k][j] = words.charAt(i);
				j++;
				if (i == n - 1)
				{
					k++;
					zfcsz[k][j] = '\0';
				}
			}
			else
			{
				zfcsz[k][j] = '\0';
				k++;
				j = 0;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			if (strcmp(zfcsz[i],a) == 0)
			{
				System.out.printf("%s ",b);
			}
			else
			{
				System.out.printf("%s ",zfcsz[i]);
			}
		}
		if (strcmp(zfcsz[k - 1],a) == 0)
		{
			System.out.printf("%s",b);
		}
		else
		{
			System.out.printf("%s",zfcsz[i]);
		}
		return 0;
	}

}

