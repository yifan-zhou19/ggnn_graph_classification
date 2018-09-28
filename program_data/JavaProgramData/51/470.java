package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //a????
		int i;
		int j;
		int k;
		int[] a = new int[500];
		int max;
		int len;
		int m;
		String s = new String(new char[502]); //c????n?????
		char[][] c = new char[500][10];
		String b = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		len = s.length();
		for (i = 0;i < n;i++)
		{
			c[1][i] = s.charAt(i);
		}
		c[1][n] = '\0';
		a[1] = 1;
		j = 1;
		for (i = 1;i < len - n + 1;i++)
		{
			for (k = 0;k < n;k++)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, s.charAt(i + k));
			}
			b = tangible.StringFunctions.changeCharacter(b, n, '\0');
			for (m = 1;m < j + 1;m++)
			{
				if (strcmp(b,c[m]) == 0)
				{
				break;
				}
			}
			if (m == j + 1)
			{
				j++;
				c[j] = b;
				a[j] = 1;
			}
			else
			{
				a[m]++;
			}
		}
		max = 1;
		for (i = 1;i < 500;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
			return 0;
		}
		System.out.printf("%d\n",max);
		for (i = 1;i < 500;i++)
		{
			if (a[i] == max)
			{
			System.out.printf("%s\n",c[i]);
			}
		}
		return 0;
	}




}

