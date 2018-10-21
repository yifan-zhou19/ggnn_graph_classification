package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string1 = new String(new char[100000]);
		String string2 = new String(new char[100000]);
		int[] x = new int[1001];
		int[] y = new int[1001];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(x, 0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y, 0,(Integer.SIZE / Byte.SIZE));
		int i;
		int j;
		int n;
		int k = 0;
		int q;
		int p = 0;
		int[] power = {1, 10, 100};
		int[] num = new int[1001];
		int maxpeople = 0;
		int time;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0,(Integer.SIZE / Byte.SIZE));
		string1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; i <= string1.length() - 1; i++)
		{
			if (string1.charAt(i) == ',')
			{
				k = k + 1;
			}
		}
		n = k + 1;
		q = n;
		for (i = string1.length() - 1; i >= 0; i--)
		{
			if (string1.charAt(i) != ',')
			{
				x[q] = x[q] + (int)(string1.charAt(i) - 48) * power[p];
				p = p + 1;
			}
			else
			{
				q = q - 1;
				p = 0;
			}
		}
		string2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		q = n;
		p = 0;
		for (i = string2.length() - 1; i >= 0; i--)
		{
			if (string2.charAt(i) != ',')
			{
				y[q] = y[q] + (int)(string2.charAt(i) - 48) * power[p];
				p = p + 1;
			}
			else
			{
				q = q - 1;
				p = 0;
			}
		}
		for (i = 1; i <= 1000; i++)
		{

			for (j = 1; j <= n; j++)
			{
				if (x[j] <= i != 0 && y[j] >= i + 1)
				{
					num[i]++;
				}
			}
			if (num[i] > maxpeople)
			{
				maxpeople = num[i];
				time = i;
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(maxpeople);
		System.out.print("\n");
		return 0;
	}
}

