package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] l = new int[400];
		char[][] a = new char[400][40];
		for (i = 0;(scanf("%s",a[i])) != EOF;i++)
		{
			;
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			l[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",l[i]);
			}
			else
			{
				System.out.printf(",%d",l[i]);
			}
		}


	}
}
