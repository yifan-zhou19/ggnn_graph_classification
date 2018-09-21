package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String in = new String(new char[10000]);
		char[][] num = new char[300][4];
		int n;
		int i;
		int j = 0;
		int k = 0;
		int e = 0;
		int[] w = new int[300];
		int[] z = new int[300];
		int[] m = new int[100];
		int[] q = new int[100];
		in = new Scanner(System.in).nextLine();
		n = in.length();
		for (i = 0;i < n;i++)
		{
			if (in.charAt(i) != ',')
			{
				num[k][j] = in.charAt(i);
				j++;
			}
		else
		{
			  k++;
			  j = 0;
		}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			{
			for (i = 0;i <= k;i++)
			{
				w[i] = String.valueOf(num[i]).length();
				for (e = 0,z[i] = 0;e < w[i];e++)
				{
				z[i] = z[i] + (num[i][e] - '0') * Math.pow(10,w[i] - e-1);
				}
			}
	}
		for (i = 0;i <= k;i++)
		{
			m[i] = 0;
			for (j = 0;j <= k;j++)
			{
				if (z[j] > z[i])
				{
			m[i] = 1;
				}
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (m[i] == 0)
			{
			z[i] = -1;
			}
		}
		for (i = 0;i <= k;i++)
		{
			q[i] = 0;
			for (j = 0;j <= k;j++)
			{
				if (z[j] > z[i])
				{
			q[i] = 1;
				}
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (q[i] == 0 && z[i] != -1)
			{
				System.out.printf("%d",z[i]);
				break;
			}
			else if (q[i] == 0 && z[i] == -1)
			{
				System.out.print("No\n");
				break;
			}
		}
		}
	}
}
