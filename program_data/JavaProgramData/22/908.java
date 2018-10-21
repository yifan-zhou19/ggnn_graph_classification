package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int max = 0;
		int m = 0;
		int n = 0;
		String b = new String(new char[300]);
		b = tangible.StringFunctions.changeCharacter(b, 0, ',');
		for (i = 0;i < 300;i++)
		{
			if (b.charAt(i) == ',')
			{
				b = tangible.StringFunctions.changeCharacter(b, i + 1, '.');
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 a[i] = Integer.parseInt(tempVar);
				 }
				 String tempVar2 = ConsoleInput.scanfRead(null, 1);
				 if (tempVar2 != null)
				 {
					 b = tangible.StringFunctions.changeCharacter(b, i + 1, tempVar2);
				 }
				 n += 1;
			}
			else
			{
				break;
			}
		}
		max = m = a[0];
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (max < a[i])
				{
					m = max;
					max = a[i];
				}
				else
				{
					if (m == max)
					{
						m = a[i];
					}
					else
					{
						if ((m < a[i]) && (max> a[i]))
						{
						m = a[i];
						}
					}
				}
			}
		if (max == m)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",m);
		}
		}
		return 0;
	}
}

