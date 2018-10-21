package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int p;
		int t;
		int[] a = new int[301];
		int max = 0;
		String b = new String(new char[301]);
		for (i = 1;i <= 300;i++)
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
		t = i;
		for (i = 1;i <= t;i++)
		{
			if (a[i] >= max)
			{
				max = a[i];
				p = i;
			}
		}
			for (j = 1;j <= t;j++)
			{
				if (a[j] == max)
				{
					a[j] = 0;
				}
			}
		max = 0;
		for (i = 1;i <= t;i++)
		{
			if (a[i] >= max)
			{
				max = a[i];
			}
		}
		if (max == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",max);
		}
		return 0;
	}

}

