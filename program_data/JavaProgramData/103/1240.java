package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int l;
		int[] f = new int[1002];
		int g;
		String s = new String(new char[1002]);
		String a = new String(new char[1002]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		if (l == 1)
		{
			if (s.charAt(0) >= 65 && s.charAt(0) <= 90)
			{
				System.out.printf("(%c,%d)",s.charAt(0),1);
			}
			else
			{
				System.out.printf("(%c,%d)",s.charAt(0) - 32,1);
			}
		}
		else
		{
			for (i = 1;i <= l;i++)
			{
			k = i - 1;
			f[k] = 1;
			for (;i < l;i++)
			{
				if (s.charAt(i) == s.charAt(k) || Math.abs(s.charAt(i) - s.charAt(k)) == 32)
				{
					f[k]++;
				}
				else
				{
					break;
				}
			}
			if (s.charAt(k) >= 65 && s.charAt(k) <= 90)
			{
				System.out.printf("(%c,%d)",s.charAt(k),f[k]);
			}
			else
			{
				System.out.printf("(%c,%d)",s.charAt(k) - 32,f[k]);
			}
			}
		}
		return 0;
	}


}
