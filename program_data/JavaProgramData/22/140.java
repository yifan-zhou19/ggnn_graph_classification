package <missing>;

public class GlobalMembers
{
	public static void maopao(int[] array, int n)
	{
		int i;
		int j;
		int mid;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (array[i] < array[j])
				{
					mid = array[i];
					array[i] = array[j];
					array[j] = mid;

				}

			}

		}


	}

	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int b;
		int[] c = new int[1000];
		int[] f = new int[1000];
		int s;
		int t;
		int N;
		int mid;


		String a = new String(new char[10000]);
		char[][] d = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
			b = a.length();
		j = 0;
		k = 0;
		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) == ',')
			{
				d[j][k] = '\0';
				j++;
				k = 0;
				continue;

			}
			d[j][k] = a.charAt(i);
			k++;
			n = j;

		}
		d[j][k] = '\0';
		for (i = 0;i <= n;i++)
		{
			c[i] = String.valueOf(d[i]).length();
			if (c[i] == 1)
			{
				f[i] = d[i][0] - '0';
			}
			if (c[i] == 2)
			{
				f[i] = (d[i][0] - '0') * 10 + d[i][1] - '0';
			}
			if (c[i] == 3)
			{
				f[i] = (d[i][0] - '0') * 100 + (d[i][1] - '0') * 10 + d[i][2] - '0';
			}
			if (c[i] == 4)
			{
				f[i] = (d[i][0] - '0') * 1000 + (d[i][1] - '0') * 100 + (d[i][2] - '0') * 10 + d[i][3] - '0';
			}



		}

		for (i = 0;i <= n;i++)
		{
			t = f[i] - f[0];
			s = s + t * t;

		}

		if (s == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n + 1;i++)
			{
			for (j = i + 1;j < n + 1;j++)
			{
				if (f[i] < f[j])
				{
					mid = f[i];
					f[i] = f[j];
					f[j] = mid;

				}

			}

			}
			for (i = 1;i < n + 1;i++)
			{
				N = f[i];
				if (f[i] < f[0])
				{
					break;
				}

			}
			System.out.printf("%d",N);




		}



	}



}

