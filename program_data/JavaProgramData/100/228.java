package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[500]);
		int[] a = new int[26];
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j;
		int i;
		int j;
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'a')
			{
				a[0]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'b')
			{
				a[1]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'c')
			{
				a[2]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'd')
			{
				a[3]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'e')
			{
				a[4]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'f')
			{
				a[5]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'g')
			{
				a[6]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'h')
			{
				a[7]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'i')
			{
				a[8]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'j')
			{
				a[9]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'k')
			{
				a[10]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'l')
			{
				a[11]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'm')
			{
				a[12]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'n')
			{
				a[13]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'o')
			{
				a[14]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'p')
			{
				a[15]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'q')
			{
				a[16]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'r')
			{
				a[17]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 's')
			{
				a[18]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 't')
			{
				a[19]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'u')
			{
				a[20]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'v')
			{
				a[21]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'w')
			{
				a[22]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'x')
			{
				a[23]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'y')
			{
				a[24]++;
			}
		}
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == 'z')
			{
				a[25]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 97,a[i]);
			}
		}
		j = 0;
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				j = 1;
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
	}


}
