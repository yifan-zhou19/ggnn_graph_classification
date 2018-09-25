package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
	int[][] cishu = new int[2][26];
	int i;
	int j;
	int k = 0;
	int n;
	int sum;
	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (j = 'a';j <= 'z';j++)
	{
			sum = 0;
		cishu[0][k] = j;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == j)
			{
				sum++;
			}
		}
		cishu[1][k] = sum;
		k++;
	}
	for (k = 0;k < 26;k++)
	{
		if (cishu[1][k] != 0)
		{
			break;
		}
	}
	if (k == 26 && cishu[1][25] == 0)
	{
		System.out.print("No");
	}
	for (k = 0;k < 26;k++)
	{
			if (cishu[1][k] == 0)
			{
				continue;
			}
		 System.out.printf("%c=%d\n",cishu[0][k],cishu[1][k]);
	}
	}

}
