package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s = new String(new char[302]);
		int i;
		int len;
		int f;
		int[] a = new int[30];
		int[] b = new int[30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;i <= 27;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		len = s.length();
		f = 0;
		for (i = 0;i < len;i++)
		{
			if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
			{
				a[s.charAt(i) - 'A']++;
				f = 1;
			}
			if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
			{
				b[s.charAt(i) - 'a']++;
				f = 1;
			}
		}
		if (f == 0)
		{
			System.out.print("No");
			return 0;
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] > 0)
			{
				System.out.printf("%c=%d\n",i + 'A',a[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] > 0)
			{
				System.out.printf("%c=%d\n",i + 'a',b[i]);
			}
		}
		return 0;
	}

}

