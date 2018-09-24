package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e = 0;
		int[] c = new int[550];
		int k;
		int max = 1;
		int i;
		int j;
		final String a = "";
		final String b = "";
		final String d = "";
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
		for (i = 0;i <= a.length() - n;i++)
		{
			for (j = i;j < i + n;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, e, a.charAt(j));
				e++;
			}
			e = 0;
			for (j = i;j <= a.length() - n;j++)
			{
				for (k = j;k < j + n;k++)
				{
					d = tangible.StringFunctions.changeCharacter(d, e, a.charAt(k));
					e++;
				}
				e = 0;
				if (strcmp(b,d) == 0)
				{
					c[i]++;
				}
			}
		}
		for (i = 0;i <= a.length() - n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		if (max > 1)
		{
			System.out.printf("%d\n",max);
		}
		else
		{
			System.out.print("NO\n");
			return 0;
		}
		for (i = 0;i <= a.length() - n;i++)
		{
			if (c[i] == max)
			{
				for (j = i;j < i + n;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}

}

