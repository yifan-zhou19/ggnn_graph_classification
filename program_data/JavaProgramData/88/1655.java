package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		String[] pt = new String[30];
		int i;
		int j;
		int l;
		int[] s = new int[30];
		int m;
		l = a.length();
		j = 0;
		i = 0;
		if (a.charAt(0) < 58 && a.charAt(0)>47)
		{
			pt[0] = a.charAt(0);
			j = 1;
		}
		for (i = 1;i < l;i++)
		{
			if (a.charAt(i) < 58 && a.charAt(i)>47 && (a.charAt(i - 1) > 58 || a.charAt(i - 1) < 47))
			{
				pt[j] = a.charAt(i);
				j = j + 1;
			}
			else
			{
				if (a.charAt(i - 1) < 58 && a.charAt(i - 1)>47 && (a.charAt(i) > 58 || a.charAt(i) < 47))
				{
					s[j - 1] = (a.charAt(i) - pt[j - 1]);
				}
			}
		}
		if (a.charAt(l - 1) < 58 && a.charAt(l - 1)>47)
		{
			s[j - 1] = (a.charAt(l - 1) - pt[j - 1] + 1);
		}
		for (i = 0;i < j;i++)
		{
			for (m = 0;m < s[i];m++)
			{
				System.out.printf("%c",*(pt[i] + m));
			}
			System.out.print("\n");
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
	}
}

