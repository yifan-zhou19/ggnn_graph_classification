package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	char[][] a = new char[100][101];
	char[][] b = new char[100][101];

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = tempVar3.charAt(0);
		}
	for (i = 1;i < n;i++)
	{
		System.out.print("\n");
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[i] = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[i] = tempVar5.charAt(0);
		}
	}
	for (i = 0;i < n;i++)
	{
		int[] c = new int[101];
		int j;
		int l1;
		int l2;
		String d = new String(new char[101]);
			l1 = String.valueOf(a[i]).length();
			l2 = String.valueOf(b[i]).length();
			for (m = 0;m < (l1 - l2);m++)
			{
				d = tangible.StringFunctions.changeCharacter(d, m, '0');
			}
			for (m = 1;m <= l2;m++)
			{
				d = tangible.StringFunctions.changeCharacter(d, l1 - m, b[i][l2 - m]);
			}
			for (j = 1;j <= l1;j++)
			{

				if (a[i][l1 - j] >= d.charAt(l1 - j))
				{
					c[j] = a[i][l1 - j] - d.charAt(l1 - j);
				}
				else
				{
					c[j] = (10 + a[i][l1 - j]) - d.charAt(l1 - j);
					a[i][l1 - j - 1] = a[i][l1 - j - 1] - 1;
				}
			}

			for (j = l1;j >= 1;j--)
			{
				System.out.printf("%d",c[j]);
			}
				System.out.print("\n");

	}
	}
}

