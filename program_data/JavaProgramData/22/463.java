package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[301];
	public static String b = new String(new char[301]);
	public static int Main()
	{
		int i;
		int n;
		int j;
		int temp;
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < 300;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 300;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			if (b.charAt(i) != '\n')
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i + 1] = Integer.parseInt(tempVar3);
			}
			}
			else
			{
				if (b.charAt(i) == '\n')
				{
				break;
				}
			}
		}
		n = b.length();
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] == a[i])
				{
					a[j] = -1;
				}
			}
		}
		if (n != 1)
		{
			for (j = 0;j < n;j++)
			{
				for (i = 1;i < (n - j);i++)
				{
					if (a[i - 1] < a[i])
					{
						temp = a[i - 1];
						a[i - 1] = a[i];
						a[i] = temp;
					}
				}
			}
			if (a[1] != -1)
			{
				System.out.printf("%d\n", a[1]);
			}
			else
			{
				System.out.print("No\n");
			}
		}
		else
		{
			System.out.print("No\n");
		}

		return 0;
	}
}

