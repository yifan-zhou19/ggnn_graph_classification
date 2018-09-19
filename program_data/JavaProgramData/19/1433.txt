package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		char[][] danci = new char[101][101];
		int i;
		int k;
		int n;
		int len;
		k = 0;
		n = 0;
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) != ' ')
			{
				danci[n][k] = str.charAt(i);
				k++;
			}
			else
			{
				danci[n][k] = '\0';
				n++;
				k = 0;
			}
		}
		danci[n][k] = '\0';
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
		int e;
		for (i = 0;i < n + 1;i++)
		{
			if (strcmp(danci[i],a) == 0)
			{
				danci[i] = b;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s ",danci[i]);
		}
		System.out.printf("%s",danci[n]);
	return 0;
	}
}

