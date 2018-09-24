package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[5];
	int i;
	int m;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a[0] = n % 10;
	a[1] = (n / 10) % 10;
	a[2] = (n / 100) % 10;
	a[3] = (n / 1000) % 10;
	a[4] = (n / 10000) % 10;

	if (n == 0) //????0,if?????,????==
	{
		System.out.print(0);
	}
	else
	{
		i = 4;
	while (a[i] == 0) //do-while???????
	{
	m = i;
	i--;
	}
	for (i = 0;i < m;i++)
	{
	System.out.print(a[i]);
	}
	}
	return 0;
	}

}

