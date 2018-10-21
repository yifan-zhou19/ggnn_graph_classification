package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i = 0;
		int j;
		int n = 0;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c != ' ')
			{
				n = 1;
				a[i]++;
			}
			else
			{
				if (n == 1)
				{
					n = 0;
					i++;
				}
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d,",a[j]);
		}
		System.out.printf("%d",a[i]);
	}
}
