package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int j = 0;
		int[] a = new int[10000];
		char[][] word = new char[10000][40];
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
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i] = String.valueOf(word[i]).length();
		}
		for (i = 0,m = a[0] + 1;i < n;)
		{
			m = m + a[i + 1] + 1;
		if (m > 81)
		{
			System.out.printf("%s\n",word[i]);
		m = a[i + 1] + 1;
		i++;
		continue;
		}
		else if (m == 81)
		{
			System.out.printf("%s%c",word[i],(i < n - 1)?' ': '\n');
		System.out.printf("%s\n",word[i + 1]);
		m = a[i + 2] + 1;
		i = i + 2;
		continue;
		}
		else if (m == 80)
		{
			System.out.printf("%s%c",word[i],(i < n - 1)?' ':'\n');
		System.out.printf("%s\n",word[i + 1]);
		m = a[i + 2] + 1;
		i = i + 2;
		continue;
		}
		else
		{
			System.out.printf("%s%c",word[i],(i < n - 1)?' ': '\n');
		i++;
		}
		}
	return 0;
	}



}

