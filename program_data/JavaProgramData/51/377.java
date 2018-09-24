package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[10000]);
	char[][] a =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	int n;
	int x = 0;
	int[] count = new int[500];
	int max = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	c = new Scanner(System.in).nextLine();
	for (int i = 0;i + n <= c.length();i++)
	{
		for (int j = 0;j < n;j++)
		{
			b[j] = c.charAt(i + j);
		}
		int pp = 0;
		for (int j = 0;j < x;j++)
		{
			if (strcmp(b,a[j]) == 0)
			{
			pp = 1;
			count[j]++;
			break;
			}
		}
		if (pp == 0)
		{
		   a[x] = b;
		   x++;
		}
	}
	for (int i = 0;i < x;i++)
	{
		if (count[i] > max)
		{
		   max = count[i];
		}
	}
	if (max == 0)
	{
		System.out.print("NO");
		return 0;
	}
	System.out.printf("%d\n",max + 1);
	for (int i = 0;i < x;i++)
	{
		if (count[i] == max)
		{
		   System.out.printf("%s\n",a[i]);
		}
	}
	}

}

