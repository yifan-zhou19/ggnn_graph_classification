package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int max = 0;
		int[] c = new int[501];
		String a = new String(new char[501]);
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		m = a.length();
		for (j = 0;j <= m - n;j++)
		{
		for (i = 0;i < n;i++)
		{
						 b[j][i] = a.charAt(i + j);
		}
		}
		for (j = 0;j <= m - n;j++)
		{
							for (i = j + 1;i <= m - n;i++)
							{
												  if (strcmp(b[i],b[j]) == 0)
												  {
																		   c[j]++;
												  }
							}
		}
		for (i = 0;i <= m - n;i++)
		{
						   if (c[i] > c[max])
						   {
										   max = i;
						   }
		}
		if (c[max] == 0)
		{
			System.out.print("NO");
		}
		if (c[max] != 0)
		{
		System.out.printf("%d\n",c[max] + 1);
		for (j = 0;j <= m - n;j++)
		{
						   if (c[j] == c[max])
						   {
										   for (i = 0;i < n;i++)
										   {
										   System.out.printf("%c",b[j][i]);
										   }
						 System.out.print("\n");
						   }
		}
		}
		return 0;
	}
}

