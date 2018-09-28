package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 1;
		int max;
		int sec = -1;
		int j;
		int t;
		for (j = 1;j < 300;j++)
		{
			a[j] = -1;
		}
		String c = new String(new char[300]);
		for (;;)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
				}
				if (c.charAt(i) != ',')
				{
					break;
				}
				i++;
		}
		max = a[1];
		i = 1;
		while (a[i] >= 0)
		{
			if (a[i + 1] > max)
			{
				t = max;
				max = a[i + 1];
				sec = t;
			}
			else if (a[i + 1] < max && a[i + 1]> sec)
			{
				sec = a[i + 1];
			}
			i++;
		}
		if (sec >= 0)
		{
			System.out.printf("%d",sec);
		}
		else
		{
			System.out.print("No");
		}
		return 0;

	}
}

