package <missing>;

public class GlobalMembers
{
	public static char[][] c = new char[10000][100]; ///??
	public static int count(String a) ///??????????
	{
		int num = 0;
		while (!a[num].equals('\0'))
		{
			num++;
		}
		return (num);
	}
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int l = 0;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[10000]; ///??????
		for (i = 0;i < n;i++)
		{
			c[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = count(c[i]);
		}
		while (k < n - 1) ///??
		{
			l = 0;
			while (l + b[k] + b[k + 1] + 1 <= 80)
			{
				System.out.print(c[k]);
				System.out.print(' ');
				l = l + b[k];
				k++;
				l++;
				if (k == n - 1)
				{
					break;
				}
			}
			if (k == n - 1)
			{
				break;
			}
			System.out.print(c[k]);
			System.out.print("\n");
			k++;
			l++;
			//cout <<l<<endl;
		}
		if (l + b[n - 1] <= 80)
		{
		System.out.print(c[n - 1]);
		System.out.print("\n");
		}
		return (0);
	}

}

