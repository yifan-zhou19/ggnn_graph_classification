package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int k;
		int n;
		int o;
		int d;
		String a = new String(new char[10000]);
		int[] b = new int[10000];
		b[0] = 0;
		char c = '0';
		for (i = 0;i < 10000;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == 10)
			{
				break;
			}
		}
		for (j = 0,k = 0;j < i;j++)
		{
			if (a.charAt(j) >= '0' && a.charAt(j) <= '9')
			{
				b[k] = b[k] * 10 + (a.charAt(j) - c);
			}
			if (a.charAt(j) == ',')
			{
				k++;
				b[k] = 0;
			}
		}
		for (o = 0;o < k;o++)
		{
			for (n = 0;n < k;n++)
			{
				if (b[n] <= b[n + 1])
				{
					d = b[n];
					b[n] = b[n + 1];
					b[n + 1] = d;
				}
			}
		}
		for (j = 0;j < k;j++)
		{
			if (b[j] > b[j + 1])
			{
				System.out.printf("%d",b[j + 1]);
				return 0;
			}


		}
		if (j = k != 0 || k == 0)
		{
			System.out.print("No");
		}

		return 0;
	}
}

