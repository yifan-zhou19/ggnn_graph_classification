package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int k;
		int i;
		int m;
		int j;
		int n;
		int o;
		int ten = 0;
		final String x = "\0";
		final String y = "\0";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		k = x.length();
		for (i = 0;i < k;i++)
		{
			ten = a * ten;
			if (x.charAt(i) < 60)
			{
			ten = ten + (x.charAt(i) - 48);
			}
			else if (x.charAt(i) < 95)
			{
				ten = ten + (x.charAt(i) - 55);
			}
			else
			{
				ten += (x.charAt(i) - 87);
			}
		}
		j = 0;
		do
		{
			m = ten % b;
			ten = (ten - m) / b;
			if (m < 10)
			{
				y = tangible.StringFunctions.changeCharacter(y, j, m + 48);
			}
			else
			{
				y = tangible.StringFunctions.changeCharacter(y, j, m + 55);
			}
			j++;
		} while (ten != 0);
			n = y.length();
		for (o = n - 1;o >= 0;o--)
		{
			System.out.printf("%c",y.charAt(o));
		}
	}
}

