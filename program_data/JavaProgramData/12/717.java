package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[MAX];
		int[] n = new int[100];

		int i;
		int t;
		int j;
		int k;
		int tr;
		int[] sum = new int[20];
		int l = 0;


		while (scanf("%d", t), t != -1)
		{
			sum[l] = 0;
			i = 0;
			a[0] = t;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
			while (i++, scanf("%d", a[i]), a[i])
			{
				;
			}
			for (j = 0; j <= i - 1; j++)
			{
				for (k = 0; k <= i - j - 1; k++)
				{
					if (a[k] > a[k + 1])
					{
						tr = a[k];
						a[k] = a[k + 1];
						a[k + 1] = tr;
					}
				}
			}
			for (j = 0; j <= i - 1; j++)
			{
				for (k = j + 1; k <= i; k++)
				{
					if ((2 * a[j]) == a[k])
					{
					sum[l]++;
					}
				}
			}
			l++;
		}
		 for (i = 0;i < l;i++)
		 {
				System.out.printf("%d\n", sum[i]);
		 }
		return 0;
	}

}
