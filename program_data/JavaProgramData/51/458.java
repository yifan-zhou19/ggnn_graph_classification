package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[501]);
		char[][] a = new char[250][6];
		String m = new String(new char[6]);
		int[] b = new int[250];
		int max = 0;
		int i;
		int n;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		for (i = 0,k = 0;;i++,k++)
		{
			for (j = 0;j < n;j++)
			{
			   m = tangible.StringFunctions.changeCharacter(m, j, s.charAt(j + i));
			}
			m = tangible.StringFunctions.changeCharacter(m, n, '\0');
			if (m.charAt(n - 1) == '\0')
			{
				break;
			}
			for (j = 0;j < k;j++)
			{
			if (strcmp(a[j],m) == 0)
			{
				break;
			}
			}
			if (j != k)
			{
				b[j]++;
			k--;
			}
			else
			{
				a[k] = m;
			b[k] = 1;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
		for (i = 0;i < k;i++)
		{
			if (max == b[i])
			{
				System.out.printf("%s\n",a[i]);
			}
		}
		}
		return 0;
	}

}

