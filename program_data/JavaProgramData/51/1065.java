package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[2000];
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		int max;
		int count = 0;
	String a = new String(new char[3000]);
	String c = new String(new char[10]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = new Scanner(System.in).nextLine();
	m = a.length();

	for (i = 0;i < m - n;i++)
	{
		for (j = 0;j < n;j++) //???????c
		{
		c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i + j));
		}
	b[i] = 1;

	for (k = i + 1;k < m;k++) //bijiao
	{
			for (j = 0;j < n;j++)

			{
			if (c.charAt(j) == a.charAt(k + j))
			{
				if (j == n - 1)
				{
					b[i]++;
				}
			} //????b++
		else
		{
			break;
		}
			}
	}
	}

	max = 0;
	for (i = 0;i < m;i++)
	{
		if (b[i] > max)
		{
			max = b[i];
		}
	}

	if (max > 1)
	{
		System.out.printf("%d\n",max);
	for (i = 0;i < m;i++)
	{
		if (b[i] == max)
		{
		for (j = 0;j < n;j++)
		{
	System.out.printf("%c",a.charAt(i + j));
		}
	System.out.print("\n");
		}
	}
	}
	else
	{
		System.out.print("NO\n");
	}



	System.in.read();
	System.in.read();
	System.in.read();
	}
}

