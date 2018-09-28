package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int m;
		int s = 0;
		int[][] t = new int[51][2];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(t,0,(Integer.SIZE / Byte.SIZE));
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int n = a.length();
		k = n;
		for (;;)
		{
		if (k == 1 || k == 0)
		{
			break;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) != null)
				{
				if (a.charAt(i) == a.charAt(0))
				{
					m = i;
				}
				else if (a.charAt(m) != a.charAt(0))
				{
					continue;
				}
				else if (a.charAt(i) != a.charAt(m))
				{
					t[s][0] = m;
					t[s][1] = i;
					s++;
					a = a.substring(0, i);
					a = a.substring(0, m);
					k -= 2;
					m++;
				}
				}
			}
		}
		}
		for (i = 0;i < 50;i++)
		{
			if (t[i][1] == 0)
			{
				break;
			}
		}
		for (k = 0;k < i - 1;k++)
		{
			for (m = k + 1;m < i;m++)
			{
				if (t[k][1] > t[m][1])
				{
					t[50][0] = t[m][0];
					t[50][1] = t[m][1];
					t[m][0] = t[k][0];
					t[m][1] = t[k][1];
					t[k][0] = t[50][0];
					t[k][1] = t[50][1];
				}
			}
		}
		for (k = 0;k < i;k++)
		{
			System.out.printf("%d %d\n",t[k][0],t[k][1]);
		}
	}

}
