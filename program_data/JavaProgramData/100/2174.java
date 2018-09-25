package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int m;
		int n;
		int j;
		int i1;
		int j1;
		int i2;
		int j2;
		int s0;
		int s = 0;
		int k = 0;
		int[] count = new int[200];
		char x;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			x = a.charAt(i);
			for (j = 65;j < 91;j++)
			{
				if (x == j)
				{
					count[j]++;
				}
			}
			for (j = 97;j < 123;j++)
			{
				if (x == j)
				{
					count[j]++;
				}
			}
		}
		for (i = 65;i < 123;i++)
		{
			if (count[i] != 0)
			{
				x = i;
				System.out.printf("%c=%d\n",x,count[i]);
				k = 1;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}
