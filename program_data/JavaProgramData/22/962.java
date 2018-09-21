package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 1;
		int j;
		int f = 0;
		int s = 0;
		for (j = 0;scanf("%d", a[j]);++j)
		{
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (;j >= 0;j--)
		{
			if (a[j] > f)
			{
			s = f;
			f = a[j];
			}
			else if (a[j] < f && a[j]> s)
			{
				s = a[j];
			}
		}
		if (f == s || s == 0)
		{
			System.out.print("No");
		}
			else
			{
				System.out.printf("%d",s);
			}
		return 0;
	}
}
