package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100001]);
		int[] b = new int[300];
		int n;
		int j;
		int m;
		int i;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= m;j++)
		{
			for (i = 1;i <= 300;i++)
			{
				b[i] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			n = a.length();
		for (i = 0;i < n;i++)
		{
			p = a.charAt(i);
			b[p]++;
		}
		i = 0;
		while ((b[a.charAt(i)] != 1) && (i < n))
		{
			i++;
		}
		if (i < n)
		{
			System.out.printf("%c\n",a.charAt(i));
		}
		else
		{
			System.out.print("no\n");
		}
		}
		return 0;
	}
}

