package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i = 1;
		int j;
		int k;
		int t;
		int p = 0;
		String b = new String(new char[1000]);
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			if (b.charAt(i) != ',')
			{
				break;
			}
		}
	for (j = 1;j <= i - 2;j++)
	{
	for (k = j + 1;k <= i - 1;k++)
	{
	if (a[k] <= a[j])
	{
		t = a[k];
	a[k] = a[j];
	a[j] = t;
	}
	}
	}

	for (j = i - 1;j >= 2;j--)
	{
		if (a[j] > a[j - 1])
		{
			System.out.printf("%d",a[j - 1]);
			p = 1;
			break;
		}
	}
	if (p == 0)
	{
		System.out.print("No");
	}


		return 0;
	}
}

