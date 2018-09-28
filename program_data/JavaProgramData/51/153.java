package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int[] c = new int[500];
		final String d = "";
		int n;
		int i;
		int j;
		int max = 0;
		int k;
		int z = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i <= k - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b.charAt(i)[j] = a.charAt(i + j);
			}
			b.charAt(i)[n] = '\0';
		}
		for (i = 0;i <= k - n;i++)
		{
			if (b.charAt(i)[0] != 32)
			{
				z++;
				d = tangible.StringFunctions.changeCharacter(d, z, b.charAt(i));
			}
			for (j = k - n;j >= i;j--)
			{
				if (b.charAt(j)[0] != 32)
				{
					if (strcmp(b.charAt(i),b.charAt(j)) == 0)
					{
						c[z]++;
						b.charAt(j)[0] = 32;
					}
				}
			}
			if (max < c[z])
			{
				max = c[z];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d",max);
		for (i = 0;i <= z;i++)
		{
			if (c[i] == max)
			{
				System.out.printf("\n%s",d.charAt(i));
			}
		}
		}
	}

}

