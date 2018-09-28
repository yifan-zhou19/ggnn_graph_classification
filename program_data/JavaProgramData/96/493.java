package <missing>;

public class GlobalMembers
{
	//????????
	public static int Main()
	{
		String s = new String(new char[10000]);
		int len;
		int i;
		int j = 0;
		int k = 0;
		int t = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = s.length();
		a[0] = len;
		for (i = 1;i <= len;i++)
		{
			a[i] = (int)s.charAt(i - 1) - 48;
		}
		if (len == 1)
		{
			System.out.print(a[1] / 13);
			System.out.print("\n");
			System.out.print(a[1] % 13);
			System.out.print("\n");
		}
		else
		{
		if (len == 2)
		{
			j = 10 * a[1] + a[2];
			System.out.print(j / 13);
			System.out.print("\n");
			System.out.print(j % 13);
			System.out.print("\n");
		}
		else
		{
			j = a[1] * 10 + a[2];
			i = 2;
			k = 1;
			while (i < len)
			{
				b[k] = j / 13;
				j = j - b[k] * 13;
				i++;
				j = j * 10 + a[i];
				k++;
			}
			b[k] = j / 13;
			j = j - b[k] * 13;
			t = 1;
			while (b[t] == 0)
			{
				t++;
			}
			for (i = t;i <= k;i++)
			{
				System.out.print(b[i]);
			}
			System.out.print("\n");
			System.out.print(j);
			System.out.print("\n");
		}
		}
		return 0;
	}

}

