package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] s = new int[11];
		int[] t = new int[11];
		int m;
		int n;
		int j;
		int k;
		int i;
		int l;
		int a;
		int b;
		int sign = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		s[0] = m;
		t[0] = n;
		for (k = m / 2,i = 1;k != 0;i++)
		{
			s[i] = k;
			k = k / 2;

		}
		for (j = n / 2,l = 1;j != 0;l++)
		{
			t[l] = j;
			j = j / 2;

		}
		for (a = 0;a < i;a++)
		{
			for (b = 0;b < l;b++)
			{
				if (s[a] == t[b])
				{
					sign = 1;
					System.out.printf("%d\n",s[a]);
					break;
				}
			}
			if (sign == 1)
			{
				break;
			}
		}
	}
}

