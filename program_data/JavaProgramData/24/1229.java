package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[51][50];
	int i;
	int c;
	int b;
	int d;
	int e;
	int[] q = new int[50];
	b = 0;
	c = 100;
	for (i = 0;i < 51;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = tempVar.charAt(0);
		}
		if (a[i][0] >= 65 && a[i][0] <= 122)
		{
		q[i] = String.valueOf(a[i]).length();
		if (q[i] > b)
		{
			b = q[i];
			d = i;
		}
		if (q[i] < c)
		{
			c = q[i];
			e = i;
		}
		}
		else
		{
			break;
		}
	}

	System.out.printf("%s\n",a[d]);
	System.out.printf("%s\n",a[e]);
	return 0;
	}


}

