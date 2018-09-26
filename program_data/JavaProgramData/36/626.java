package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[2][100];
		int i;
		int j;
		int k;
		int[] l = new int[2];
		int b = 0;
		char temp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a[1] = tempVar2.charAt(0);
		}
		l[0] = String.valueOf(a[0]).length();
		l[1] = String.valueOf(a[1]).length();
		if (l[0] != l[1])
		{
			b = 1;
		}
		else
		{
			for (k = 0;k < 2;k++)
			{
				for (i = 0;i < l[k] - 1;i++)
				{
					for (j = 0;j < l[k] - i;j++)
					{
						if (a[k][j] < a[k][j + 1])
						{
							temp = a[k][j];
							a[k][j] = a[k][j + 1];
							a[k][j + 1] = temp;
						}
					}
				}
			}
			if (strcmp(a[0],a[1]) == 0)
			{
				b = 0;
			}
			else
			{
				b = 1;
			}
		}
		if (b == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

}

