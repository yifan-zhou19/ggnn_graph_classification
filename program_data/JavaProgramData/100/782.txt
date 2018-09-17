package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
		String b = new String(new char[26]);
		char i;
		int[] c = new int[26];
		int k;
		int m = 0;
		int n = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}

		for (i = 'a';i <= 'z';i++)
		{
			m = 0;
			for (k = 0;;k++)
			{
				if (a.charAt(k) == '\0')
				{
					break;
				}
				if (a.charAt(k) == i)
				{
					m++;
					b = tangible.StringFunctions.changeCharacter(b, n, a.charAt(k));
				}
			}
			if (m > 0)
			{
				sum++;
				c[n] = m;
				n++;
			}
		}


		if (sum == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (k = 0;k < sum;k++)
			{
				System.out.printf("%c=%d\n",b.charAt(k), c[k]);
			}
		}
		return 0;
	}
}

