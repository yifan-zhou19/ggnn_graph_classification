package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int b;
		String word = new String(new char[300]);
		final String ti = "abcdefghijklmnopqrstuvwxyz";
		int[] a = new int[26];
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word = tempVar.charAt(0);
		}
		n = (int)word.length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (word.charAt(i) == ti.charAt(j))
				{
					a[j] = a[j] + 1;
				}
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (a[j] != 0)
			{
				System.out.printf("%c=%d\n",ti.charAt(j),a[j]);
			}
			b = b + a[j];
		}
		if (b == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

