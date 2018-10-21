package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] p = new int[26];
		int i;
		int n;
		int k;
		String a = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0,k = 0;i < n;i++)
		{
			if (Character.isLowerCase(a.charAt(i)))
			{
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		for (i = 0;i < n;i++)
		{
			if (Character.isLowerCase(a.charAt(i)))
			{
				p[a.charAt(i) - 'a']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (p[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 97,p[i]);
			}
		}
	}




}
