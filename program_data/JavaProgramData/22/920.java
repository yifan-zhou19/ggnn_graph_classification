package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1500]);
		String d = new String(new char[4]);
		int[] num = new int[300];
		int i = 0;
		int j = 0;
		int s = 1;
		int k = 0;
		int m = 0;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		do
		{
			if (c.charAt(i) != ',' && c.charAt(i) != '\0')
			{
				d = tangible.StringFunctions.changeCharacter(d, j, c.charAt(i));
				j++;
			}
			else
			{
				while (j > 0)
				{
					j--;
					k += (d.charAt(j) - 48) * s;
					s *= 10;
				}
				num[m] = k;
				m++;
				j = k = 0;
				s = 1;
			}
			i++;
		} while (c.charAt(i - 1) != '\0');
		a = b = -1;
	k = m;
		while (m > 0)
		{
			m--;
			if (a < num[m])
			{
				a = num[m];
			}
		}
		while (k > 0)
		{
			k--;
			if (num[k] == a)
			{
				continue;
			}
			b = (b < num[k])? num[k]:b;
		}
		if (b == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",b);
		}


	}
}

