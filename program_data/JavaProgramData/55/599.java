package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int p;
		int i;
		int n;
		int x;
		int ten = 0;
		int k;
		int j;
		int q;
		int y;
		int sum = 0;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p = Integer.parseInt(tempVar3);
		}
		n = c.length();
		if (c[0] == '0')
		{
			System.out.print("0\n");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
			if (c[i] >= 'A' && c[i] <= 'Z')
			{
				c[i] += 32;
			}
			}
			for (i = n - 1;i >= 0;i--)
			{
				if (c[i] >= 'a' && c[i] <= 'z')
				{
					x = (c[i] - 87) * Math.pow(m,n - 1 - i);
				}
				else
				{
					x = (c[i] - 48) * Math.pow(m,n - 1 - i);
				}
				ten = ten + x;
			}
			sum = ten;
			k = ten;
			i = 0;
			while (k != 0)
			{
				k = k / p;
				i++;
			}
			for (j = 0;j < i;j++)
			{
				ten = sum;
				for (y = j + 1;y < i;y++)
				{
					ten = ten / p;
				}
				q = ten % p;
				if (q <= 9)
				{
					System.out.printf("%c",q + 48);
				}
				if (q > 9)
				{
					System.out.printf("%c",q + 55);
				}
			}
		}
			return 0;
	}


}

