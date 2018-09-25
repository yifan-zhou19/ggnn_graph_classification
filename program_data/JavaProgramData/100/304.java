package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int[][] b = new int[26][1];
		int i;
		int n;
		int k = 97;
		int m = 0;
		int j;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i <= 25;i++)
		{
		   for (j = 0;j <= n - 1;j++)
		   {
			   if (a.charAt(j) == k)
			   {
				 b[i][0] = b[i][0] + 1;
			   }
		   }
		   k++;
		}
		for (i = 0;i <= 25;i++)
		{
			if (b[i][0] == 0)
			{
				m++;
			}
		}
		if (m == 26)
		{
			System.out.print("No");
		}
		for (i = 0;i <= 25;i++)
		{
			if (b[i][0] != 0)
			{
				System.out.printf("%c=%d\n",i + 97,b[i][0]);
			}
		}
	}
}
