package <missing>;

public class GlobalMembers
{
	public static int[] qm = new int[102];
	public static int[] bp = new int[102];
	public static int[] lw = new int[102];
	public static final String bg = "";
	public static final String xb = "";
	public static int yuanshi(int i)
	{
		if (qm[i] > 80 && lw[i] > 0)
		{
			return 8000;
		}
			else
			{
				return 0;
			}
	}
	public static int wusi(int i)
	{
		if (qm[i] > 85 && bp[i] > 80)
		{
			return 4000;
		}
			else
			{
				return 0;
			}
	}
	public static int youxiu(int i)
	{
		if (qm[i] > 90)
		{
			return 2000;
		}
			else
			{
				return 0;
			}
	}
	public static int xibu(int i)
	{
		if (qm[i] > 85 && xb.charAt(i) == 'Y')
		{
			return 1000;
		}
			else
			{
				return 0;
			}
	}
	public static int banji(int i)
	{
		if (bp[i] > 80 && bg.charAt(i) == 'Y')
		{
			return 850;
		}
			else
			{
				return 0;
			}
	}

	public static int Main()
	{
		int i;
		int n;
		int max;
		int num;
		int[] jxj = new int[102];
		int sum = 0;
		final String name = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			name = tangible.StringFunctions.changeCharacter(name, i, ConsoleInput.readToWhiteSpace(true));
			qm[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			bp[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			bg = tangible.StringFunctions.changeCharacter(bg, i, ConsoleInput.readToWhiteSpace(true));
			xb = tangible.StringFunctions.changeCharacter(xb, i, ConsoleInput.readToWhiteSpace(true));
			lw[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			jxj[i] = yuanshi(i) + wusi(i) + youxiu(i) + xibu(i) + banji(i);
		}
		max = jxj[1];
		num = 1,sum = jxj[1];
		for (i = 2;i <= n;i++)
		{
			sum = sum + jxj[i];
			if (jxj[i] > max)
			{
				max = jxj[i];
				num = i;
			}
		}
		System.out.print(name.charAt(num));
		System.out.print("\n");
		System.out.print(jxj[num]);
		System.out.print("\n");
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

