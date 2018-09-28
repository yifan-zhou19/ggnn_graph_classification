package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[2000]);
		int[] b = new int[200];
		b[0] = -1;
		int i;
		int a;
		int d = 1;
		int e = 0;
		int max = 0;
		int min = 100;
		int f;
		int g;
		int h = 0;
		int j;
		sz = new Scanner(System.in).nextLine();
		a = sz.length();
		for (i = 0;i < a;i++)
		{
			if (sz.charAt(i) == ' ' || sz.charAt(i) == ',')
			{
				b[d] = i;
				e = b[d] - b[d - 1] - 1;
				break;
			}
		}
		for (i = 0;i < a;i++)
		{
			if (sz.charAt(i) == ' ' || sz.charAt(i) == ',')
			{
				b[d] = i;
				if (e != b[d] - b[d - 1] - 1)
				{
					h = 1;
				}
				e = b[d] - b[d - 1] - 1;
				d++;
				if (e > max)
				{
					max = e;
					f = d - 1;
				}
				if (e < min && e != 0)
				{
					min = e;
					g = d - 1;
				}
			}
		}
		b[d] = i;
		if (e != b[d] - b[d - 1] - 1)
		{
			h = 1;
		}
		e = b[d] - b[d - 1] - 1;
		if (e > max)
		{
			max = e;
			f = d;
		}
		if (e < min && e != 0)
		{
			min = e;
			g = d;
		}
		if (h == 0)
		{
			for (j = 0;j < 2;j++)
			{
				for (i = 0;i < b[1];i++)
				{
					System.out.printf("%c",sz.charAt(i));
				}
				System.out.print("\n");
			}
		}
		else
		{
			for (i = b[f - 1] + 1;i < b[f];i++)
			{
				System.out.printf("%c",sz.charAt(i));
			}
			System.out.print("\n");
			for (i = b[g - 1] + 1;i < b[g];i++)
			{
				System.out.printf("%c",sz.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
