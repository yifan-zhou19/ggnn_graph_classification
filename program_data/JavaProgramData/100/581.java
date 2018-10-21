package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int i;
		int n;
		int j;
		int[] c = new int[26];
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == 'a')
			{
				c[0]++;
			}
			else if (a.charAt(i) == 'b')
			{
				c[1]++;
			}
			else if (a.charAt(i) == 'c')
			{
				c[2]++;
			}
			else if (a.charAt(i) == 'd')
			{
				c[3]++;
			}
			else if (a.charAt(i) == 'e')
			{
				c[4]++;
			}
			else if (a.charAt(i) == 'f')
			{
				c[5]++;
			}
			else if (a.charAt(i) == 'g')
			{
				c[6]++;
			}
			else if (a.charAt(i) == 'h')
			{
				c[7]++;
			}
			else if (a.charAt(i) == 'i')
			{
				c[8]++;
			}
			else if (a.charAt(i) == 'j')
			{
				c[9]++;
			}
			else if (a.charAt(i) == 'k')
			{
				c[10]++;
			}
			else if (a.charAt(i) == 'l')
			{
				c[11]++;
			}
			else if (a.charAt(i) == 'm')
			{
				c[12]++;
			}
			else if (a.charAt(i) == 'n')
			{
				c[13]++;
			}
			else if (a.charAt(i) == 'o')
			{
				c[14]++;
			}
			else if (a.charAt(i) == 'p')
			{
				c[15]++;
			}
			else if (a.charAt(i) == 'q')
			{
				c[16]++;
			}
			else if (a.charAt(i) == 'r')
			{
				c[17]++;
			}
			else if (a.charAt(i) == 's')
			{
				c[18]++;
			}
			else if (a.charAt(i) == 't')
			{
				c[19]++;
			}
			else if (a.charAt(i) == 'u')
			{
				c[20]++;
			}
			else if (a.charAt(i) == 'v')
			{
				c[21]++;
			}
			else if (a.charAt(i) == 'w')
			{
				c[22]++;
			}
			else if (a.charAt(i) == 'x')
			{
				c[23]++;
			}
			else if (a.charAt(i) == 'y')
			{
				c[24]++;
			}
			else if (a.charAt(i) == 'z')
			{
				c[25]++;
			}
		}

			i = 0;
			for (j = 'a';j <= 'z';j++)
			{
				if (c[i] > 0)
				{
					System.out.printf("%c=%d\n",j,c[i]);
				b++;
				}

				i++;
			}
			if (b == 0)
			{
				System.out.print("No");
			}

	}
}

