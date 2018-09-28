package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {20, 40, 10, 50};
		int i;
		int j;
		int t1;
		int max;

		char[] c = {'z', 'q', 's', 'l'};
		char t2;

			for (i = 0;i < 4;i++)
			{
				max = i;
				for (j = i;j < 4;j++)
				{
				if (a[i] < a[j])
				{
					max = j;
				}
				{
					t1 = a[i];
					t2 = c[i];
					a[i] = a[max];
					c[i] = c[max];
					a[max] = t1;
					c[max] = t2;
			}

				}
			}
				for (i = 0;i < 4;i++)
				{
				System.out.printf("%c %d\n",c[i],a[i]);
				}
	}











}
