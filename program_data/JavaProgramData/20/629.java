package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0'};
		char max;
	while (scanf("%s%s",a,b) != EOF)
	{

		int n;
		int i;
		int maxnum;


		n = a.length();
		maxnum = 0;
		max = a[0];
		for (i = 0;i < n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
				maxnum = i;
			}
		}

		for (i = n;i > maxnum;i--)
		{
			a[i + 3] = a[i];
		}
		for (i = 0;i < 3;i++)
		{
			a[maxnum + 1 + i] = b[i];
		}
		System.out.printf("%s\n",a);
	}
	}
}
