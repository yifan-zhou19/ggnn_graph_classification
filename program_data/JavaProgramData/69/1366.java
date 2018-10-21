package <missing>;

public class GlobalMembers
{
	public static int max(int x, int y)
	{
		if (x >= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int trans(char x)
	{
		int y;
		int[] s = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int i;
		for (i = 0;i < 10;i++)
		{
			if (x == s[i])
			{
				y = i;
				break;
			}
		}
		return y;
	}
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int[] A = new int[250];
		int[] B = new int[250];
		int[] C = new int[251];
		int i;
		int j = 0;
		int x;
		int y;
		int z;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 250;i >= 0;i--)
		{
			if (a.charAt(i) != '\0')
			{
				x = i;
				break;
			}
		}
		for (i = 250;i >= 0;i--)
		{
			if (b.charAt(i) != '\0')
			{
				y = i;
				break;
			}
		}
		z = max(x, y);
		for (i = x;i >= 0;i--)
		{
			A[j] = trans(a.charAt(i));
			j++;
		}
		j = 0;
		for (i = y;i >= 0;i--)
		{
			B[j] = trans(b.charAt(i));
			j++;
		}
		for (i = 0;i <= z;i++)
		{
			C[i] += A[i] + B[i];
			if (C[i] >= 10)
			{
				C[i] = C[i] - 10;
				C[i + 1] += 1;
			}
		}
		for (i = 0;i <= z + 1;i++)
		{
			if (C[i] != 0)
			{
				count++;
				break;
			}
		}
		if (count == 1)
		{
			for (i = z + 1;i >= 0;i--)
			{
			if (C[i] != 0)
			{
				for (j = i;j >= 0;j--)
				{
				System.out.printf("%d",C[j]);
				}
				break;
			}
			}
		}
		else
		{
			System.out.print("0");
		}
		return 0;
	}

}

