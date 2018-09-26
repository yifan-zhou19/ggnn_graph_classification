package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[510]);
		char[][] b = new char[510][6];
		int[] c = new int[510];
		int i;
		int j;
		int s;
		int n;
		int l;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
		b[i][j] = 0;
		}
		for (i = 0;i <= l - n;i++)
		{
			s = 1;
			for (j = 0;j < i;j++)
			{
		if (c[j] != -1)
		{
			if (strcmp(b[i],b[j]) == 0)
			{
			c[j] += 1;
			c[i] = -1;
			s = 0;
			break;
			}
		}
			}
		if (s != 0)
		{
			c[i] += 1;
		}
		}
		for (i = 0;i <= l - n;i++)
		{
			if (c[i] > m)
			{
				m = c[i];
			}
		}
		if (m > 1)
		{
			System.out.printf("%d\n",m);
			for (i = 0;i <= l - n;i++)
			{
			if (c[i] == m)
			{
				System.out.println(b[i]);
			}
			}
		}
		else
		{
			System.out.print("NO");
		}


	}
}

