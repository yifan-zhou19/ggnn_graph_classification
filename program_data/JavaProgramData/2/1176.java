package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] t = new int[27];
		int max;
		char p;
		char[][] a = new char[100][27];
		char[][] b = new char[100][27];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 26;i++)
		{
			t[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (p = 'A';p <= 'Z';p++)
		{
			for (i = 1;i <= n;i++)
			{
				if (tangible.StringFunctions.strChr(b[i],p))
				{
					t[p - 'A' + 1]++;
				}
			}
		}
		max = 1;
		for (i = 2;i <= 26;i++)
		{
			if (t[max] < t[i])
			{
				max = i;
			}
		}
		System.out.printf("%c\n",p = 'A' + max - 1);
		System.out.printf("%d\n",t[p - 'A' + 1]);
		for (i = 1;i <= n;i++)
		{
			if (tangible.StringFunctions.strChr(b[i],p))
			{
				System.out.printf("%s\n",a[i]);
			}
		}
	}






}

