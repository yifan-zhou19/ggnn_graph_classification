package <missing>;

public class GlobalMembers
{
	/*&#206;&#210;&#213;&#230;&#207;&#235;&#214;�&#189;&#211;�&#180;�&#197;&#202;&#228;&#179;&#246;&#193;&#203;&#161;&#173;&#161;&#173;&#181;&#171;&#202;&#199;&#196;&#199;&#204;&#171;&#178;&#187;&#181;&#192;&#181;&#194;&#193;&#203;&#205;&#219;&#185;&#254;&#185;&#254;&#185;&#254;*/
	public static int Main()
	{
		int tmp;
		int t;
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = n / 2 - 1;
		for (int i = 0; i <= n - 1; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i <= t; ++i)
		{
			tmp = a[n - 1 - i];
			a[n - 1 - i] = a[i];
			a[i] = tmp;
		}
		System.out.print(a[0]);
		for (int i = 1; i <= n - 1; ++i)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		return 0;
	}
}

