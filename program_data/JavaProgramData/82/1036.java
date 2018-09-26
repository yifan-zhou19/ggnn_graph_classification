package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????
		int a;
		int b;
		int c = 0;
		int d;
		int i = 1;
		int j = 0;
		int[] m = new int[100]; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90) //??????1
			{
				c++;
			}
			else
			{
				j++; //?????c,??
				m[j] = c;
				c = 0;
			}
			if (i == n) //??????????c
			{
				j++;
				m[j] = c;
			}
		}
		for (i = 1;i <= j;i++) //??????????
		{
			if (m[i] <= m[i + 1])
			{
				d = m[i + 1];
			}
			else
			{
				m[i + 1] = m[i];
				d = m [i + 1];
			}
		}
		System.out.print(d);
		System.out.print("\n");
		return 0;
	}

}

