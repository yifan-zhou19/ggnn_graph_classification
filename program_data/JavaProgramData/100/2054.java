package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[200];
		int t = 0;
		for (i = 65;i <= 130;i++)
		{
			a[i] = -10000;
		}
		String str = new String(new char[1000]);
		for (i = 65;i <= 90;i++)
		{
			a[i] = 0;
		}
		for (i = 97;i < 133;i++)
		{
			a[i] = 0;
		}
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			a[str.charAt(i)]++;
		}
		for (i = 65;i <= 130;i++)
		{
			if (a[i] > 0)
			{
				t = 1;
				System.out.printf("%c=%d\n",i,a[i]);
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}
