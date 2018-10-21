package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int max;
		int sec;
		int i;
		int j;
		String b = new String(new char[300]);
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
		max = a[0];
		sec = -1;
		for (j = 1;j <= i;j++)
		{
			if (a[j] > max)
			{
				sec = max;
				max = a[j];

			}
			if (a[j] < max && a[j]> sec)
			{
				sec = a[j];
			}
		}
		if (sec == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",sec);
		}
		return 0;
	}


}

