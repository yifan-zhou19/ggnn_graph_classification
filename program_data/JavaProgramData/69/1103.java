package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		int[] x = new int[255];
		int[] y = new int[255];
		int[] sum = new int[255];
		int i;
		int j;
		int m;
		int n;
		int p;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(x,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
		m = a.length();
		for (i = m - 1,j = 0;i >= 0;i--,j++)
		{
			x[j] = a.charAt(i) - '0';
		}
		n = b.length();
		for (i = n - 1,j = 0;i >= 0;i--,j++)
		{
			y[j] = b.charAt(i) - '0';
		}
		p = m > n != 0?m:n;
		for (i = 0;i < p;i++)
		{
			sum[i] += x[i] + y[i];
			if (sum[i] >= 10)
			{
				sum[i] -= 10;
				sum[i + 1]++;
			}
		}

		while (sum[p] == 0)
		{
			p--;
		}
		if (p < 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = p;i >= 0;i--)
			{
			System.out.printf("%d",sum[i]);
			}
		}

	}

}
