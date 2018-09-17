package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int n;
		int i;
		int[] b = new int[26];
		for (i = 0;i < 26;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < 300 && (a[i] = System.in.read()) != '\n';i++)
		{
			if (a.charAt(i) == 'a')
			{
				b[0]++;
			}
			else if (a.charAt(i) == 'b')
			{
				b[1]++;
			}
			else if (a.charAt(i) == 'c')
			{
				b[2]++;
			}
			else if (a.charAt(i) == 'd')
			{
				b[3]++;
			}
			else if (a.charAt(i) == 'e')
			{
				b[4]++;
			}
			else if (a.charAt(i) == 'f')
			{
				b[5]++;
			}
			else if (a.charAt(i) == 'g')
			{
				b[6]++;
			}
			else if (a.charAt(i) == 'h')
			{
				b[7]++;
			}
			else if (a.charAt(i) == 'i')
			{
				b[8]++;
			}
			else if (a.charAt(i) == 'j')
			{
				b[9]++;
			}
			else if (a.charAt(i) == 'k')
			{
				b[10]++;
			}
			else if (a.charAt(i) == 'l')
			{
				b[11]++;
			}
			else if (a.charAt(i) == 'm')
			{
				b[12]++;
			}
			else if (a.charAt(i) == 'n')
			{
				b[13]++;
			}
			else if (a.charAt(i) == 'o')
			{
				b[14]++;
			}
			else if (a.charAt(i) == 'p')
			{
				b[15]++;
			}
			else if (a.charAt(i) == 'q')
			{
				b[16]++;
			}
			else if (a.charAt(i) == 'r')
			{
				b[17]++;
			}
			else if (a.charAt(i) == 's')
			{
				b[18]++;
			}
			else if (a.charAt(i) == 't')
			{
				b[19]++;
			}
			else if (a.charAt(i) == 'u')
			{
				b[20]++;
			}
			else if (a.charAt(i) == 'v')
			{
				b[21]++;
			}
			else if (a.charAt(i) == 'w')
			{
				b[22]++;
			}
			else if (a.charAt(i) == 'x')
			{
				b[23]++;
			}
			else if (a.charAt(i) == 'y')
			{
				b[24]++;
			}
			else if (a.charAt(i) == 'z')
			{
				b[25]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				break;
			}
			else
			{
				System.out.print("No");
				break;
			}

		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 97,b[i]);
			}
		}
	}
}
