package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int i;
		int[] a = new int[6];
		int[] d = new int[6];
		for (i = 0;i < 6;i++)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[i] = Integer.parseInt(tempVar);
		 }
		}
		for (i = 0;i < 6;i++)
		{
			if (a[i] > 0)
			{
		d[i] = reverse(a[i]);
			}
		else
		{
			d[i] = (-1) * reverse(-a[i]);
		}
		System.out.printf("%d\n",d[i]);
		}
	}

	public static int reverse(int num)
	{
		int[] b = new int[7];
		int[] c = new int[7];
		int j;
		int d;
		int answer;
		for (j = 0;j < 7;j++)
		{
			b[j] = Math.floor(num / (Math.pow(10,j)));
		}
		for (j = 0;j < 6;j++)
		{
			c[6 - j] = b[j] - 10 * b[j + 1];
		}
		c[0] = b[6];
		d = 0;
		for (j = 0;j < 7;j++)
		{
			if (c[j] == 0)
			{
				d = d + 1;
			}
		else
		{
			break;
		}
		}
		answer = 0;
		for (j = d - 1;j < 7;j++)
		{
			answer = answer + Math.pow(10,j - d) * c[j];
		}
		return answer;
	}

}

