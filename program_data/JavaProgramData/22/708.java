package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number1;
		int number2;
		int i;
		int j;
		int[] x = new int[300];
		int[] y = new int[300];
		int[] n = new int[300];
		int m = 1;
		int[] z = new int[300];
		int p = 0;
		int q;
		String d = new String(new char[300]);
		i = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, tempVar2);
			}
		   i = i + 1;
		} while (d.charAt(i - 1) == ',');
		y[0] = x[0];
		number1 = i;
		for (i = 1;i <= number1 - 1;i++)
		{
				for (j = 0;j <= i - 1;j++)
				{
				if (x[i] == x[j])
				{
					n[i] = 1;
				}
				}
			 if (n[i] == 0)
			 {
				 y[m] = x[i];
					   m = m + 1;
			 }
		}
		number2 = m;
		for (i = 0;i <= number2 - 1;i++)
		{
			for (j = 0;j <= number2 - 1;j++)
			{
				if (y[j] > y[i])
				{
					z[i] = z[i] + 1;
				}
			}
		}
		for (i = 0;i <= number2 - 1;i++)
		{
			if (z[i] == 1)
			{
			p = 1;
						q = y[i];
						break;
			}
		}
		if (p == 1)
		{
			System.out.printf("%d",q);
		}
		else
		{
			System.out.print("No");
		}

		return 0;

	}
}

