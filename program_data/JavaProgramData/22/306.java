package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return (0 - (int)a + (int)b);
	}

	public static void Main()
	{
		int i = 0;
		int j;
		int k;
		int n;
		int[] a = new int[300];
		int max;
		char t;
		while ((t = System.in.read()) != EOF)
		{
			if (t <= '9' && t >= '0')
			{
			a[i] = 10 * a[i] + t - '0';
			}
			else
			{
			i++;
			}
		}
		qsort(a,i + 1,(Integer.SIZE / Byte.SIZE),cmp);
		max = a[0];
		for (j = 0;j < i + 3;j++)
		{
			if (a[j] == 0)
			{
				System.out.print("No");
				break;
			}
			else if (a[j] != max)
			{
				System.out.printf("%d",a[j]);
				break;
			}
		}

	}


}
