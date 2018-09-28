package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] c = new int[10000][2];
		int[] d = new int[10000];
		int[] e = new int[10000];
		int i = 0;
		int j;
		int t = 0;
		int m;
		int n = -1;
		int most = 0;
		int max = 0;
		int min = 1000;
		int pause;
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(e,0,(Integer.SIZE / Byte.SIZE));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 10000;i++)
		{
			if (a.charAt(i) != ',' && a.charAt(i) != '\0')
			{
				d[i] = a.charAt(i) - '0';
			}
			if (a.charAt(i) == ',')
			{
				m = i;
				for (j = n + 1;j < m;j++)
				{
					c[t][0] = 10 * c[t][0] + d[j];
				}
				n = m;
				if (min > c[t][0])
				{
					min = c[t][0];
				}
				t++;
			}
			if (a.charAt(i) == '\0')
			{
				m = i;
				for (j = n + 1;j < m;j++)
				{
					c[t][0] = 10 * c[t][0] + d[j];
				}
				n = m;
				if (min > c[t][0])
				{
					min = c[t][0];
				}
				t++;
				break;
			}
		}
		n = -1;
		t = 0;
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 10000;i++)
		{
			if (b.charAt(i) != ',' && b.charAt(i) != '\0')
			{
				d[i] = b.charAt(i) - '0';
			}
			if (b.charAt(i) == ',')
			{
				m = i;
				for (j = n + 1;j < m;j++)
				{
					c[t][1] = 10 * c[t][1] + d[j];
				}
				n = m;
				if (max < c[t][1])
				{
					max = c[t][1];
				}
				t++;
			}
			if (b.charAt(i) == '\0')
			{
				m = i;
				for (j = n + 1;j < m;j++)
				{
					c[t][1] = 10 * c[t][1] + d[j];
				}
				n = m;
				if (max < c[t][1])
				{
					max = c[t][1];
				}
				t++;
				break;
			}
		}
		for (i = min;i < max;i++)
		{
			for (j = 0;j < t;j++)
			{
				if (c[j][0] <= i != 0 && c[j][1]> i)
				{
					e[i]++;
				}
			}
			if (most < e[i])
			{
				most = e[i];
			}
		}
		System.out.print(t);
		System.out.print(" ");
		System.out.print(most);
		System.out.print("\n");
		return 0;
	}
}

