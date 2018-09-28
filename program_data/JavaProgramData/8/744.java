package <missing>;

public class GlobalMembers
{
	public static int[] a1 = new int[100];
	public static int[] a2 = new int[100];
	public static void get(int n1,int n2)
	{
		for (int i = 0;i < n1;i++)
		{
			a1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n2;i++)
		{
			a2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void arrange(int n1,int n2)
	{
		int temp;
		for (int j = 1;j <= n1 - 1;j++)
		{
			for (int i = 0;i <= n1 - j - 1;i++)
			{
				if (a1[i] > a1[i + 1])
				{
					temp = a1[i];
					a1[i] = a1[i + 1];
					a1[i + 1] = temp;
				}
			}
		}
		for (int j = 1;j <= n2 - 1;j++)
		{
			for (int i = 0;i <= n2 - j - 1;i++)
			{
				if (a2[i] > a2[i + 1])
				{
					temp = a2[i];
					a2[i] = a2[i + 1];
					a2[i + 1] = temp;
				}
			}
		}
	}
	public static int combine(int n1,int n2)
	{
		int[] out = new int[100];
		for (int i = 0;i < n1;i++)
		{
			out[i] = a1[i];
		}
		for (int i = 0;i < n2;i++)
		{
			out[n1 + i] = a2[i];
		}
		for (int i = 0;i < n1 + n2 - 1;i++)
		{
			System.out.print(out[i]);
			System.out.print(" ");
		}
		System.out.print(out[n1 + n2 - 1]);
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		get(a, b);
		arrange(a, b);
		combine(a, b);
		return 0;
	}


}

