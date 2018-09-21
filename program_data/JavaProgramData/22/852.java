package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 0;
		int t = 0;
		int fir = 0;
		int sec = 0;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				i++;
			}
			else
			{
				a[i] *= 10;
				a[i] += (c - '0');
			}
		}
		t = i + 1;
		fir = a[0];
		if (t == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 1;i < t;i++)
			{
				if (a[i] > fir)
				{
					sec = fir;
					fir = a[i];
				}
				else if (a[i] < fir && a[i]> sec)
				{
				sec = a[i];
				}
			}
			if (sec == 0)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",sec);
			}
		}
		return 0;
	}
}
