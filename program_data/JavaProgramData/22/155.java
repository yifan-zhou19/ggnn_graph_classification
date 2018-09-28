package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int t = 0;
		int[] a = new int[50];
		int max;
		int lower;
		int k = 0;
		String c = new String(new char[50]);
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[t] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, t, tempVar2);
			}
			t++;
		} while (c.charAt(t - 1) == ',');
		max = a[0];
		for (i = 0;i <= t - 1;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}

		}
		for (i = 0;i <= t - 1;i++)
		{
			if (a[i] < max)
			{
				k = k + 1;
			}
			else
			{
				k = k + 0;
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i <= t - 1;i++)
			{
				if (a[i] < max)
				{
					lower = a[i];
					break;
				}
				else
				{
					continue;
				}
			}
			for (i = 0;i <= t - 1;i++)
			{
				if ((a[i] > lower) && (a[i] < max))
				{
					lower = a[i];
				}
			}
			System.out.printf("%d\n",lower);
		}
	}






}

