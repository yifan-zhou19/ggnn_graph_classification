package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int lo = 1;
		int sh = 1000;
		int i = 0;
		char[][] a = new char[50][20];
		int[] len = new int[50];
		String longest = new String(new char[20]);
		String shortest = new String(new char[20]);
		while (scanf("%s", a[i]) != EOF)
		{
			len[i] = String.valueOf(a[i]).length();
			if (len[i] > lo)
			{
				longest = a[i];
				lo = len[i];
			}
			if (len[i] < sh)
			{
				shortest = a[i];
				sh = len[i];
			}
			i = i + 1;
		}
		System.out.printf("%s\n",longest);
		System.out.printf("%s",shortest);
	}


}
