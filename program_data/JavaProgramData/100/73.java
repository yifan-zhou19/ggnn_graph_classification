package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int t;
		int tot = 0;
		int[] b = new int[26];
		String s = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.length();
		for (i = 0;i <= n - 1;i++)
		{
			if (s.charAt(i) <= 122 && s.charAt(i) >= 97)
			{
				t = s.charAt(i) - 97;
			b[t] = b[t] + 1;
			tot = tot + 1;
			}
		}
		for (j = 0;j <= 25;j++)
		{
			if (b[j] != 0)
			{
		System.out.printf("%c=%d\n",j + 97,b[j]);
			}
		}
		if (tot == 0)
		{
			System.out.print("No");
		}
	}

}

