package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t;
	int i;
	int u;
	int k;
	int m;
	int y;
	int x;
	int min;
	int[] a = new int[100002];
	String str = new String(new char[100002]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (i = 0;i < t;i++)
	{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						str = tempVar2.charAt(0);
					}
					u = str.length();
				for (k = 0;k < u;k++)
				{
					  a[k] = 0;
					for (m = 0;m < u;m++)
					{
					if (str.charAt(m) == str.charAt(k))
					{
					a[k]++;
					}
					}
				}
				for (y = 0,min = a[0],x = 0;x < u;x++)
				{
				   if (a[x] < min)
				   {
					   min = a[x];
					y = x;
				   }
				}
				if (min == 1)
				{
				System.out.printf("%c\n",str.charAt(y));
				}
				if (min > 1)
				{
				System.out.print("no\n");
				}

	}
	}

}

