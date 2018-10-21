package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[26];
		int n;
		int i;
		int I;
		int j;
		int p;
		int k;
		String s = new String(new char[100000]);
		char first = 124;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (I = 1;I <= n;I++)
		{
			first = 124;
			for (j = 0;j <= 25;j++)
			{
			a[j] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (j = 0;j < s.length();j++)
			{
				a[s.charAt(j) - 97]++;
				if ((a[s.charAt(j) - 97] == 1) && (first == 124))
				{
					p = 0;
					for (k = j + 1;k < s.length();k++)
					{
					if (s.charAt(k) == s.charAt(j))
					{
						p = 1;
					}
					}
					if (p == 0)
					{
					first = s.charAt(j);
					}
				}

			}

			p = 0;
			for (i = 0;i <= 25;i++)
			{
			if (a[i] == 1)
			{
			p = 1;
			}
			}
			if (p == 0)
			{
			System.out.print("no\n");
			}
			else
			{
			System.out.printf("%c\n",first);
			}
		}
	}

}

