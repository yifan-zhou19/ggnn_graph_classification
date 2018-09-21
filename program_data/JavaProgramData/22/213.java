package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int i;
		int[][] b = new int[100][100];
		int[] c = new int[100];
		int[] t = new int[100];
		int j = 0;
		int s;
		int p;
		int n;
		int max = 0;
		int min = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			while (i < n && a.charAt(i) != ',')
			{
				b[j][t[j]] = a.charAt(i) - '0';
				t[j]++;
				i++;
			}
			j++;
		}
		for (i = 0;i < j;i++)
		{
			p = 1;
			for (s = t[i] - 1;s >= 0;s--)
			{
				c[i] = c[i] + b[i][s] * p;
				p = p * 10;
			}
			max = (max >= c[i])?max:c[i];
		}
		for (i = 0;i < j;i++)
		{
			if (c[i] != max)
			{
				min = (min >= c[i])?min:c[i];
			}
		}
		if (min == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < j;i++)
			{
				if (c[i] == min)
				{
					System.out.printf("%d",c[i]);
					break;
				}
			}
		}
	}






}
