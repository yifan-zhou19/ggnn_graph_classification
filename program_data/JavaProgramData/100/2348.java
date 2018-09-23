package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int[] b = new int[52];
		int i;
		int k;
		int m;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		k = a.length();
		for (i = 0;i < k;i++)
		{
			m = a.charAt(i);
			if (m > 64 && m < 91)
			{
				b[m - 65]++;
			}
			else if (m > 96 && m < 123)
			{
				b[m - 71]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				j++;
				System.out.printf("%c=%d\n",i + 65,b[i]);
			}
		}
		for (i = 26;i < 52;i++)
		{
			if (b[i] != 0)
			{
				j++;
				System.out.printf("%c=%d\n",i + 71,b[i]);
			}
		}
		if (j == 0)
		{
			System.out.print("No\n");
		}
	}


}

