package <missing>;

public class GlobalMembers
{
	public static void fan(String a)
	{

		int n;
		int i;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar;
	}

	n = a.length();


		for (i = 0;i < n;i++)
		{
			if (!a[0].equals('-'))
			{
				for (i = 0;i < n;i++)
				{
					b[j] = b[j] * 10 + a[n - i - 1] - 48;
				}
			}
			else
			{
				for (i = 1;i < n;i++)
				{
					b[j] = b[j] * 10 - (a[n - i] - 48);
				}
			}
		}






	}

	public static int[] b = new int[6];
	public static int i;
	public static int j = 0;

	public static void Main()
	{
		String s = new String(new char[100]);

		while (j < 6)
		{
		fan(s);
		j++;
		}

		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d",b[i]);
				System.out.print("\n");
		}

	}
}

