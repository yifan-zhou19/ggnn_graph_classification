package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] n = new int[100];
		int[] b = new int[100];
		int c;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (t = 0;a.charAt(t) != '\0';t++)
		{
			n[t] = a.charAt(t) - '0';
		}

		c = n[0];
		for (i = 0;i < t - 1;i++)
		{
			b[i] = (c * 10 + n[i + 1]) / 13;
			c = c * 10 + n[i + 1] - 13 * b[i];
		}
		if (b[0] == 0 && t != 1 && t != 2)
		{
			for (j = 1;j < t - 1;j++)
			{
				System.out.printf("%d",b[j]);
			}
		}
		else if (t == 1)
		{
			System.out.print("0");
		}
		else if ((10 * n[0] + n[1]) < 13)
		{
			System.out.print("0");
		}
		else
		{
			for (j = 0;j < t - 1;j++)
			{
				System.out.printf("%d",b[j]);
			}
		}
		System.out.printf("\n%d",c);
	}


}

