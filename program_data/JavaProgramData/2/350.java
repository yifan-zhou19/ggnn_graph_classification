package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		int t;
		int m;
		int[] a = new int[26];
		int[] book = new int[999];
		int max;
		char[][] writer = new char[999][26];
		char maxwriter;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				writer[i] = tempVar3.charAt(0);
			}
			m = String.valueOf(writer[i]).length();
			for (j = 0;j < m;j++)
			{
				t = writer[i][j] - 'A';
				a[t]++;
			}
		}
		max = 0;
		maxwriter = 'A';
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				maxwriter = 'A' + i;
			}
		}
		System.out.printf("%c\n%d\n",maxwriter,max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(writer[i]).length();j++)
			{
				if (writer[i][j] == maxwriter)
				{
					System.out.printf("%d\n",book[i]);
					break;
				}
			}
		}
	}


}

