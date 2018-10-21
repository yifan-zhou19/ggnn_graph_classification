package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] b = new int[27];
		String a = new String(new char[300]);
		char[] c = {' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 1;i <= 26;i++)
		{
			c[i] = 'a' + i - 1;
		}
		for (i = 0;i <= 26;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == 'a')
			{
				b[1]++;
			}
			else if (a.charAt(i) == 'b')
			{
				b[2]++;
			}
				else if (a.charAt(i) == 'c')
				{
				b[3]++;
				}
		else if (a.charAt(i) == 'd')
		{
				b[4]++;
		}
		else if (a.charAt(i) == 'e')
		{
				b[5]++;
		}
		else if (a.charAt(i) == 'f')
		{
				b[6]++;
		}
		else if (a.charAt(i) == 'g')
		{
				b[7]++;
		}
		else if (a.charAt(i) == 'h')
		{
				b[8]++;
		}
		else if (a.charAt(i) == 'i')
		{
				b[9]++;
		}
		else if (a.charAt(i) == 'j')
		{
				b[10]++;
		}
		else if (a.charAt(i) == 'k')
		{
				b[11]++;
		}
		else if (a.charAt(i) == 'l')
		{
				b[12]++;
		}
		else if (a.charAt(i) == 'm')
		{
				b[13]++;
		}
		else if (a.charAt(i) == 'n')
		{
				b[14]++;
		}
		else if (a.charAt(i) == 'o')
		{
				b[15]++;
		}
		else if (a.charAt(i) == 'p')
		{
				b[16]++;
		}
		else if (a.charAt(i) == 'q')
		{
				b[17]++;
		}
		else if (a.charAt(i) == 'r')
		{
				b[18]++;
		}
		else if (a.charAt(i) == 's')
		{
				b[19]++;
		}
		else if (a.charAt(i) == 't')
		{
				b[20]++;
		}
		else if (a.charAt(i) == 'u')
		{
				b[21]++;
		}
		else if (a.charAt(i) == 'v')
		{
				b[22]++;
		}
		else if (a.charAt(i) == 'w')
		{
				b[23]++;
		}
		else if (a.charAt(i) == 'x')
		{
				b[24]++;
		}
		else if (a.charAt(i) == 'y')
		{
				b[25]++;
		}
		else if (a.charAt(i) == 'z')
		{
				b[26]++;
		}
		}
		for (i = 1;i <= 26;i++)
		{
			if (b[i] != 0)
			{
				break;
			}
		}
		if (i >= 27)
		{
			System.out.print("No");
		}

		for (i = 1;i <= 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",c[i],b[i]);
			}
		}
	}





}
