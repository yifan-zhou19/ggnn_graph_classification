package <missing>;

public class GlobalMembers
{
	public static int max(int[] t) //?????
	{
		int m = 0;
		for (int i = 0;i < 1000;i++)
		{
			if (m < t[i])
			{
				m = t[i];
			}
		}
		return m;
	}
	public static int Main()
	{
		int i = 0;
		int n;
		int k;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] t = new int[1000];
		char a;
		do //?????
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			i++;
		}while (a == ',');
		n = i; //???
		i = 0;
		do //?????
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			i++;
		}while (a == ',');
		for (k = 0;k < 1000;k++) //??????????
		{
			for (i = 0;i < n;i++)
			{
				if (k >= x[i] != 0 && k < y[i])
				{
					t[k] = t[k] + 1;
				}
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max(t));
		System.out.print("\n");
		return 0;
	}
}

