package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String in = new String(new char[500]);
	char[][] gram = new char[500][6];
	int[] cr = new int[500];

	int i;
	int n;
	int t;
	int len;
	int q;
	int max = 0;
	for (i = 0;i < 500;i++)
	{
		in = in.substring(0, i);
		cr[i] = 0;
	}


	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		in = tempVar2.charAt(0);
	}

	len = in.length();
	q = len + 1 - n;

	for (i = 0;i < 500;i++)
	{
	for (t = 0;t < 6;t++)
	{
		gram[i][t] = 0;
	}
	}

	for (i = 0;i < q;i++)
	{
		for (t = 0;t < n;t++)
		{
			gram[i][t] = in.charAt(i + t);
		}
	}


	for (i = 0;i < q;i++)
	{
	for (t = 0;t < q;t++)
	{
		if (strcmp(gram[i],gram[t]) == 0)
		{
		cr[i]++;
		}
	}
	}


	for (i = 0;i < q;i++)
	{
	max = M(max,cr[i]);
	}
	if (max == 1)
	{
	System.out.print("NO");
	}
	else
	{
	System.out.printf("%d\n",max);

	for (i = q - 1;i >= 0;i--)
	{
	for (t = i - 1;t >= 0;t--)
	{
		if (strcmp(gram[i],gram[t]) == 0)
		{
		cr[i] = 0;
		}
	}
	}
	for (i = 0;i < q;i++)
	{
		if (cr[i] == max)
		{
		System.out.printf("%s\n",gram[i]);
		}
	}

	}


	}
}

