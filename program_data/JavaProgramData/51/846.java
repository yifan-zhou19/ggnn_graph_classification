package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int max = 0;
		int t;
		int len;
		int n;
		int[] b = new int[501];
	final String a = "";
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	a = new Scanner(System.in).nextLine();
	len = a.length();
	for (i = 0;i < len;i++)
	{
		for (k = i;k < len - n + 1;k++)
		{
			t = 0;
			for (j = 0;j < n;j++)
			{
				if (a.charAt(i + j) != a.charAt(k + j))
				{
				t = 1;
				}
			}
		if (t == 0)
		{
			b[i]++;
		}
		}
	}
	for (i = 0;i < len - n + 1;i++)
	{
		if (b[i] > max)
		{
			max = b[i];
		}
	}

	t = 0;
	for (i = 0;i < len - n + 1;i++)
	{
		if (b[i] > 1)
		{
			t = 1;
		break;
		}
	}
	if (t == 0)
	{
			System.out.print("NO");
		return;
	}
	System.out.printf("%d\n",max);
	for (i = 0;i < len - n + 1;i++)
	{
		if (b[i] == max)
		{
			for (j = 0;j < n;j++)
			{
				System.out.printf("%c",a.charAt(i + j));
			}
		System.out.print("\n");
		}
	}
	}
}

