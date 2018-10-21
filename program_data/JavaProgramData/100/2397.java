package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[300]);
		char c;
		int[] sum = new int[200];
		int i;
		int j;
		int k = 0;
		String = new Scanner(System.in).nextLine();
		for (i = 0;(c = string.charAt(i)) != '\0';i++)
		{
			for (j = 65;j <= 90;j++)
			{
				if (c == j)
				{
					sum[j] += 1;
				}
			}
			for (j = 97;j <= 122;j++)
			{
				if (c == j)
				{
					sum[j] += 1;
				}
			}
		}
		for (i = 65;i <= 122;i++)
		{
			if (sum[i] != 0)
			{
				System.out.printf("%c=%d\n",i,sum[i]);
				k = 1;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
	}
}
