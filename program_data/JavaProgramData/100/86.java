package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[26];
		int i;
		int n;
		int t = 0;
		String b = new String(new char[300]);
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}
		b = new Scanner(System.in).nextLine();
		n = b.length();
		for (i = 0;i < n;i++)
		{
			if (b.charAt(i) - 97 >= 0 && b.charAt(i) - 97 <= 25)
			{
				a[b.charAt(i) - 97]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 97,a[i]);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	}

}

