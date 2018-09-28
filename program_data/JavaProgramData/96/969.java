package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		int n;
		int i;
		int j;
		int[] b = new int[110];
		int[] c = new int[110];
		int sum = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		//memset(b,0,sizeof(b) );
		n = a.length();
		if (n == 1)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(a.charAt(0));
			return 0;
		}

		if (n >= 2)
		{
		for (i = 0; i < n; i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (n == 2 && (b[0] * 10 + b[1]) < 13)
		{
			sum = b[0] * 10 + b[1];
			System.out.print('0');
			System.out.print("\n");
			System.out.print(sum);
			System.out.print("\n");
			return 0;
		}
		sum = b[0] * 10 + b[1];
		j = 0;
		if (sum > 12)
		{
			c[j] = sum / 13;
			j++;
			sum = sum % 13;
		}
		if (n > 1)
		{
		for (i = 2; i < n; i++)
		{
			sum = sum * 10 + b[i];

				c[j] = sum / 13;
				sum = sum % 13;
				j++;
				//cout <<c[j-1] << ' '<< sum <<endl;

		}
		for (i = 0 ; i < j; i++)
		{
			System.out.print(c[i]);
		}
		System.out.print("\n");
		System.out.print(sum);
		}
		}
		return 0;
	}
}

