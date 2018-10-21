public class minus
{
	public String a = new String(new char[N]);
	public String b = new String(new char[N]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		minus[] c = tangible.Arrays.initializeWithDefaultminusInstances(N);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i].b = tempVar3.charAt(0);
			}
			System.out.print("\n");
		}
		for (i = 0;i < n;i++)
		{
			int k1;
			int k2;
			int j;
			int k;
			String str = new String(new char[N]);
			char d;
			k1 = String.valueOf(c[i].a).length();
			k2 = String.valueOf(c[i].b).length();
			for (j = k1 - 1,k = k2 - 1;j >= k1 - k2,k >= 0;j--,k--)
			{
				d = c[i].a.charAt(j) - c[i].b.charAt(k) + '0';
				if (d >= '0')
				{
					str = tangible.StringFunctions.changeCharacter(str, j, d);
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, j, 10 + d);
					c[i].a = tangible.StringFunctions.changeCharacter(c[i].a, j - 1, c[i].a.charAt(j - 1) - 1);
				}
			}
			//printf("%c",c[i].a[k1-k2-1]);
			for (j = 0;j < k1 - k2;j++)
			{
				str = tangible.StringFunctions.changeCharacter(str, j, c[i].a.charAt(j));
			}
			str = tangible.StringFunctions.changeCharacter(str, k1, '\0');
			System.out.printf("%s",str);
			System.out.print("\n");
		}
		return 0;
	}
}

