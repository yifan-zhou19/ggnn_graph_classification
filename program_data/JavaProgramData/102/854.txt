package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String gender = new String(new char[10]);
		float[][] h = new float[2][40];
		float t;

		int i;
		int j;
		int n;
		int l = 0;
		int k = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				gender = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t = Float.parseFloat(tempVar3);
			}

			if (strcmp(gender,"male") == 0)
			{
				h[0][k] = t;
				k++;
			}
			else
			{
				h[1][l] = t;
				l++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (h[0][i] > h[0][j])
				{
					t = h[0][i];
					h[0][i] = h[0][j];
					h[0][j] = t;
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			for (j = i;j < l;j++)
			{
				if (h[1][i] < h[1][j])
				{
					t = h[1][i];
					h[1][i] = h[1][j];
					h[1][j] = t;
				}
			}
		}

		for (i = 0;i < k;i++)
		{
			if (i == 0)
			{
				System.out.printf("%.2f",h[0][i]);
			}
			else
			{
				System.out.printf(" %.2f",h[0][i]);
			}
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf(" %.2f",h[1][i]);
		}
	return 0;
	}
}

