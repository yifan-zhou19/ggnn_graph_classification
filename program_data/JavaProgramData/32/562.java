package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d;
		int n;
		int i;
		int j;
		int l1;
		int l2;
		int[] a1 = new int[10000];
		int[] a2 = new int[10000];
	String str1 = new String(new char[10000]);
	char qq;
	String str2 = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			qq = tempVar2.charAt(0);
		}
		l1 = str1.length();
	l2 = str2.length();
	for (j = 0;j <= l1 - 1;j++)
	{
		a1[j] = str1.charAt(j) - 48;
	}

	for (j = 0;j <= l2 - 1;j++)
	{
		a2[j] = str2.charAt(j) - 48;
	}

	j = 1;
	d = 0;
	while (l2 >= j)
	{
		a1[l1 - j] = a1[l1 - j] - a2[l2 - j] - d;
		if (a1[l1 - j] < 0)
		{
			a1[l1 - j] = a1[l1 - j] + 10;
			d = 1;
		}
		else
		{
			d = 0;
		}
	j = j + 1;
	}
	if (l1 - j >= 0)
	{
		a1[l1 - j] = a1[l1 - j] - d;
	}
	for (j = 0;j <= l1 - 1;j++)
	{
		System.out.printf("%d",a1[j]);
	}
	System.out.print("\n");
		}
	}





}

