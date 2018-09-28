package <missing>;

public class GlobalMembers
{
	public static int[] num1 = new int[1000];
	public static int[] num2 = new int[1000];
	public static int[] num = new int[2000];
	public static int n1;
	public static int n2;
	public static void dr()
	{
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < n1;i++)
		{
		num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n2;i++)
		{
		num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static int px()
	{
		int i;
		int j;
		int tem;
		for (i = 0;i < n1;i++)
		{
			for (j = i + 1;j < n1;j++)
			{
				if (num1[j] < num1[i])
				{
					tem = num1[i];
					num1[i] = num1[j];
					num1[j] = tem;
				}
			}
		}
		for (i = 0;i < n2;i++)
		{
			for (j = i + 1;j < n2;j++)
			{
				if (num2[j] < num2[i])
				{
					tem = num2[i];
					num2[i] = num2[j];
					num2[j] = tem;
				}
			}
		}
	}
	public static int gb()
	{
		int i;
		for (i = 0;i < n1;i++)
		{
		num[i] = num1[i];
		}
		for (i = n1;i < n1 + n2;i++)
		{
		num[i] = num2[i - n1];
		}
	}
	public static int dy()
	{
		System.out.print(num[0]);
		int i;
		for (i = 1;i < n1 + n2;i++)
		{
		System.out.print(' ');
		System.out.print(num[i]);
		}
	}
	public static int Main()
	{
		dr();
		px();
		gb();
		dy();
	}

}

