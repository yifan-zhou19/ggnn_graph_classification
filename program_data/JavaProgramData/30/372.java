package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {'0', '1'}; //a??????n??
		int n; //s???????
		int i;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++,a[1]++)
		{
			if (i % 7 != 0 && a[0] != '7' && a[1] != '7')
			{
				s = s + i * i; //?????7??
			}
			if (a[1] == '9')
			{
				a[0]++;
				a[1] = '0' - 1;
			}
		}
		System.out.print(s);
		System.out.print("\n");
	}
}

