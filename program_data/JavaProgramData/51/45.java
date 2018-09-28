package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] c = new int[500];
		int max = 0;
		int i;
		int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String a = new String(new char[510]);
	a = new Scanner(System.in).nextLine();
	int la = a.length();
	char[][] b = new char[500][5];
	for (i = 0;i <= la - n;i++)
	{
		for (j = 0;j < n;j++)
		{
			b[i][j] = a.charAt(i + j);
		}
		b[i][n] = '\0';
	}
	for (i = 0;i <= la - n;i++)
	{
	for (j = i;j <= la - n;j++)
	{
		if (strcmp(b[i],b[j]) == 0)
		{
			c[i]++;
		}
	}
	if (c[i] > max)
	{
	max = c[i];
	}
	}
	if (max == 1)
	{
	System.out.print("NO");
	}
	else
	{
	System.out.printf("%d\n",max);
	for (i = 0;i <= la - n;i++)
	{
		if (c[i] == max)
		{
			System.out.println(b[i]);
		}

	}

	}
	return 0;
	}

}

