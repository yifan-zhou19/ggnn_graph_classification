package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int k;
		int s;
		int[] c = new int[100];
		int[] b = new int[100];
		int x = 0;
		int t;
		int u;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s = a.length();
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			c[i] = a.charAt(i) - '0';
		}
		for (j = 0; j <= s - 1; j++)
		{
			x = x * 10 + c[j];
			t = x / 13;
			b[j] = t;
			x = x % 13;
		}
		i = 0;
		while (b[i] == 0)
		{
			if ((b[2] == 0) && (b[1] == 0))
			{
				i = 0;
				break;
			}
			else
			{
				i++;
			}
		}
		for (k = i; k <= s - 1; k++)
		{
			if (i == 0)
			{
				System.out.print(0);
				break;
			}
			else
			{
				System.out.print(b[k]);
			}
		}
		System.out.print("\n");
		System.out.print(x);
		return 0;
	}


}

