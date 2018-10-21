package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] an = new int[26];
		int i = 0;
		int j = 0;
		int k = 0;
		int n;
		String sn = new String(new char[301]);
		for (i = 0;i < 26;i++)
		{
			an[i] = 0;
		}
		sn = new Scanner(System.in).nextLine();
		n = sn.length();
		for (i = 0;i < n;i++)
		{
			if (sn.charAt(i) == 'a')
			{
				an[0]++;
			}
			else if (sn.charAt(i) == 'b')
			{
				an[1]++;
			}
			else if (sn.charAt(i) == 'c')
			{
				an[2]++;
			}
			else if (sn.charAt(i) == 'd')
			{
				an[3]++;
			}
			else if (sn.charAt(i) == 'e')
			{
				an[4]++;
			}
			else if (sn.charAt(i) == 'f')
			{
				an[5]++;
			}
			else if (sn.charAt(i) == 'g')
			{
				an[6]++;
			}
			else if (sn.charAt(i) == 'h')
			{
				an[7]++;
			}
			else if (sn.charAt(i) == 'i')
			{
				an[8]++;
			}
			else if (sn.charAt(i) == 'j')
			{
				an[9]++;
			}
			else if (sn.charAt(i) == 'k')
			{
				an[10]++;
			}
			else if (sn.charAt(i) == 'l')
			{
				an[11]++;
			}
			else if (sn.charAt(i) == 'm')
			{
				an[12]++;
			}
			else if (sn.charAt(i) == 'n')
			{
				an[13]++;
			}
			else if (sn.charAt(i) == 'o')
			{
				an[14]++;
			}
			else if (sn.charAt(i) == 'p')
			{
				an[15]++;
			}
			else if (sn.charAt(i) == 'q')
			{
				an[16]++;
			}
			else if (sn.charAt(i) == 'r')
			{
				an[17]++;
			}
			else if (sn.charAt(i) == 's')
			{
				an[18]++;
			}
			else if (sn.charAt(i) == 't')
			{
				an[19]++;
			}
			else if (sn.charAt(i) == 'u')
			{
				an[20]++;
			}
			else if (sn.charAt(i) == 'v')
			{
				an[21]++;
			}
			else if (sn.charAt(i) == 'w')
			{
				an[22]++;
			}
			else if (sn.charAt(i) == 'x')
			{
				an[23]++;
			}
			else if (sn.charAt(i) == 'y')
			{
				an[24]++;
			}
			else if (sn.charAt(i) == 'z')
			{
				an[25]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (an[i] != 0)
			{
				System.out.printf("%c=%d\n",(char)(97 + i),an[i]);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}
