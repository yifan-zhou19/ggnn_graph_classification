package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[550]);
		String b = new String(new char[6]);
		int i;
		int j;
		int k;
		int l;
		int n;
		int[] a = new int[550];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			for (j = i + 1;s.charAt(j) != '\0';j++)
			{
				l = 0;
				for (k = 0;k <= n - 1;k++)
				{
					if (s.charAt(i + k) != s.charAt(j + k))
					{
						l = 1;
					}
				}
				if (l == 0)
				{
					a[i]++;
				}
			}
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			l = 0;
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				if (a[i] < a[j])
				{
					l = 1;
				}
			}
			if (l == 0)
			{
				break;
			}
		}
		if (a[i] == 0)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",a[i] + 1);
		k = a[i];
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (a[i] == k)
			{
				for (j = 0;j <= n - 1;j++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, s.charAt(i + j));
				}
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			System.out.printf("%s\n",b);
			}
		}
	return 0;
	}
}

