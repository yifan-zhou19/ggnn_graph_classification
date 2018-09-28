package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z0 = 1;
		int q0 = 1;
		int s0 = 1;
		int l0 = 1;
		int t = 0;
		int k = 0;
		int c = 0;
		int z1;
		int q1;
		int s1;
		int l1;
		int[][] a = new int[4][2];
		String b = new String(new char[4]);
		char z;
		char q;
		char s;
		char l;
		for (z0 = 1;z0 <= 5;z0++)
		{
			for (q0 = 1;q0 <= 5;q0++)
			{
				for (s0 = 1;s0 <= 5;s0++)
				{
					for (l0 = 1;l0 <= 5;l0++)
					{
						if ((z0 + q0) == (s0 + l0))
						{
							t = 1;
						}
						else
						{
							continue;
						}
						if ((z0 + l0) > (s0 + q0))
						{
							k = 1;
						}
						else
						{
							continue;
						}
						if ((z0 + s0) < q0)
						{
							c = 1;
						}
						else
						{
							continue;
						}
						if (t * k * c == 1)
						{
							z1 = 10 * z0;
							q1 = 10 * q0;
							s1 = 10 * s0;
							l1 = 10 * l0;
							break;
						}
					}
				}
			}
		}
		a[0][0] = z1;
		a[0][1] = 'z';
		a[1][0] = q1;
		a[1][1] = 'q';
		a[2][0] = s1;
		a[2][1] = 's';
		a[3][0] = l1;
		a[3][1] = 'l';
		for (int i = 0;i < 4;i++)
		{
			for (int j = i;j < 4;j++)
			{
				if (a[i][0] < a[j][0])
				{
				   swap(a[i][0],a[j][0]);
				   swap(a[i][1],a[j][1]);
				}
			}
		}
	   for (int k = 0;k < 4;k++)
	   {
			b = tangible.StringFunctions.changeCharacter(b, k, a[k][1]);
			System.out.print(b.charAt(k));
			System.out.print(" ");
			System.out.print(a[k][0]);
			System.out.print("\n");
	   }
		return 0;
	}



}

