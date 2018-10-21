package <missing>;

public class GlobalMembers
{
	///#include<stdlib.h>
	///#include<math.h>
	public static int Main()
	{
		String s = new String(new char[301]);
		int i;
		int len;
		int b = 0;
		int[] A = new int[26];
		int[] a = new int[26];
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				A[s.charAt(i) - 'A']++;
				b = 1;
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				a[s.charAt(i) - 'a']++;
				b = 1;
			}
		}
		if (b == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (A[i] != 0)
				{
					System.out.printf("%c=%d\n", 'A' + i, A[i]);
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%c=%d\n", 'a' + i, a[i]);
				}
			}
		}
		return 0;
	}

}
