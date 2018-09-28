package <missing>;

public class GlobalMembers
{
	public static void cheng(tangible.RefObject<String> a)
	{
		int t;
		int[] w = new int[100];
		int i;
		int k;
		int j = 0;
		int s = 0;
		t = a.argValue.length();
		for (i = t - 1;i >= 0;i--)
		{
			w[j] = a.argValue.charAt(i) - '0';
			w[j] = 2 * w[j];
			j++;
		}


		for (i = 0;i <= t - 1;i++)
		{
			w[i + 1] = w[i] / 10 + w[i + 1];
			w[i] = w[i] % 10;
		}
	j = 90;
	while (w[j] == 0)
	{
		j--;
	}

	for (i = j;i >= 0;i--)
	{
			a.argValue.charAt(s) = w[i] + '0';
			s++;
	}
	}
	public static int Main()
	{

		int n;
		int i;
		int s;
		char[] a = {'1', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
			cheng(tempRef_a);
			a = tempRef_a.argValue;
		}
		s = a.length();
	for (i = 0;i <= s - 1;i++)
	{
			System.out.print(a[i]);
	}
		return 0;
	}


}

