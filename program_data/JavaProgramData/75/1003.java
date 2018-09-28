package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[4000]);
		String y = new String(new char[4000]);
		int[] xi = new int[1000];
		int[] yi = new int[1000];
		int[] jl = new int[1000];
		int i;
		int j;
		int l;
		int js;
		int s = 0;
		int n = 1;
		int max = 0;
		x = ConsoleInput.readToWhiteSpace(true).charAt(0);
		y = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = x.length();
		js = 1;
		for (i = l - 1;i >= 0; i--)
		{
			if (x.charAt(i) == ',')
			{
				n++;
				js = 1;
			}
			else
			{
				xi[n] = xi[n] + (x.charAt(i) - '0') * js;
				js *= 10;
			}
		}
		System.out.print(n);
		System.out.print(' ');
		n = 1;
		l = y.length();
		js = 1;
		for (i = l - 1;i >= 0; i--)
		{
			if (y.charAt(i) == ',')
			{
				n++;
				js = 1;
			}
			else
			{
				yi[n] = yi[n] + (y.charAt(i) - '0') * js;
				js *= 10;
			}
		}
		for (i = 1;i <= n; i++)
		{
			for (j = xi[i]; j < yi[i] ;j++)
			{
				jl[j]++;
				if (jl[j] > max)
				{
					max = jl[j];
				}
			}
		}
		System.out.print(max);
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}











}

