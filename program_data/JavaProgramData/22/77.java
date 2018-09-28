package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		String c = new String(new char[300]);
		int i;
		int num;
		int max;
		int imax;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tangible.StringFunctions.changeCharacter(c, 0, tempVar2);
		}
		for (i = 1;c.charAt(i - 1) == ',';i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar4);
			}
		}
		num = i;
		if (num == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			max = a[0];
		for (i = 0;i < num;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		imax = 0;
		for (i = 0;i < num;i++)
		{
			if (a[i] > imax && a[i] < max)
			{
				imax = a[i];
				t = 1;
			}
		}
			if (t == 1)
			{
			System.out.printf("%d",imax);
			}
			else
			{
				System.out.print("No\n");
			}
		}

	}
}

