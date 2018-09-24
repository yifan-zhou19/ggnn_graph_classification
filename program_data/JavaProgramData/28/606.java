package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int[] beg = new int[300];
		int[] end = new int[300];
		int i;
		int j;
		int n;
		int k = 1;
		int t = 0;
		a = new Scanner(System.in).nextLine();
		beg[0] = 0;
		n = a.length();
		for (i = 0;i < n - 1;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				beg[k] = i + 1;
				k++;
			}
			if (a.charAt(i) != ' ' && a.charAt(i + 1) == ' ')
			{
				end[t] = i;
				t++;
			}
		}
		end[t] = n - 1;
		for (j = 0;j <= t;j++)
		{
			System.out.printf("%d%c",end[j] - beg[j] + 1,(j != t)?',':'\n');
		}
	}
}
