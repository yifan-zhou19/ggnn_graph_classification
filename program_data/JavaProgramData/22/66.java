package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		final String b = "";
		int j;
		int i;
		int m = 0;
		int t;
		int p;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			if (b.charAt(i) == '\n')
			{
				break;
			}
		}
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{
		for (j = 0;j <= i;j++)
		{
			for (p = 0;p < i;p++)
			{
				if (a[p] < a[p + 1])
				{
					t = a[p];
					a[p] = a[p + 1];
					a[p + 1] = t;
				}
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (a[j] == a[0])
			{
				m++;
			}
		}
		if (m == (i + 1))
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",a[m]);
		}
		}
	}


}

