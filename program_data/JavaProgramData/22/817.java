package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int m = 0;
		int s = 0;
		int r = -1;
	char c;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
	while (c != '\n')
	{
		if (c != ',')
		{
			a[j] = 10 * a[j] + c - '0';
		}
	else
	{
		j++;
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	}
	if (a[2] == 0)
	{
		System.out.print("No");
	}
	else
	{
		for (j = 0;j <= 299;j++)
		{
		   if (a[j] > m)
		   {
		s = m;
		m = a[j];
		r++;
		   }
			   else
			   {
				   if (a[j] < m && a[j]> s)
				   {
				   s = a[j];
				   r++;
				   }
			   }
		}
	   if (r != 0)
	   {
		   System.out.printf("%d",s);
	   }
	   else
	   {
		   System.out.print("No");
	   }
	}
	}
}

