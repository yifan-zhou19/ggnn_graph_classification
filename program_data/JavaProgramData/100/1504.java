package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[350]);
		int i;
		int j;
		int n;
		int[] a = new int[123];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
		n = ch.length();

		for (i = 0;i < 123;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if ((ch.charAt(i) > 64) && (ch.charAt(i) < 123))
			{
			  a[ch.charAt(i)]++;
			}
		}

		j = 1;
		for (i = 65;i <= 90;i++)
		{
			if (a[i] > 0)
			{
			  System.out.printf("%c=%d\n",i,a[i]);
			  j = 0;
			}
		}
		for (i = 97;i <= 122;i++)
		{
			if (a[i] > 0)
			{
			  System.out.printf("%c=%d\n",i,a[i]);
			  j = 0;
			}
		}
		if (j != 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}

