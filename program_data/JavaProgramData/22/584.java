package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 1;
		int j;
		int k;
		int t;
		int n = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		c = System.in.read();
		while (c == ',')
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		i++;
		c = System.in.read();
		}

		for (j = 0;j < i - 1;j++)
		{
			for (k = 0;k < i - 1 - j;k++)
			{
			if (a[k] < a[k + 1])
			{
				t = a[k];
			a[k] = a[k + 1];
			a[k + 1] = t;
			}
			}
		}

		for (j = 0;j < i;j++)
		{
		if (a[j] < a[0])
		{
			n = 1;
		}
		if (n == 1)
		{
			break;
		}
		}

	   if (n == 1)
	   {
		   System.out.printf("%d",a[j]);
	   }
	   else
	   {
		   System.out.print("No");
	   }

		return 0;
	}
}

