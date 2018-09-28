package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int g;
		int t;
		String b = new String(new char[300]);
		for (i = 1;;i++)
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
				if (b.charAt(i) != 44)
				{
					break;
				}
		}
		for (j = 1;j <= i;j++)
		{
			for (g = 1;g <= i - j;g++)
			{
				if (a[g] > a[g + 1])
				{
					t = a[g];
					a[g] = a[g + 1];
					a[g + 1] = t;
				}
			}
		}
		if (a[1] == a[i])
		{
			System.out.print("No");
		}
		else
		{
			for (j = i;;j--)
			{
				if (a[j - 1] != a[j])
				{
					System.out.printf("%d",a[j - 1]);
					break;
				}
			}
		}
		return 0;
	}
}

