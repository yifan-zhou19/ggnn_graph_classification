package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[300][101];
		char h;
		int i;
		int j = 0;
		int n;
		int[] l = new int[300];
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			h = tempVar.charAt(0);
		}
		i = 0;
		while (h != '\n')
		{
			a[i][j] = h;
			if (h == ' ')
			{
				a[i][j] = '\0';
				i++;
				j = -1;
			}
			j++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				h = tempVar2.charAt(0);
			}
		}
		a[i][j] = '\0';
		n = i + 1;
		j = 0;

		for (i = 0;i < n;i++)
		{
						 if (String.valueOf(a[i]).length() != 0)
						 {
											  l[j] = String.valueOf(a[i]).length();
											  j++;
						 }
		}

		for (i = 0;i < j - 1;i++)
		{
						   System.out.printf("%d,",l[i]);
		}
		System.out.printf("%d",l[j - 1]);


		return 0;
	}
}

