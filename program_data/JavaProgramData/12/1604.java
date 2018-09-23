package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int j;
		int k;
		int i = 0;
		int n = 0;
		int m = 0;



			while ((scanf("%d", a[i])) && (a[i] >= 0))
			{

			  if (a[i] == 0)
			  {
				for (j = 0;j < i - 1;j++)
				{
					for (k = j + 1;k < i;k++)
					{
					if (a[j] == 2 * a[k] || a[k] == 2 * a[j])
					{
					m++;
					}
					}
				}
				System.out.printf("%d\n",m);
				m = 0;
				i = 0;
				for (j = 0;j < 20;j++)
				{
				a[j] = 0;
				}
			  }
		i++;


			}



		return 0;
	}
}
