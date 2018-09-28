package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int MAXLEN;
		int flag = 0;
		String s1 = new String(new char[500]);
		String s2 = new String(new char[500]);
		int[] a1 = new int[500];
		int[] a2 = new int[500];
		int[] a = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		for (i = 0;i < s1.length();i++)
		{
			a1[s1.length() - 1 - i] = s1.charAt(i) - '0';
		}
		for (i = 0;i < s2.length();i++)
		{
			a2[s2.length() - 1 - i] = s2.charAt(i) - '0';
		}
		MAXLEN = (s1.length() >= s2.length())?s1.length():s2.length();
		for (i = 0;i < MAXLEN;i++)
		{
			t = a1[i] + a2[i] + a[i];
			if (t >= 10)
			{
				if (i != MAXLEN - 1)
				{
					a[i] = t % 10;
					a[i + 1] = 1;
					j = MAXLEN;
				}
				else
				{
					a[i] = t % 10;
					a[i + 1] = 1;
					j = MAXLEN + 1;
				}
			}
			else
			{
				a[i] = t;
				j = MAXLEN;
			}
		}
		for (i = j - 1;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				flag = 1;
				if (flag != 0)
				{
					System.out.printf("%d",a[i]);
				}
			}
			else
			{
				if (flag != 0)
				{
					System.out.printf("%d",a[i]);
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("0");
		}
		return 0;
	}
}

