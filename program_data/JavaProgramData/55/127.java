package <missing>;

public class GlobalMembers
{
	public static int ston(String x, int y, int l)
	{
		int z = 0;
		int i;
		for (i = 0;i < l;i++)
		{
						if (x[i].compareTo('Z') <= 0 && x[i].compareTo('A') >= 0)
						{
							x[i] = x[i] - 'A' + 10;
						}
						else
						{
							x[i] = (x + i) - '0';
						}
		}
		for (i = 1;i <= l;i++)
		{

				z = z * y + x[i - 1];
		}
		return (z);
	}
	public static void ntos(String x, int y, int z)
	{
			if (z < y)
			{
				x[0] = z + '0';
			}
			else
			{
					ntos(x, y, z / y);
					x[x.length()] = z % y + '0';
			}
	}
	public static void Main()
	{
			final String in = "\0";
			final String out = "\0";
			int i;
			int d;
			int exp1;
			int exp2;
			int l;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				exp1 = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				in = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				exp2 = Integer.parseInt(tempVar3);
			}
			l = in.length();
			for (i = 0;i < l;i++)
			{
						  if (in.charAt(i) <= 'z' && in.charAt(i) >= 'a')
						  {
							  in = tangible.StringFunctions.changeCharacter(in, i, in.charAt(i) + 'A'-'a');
						  }
			}

			d = ston(in, exp1, l);
			ntos(out, exp2, d);
			for (i = 0;i <= out.length() - 1;i++)
			{
					if (out.charAt(i) >= 10 + '0')
					{
						out = tangible.StringFunctions.changeCharacter(out, i, out.charAt(i) + 'A' - 10 - '0');
					}
			}
			System.out.println(out);
	}
}

