package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int[] b = new int[100000];
		int x;
		String a = new String(new char[100000]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			}
			a = new Scanner(System.in).nextLine();
			m = a.length();
			for (j = 0;j < 100000;j++)
			{
				b[j] = 0;
			}
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < m;k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
					   b[j]++;
					}
				}
			}
			x = 0;
			for (j = 0;j < m;j++)
			{
				if (b[j] == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					x = 1;
					break;
				}
			}
			if (x == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

