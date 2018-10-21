package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300],max=0,smax=0;
		int[] a = new int[300];
		int max = 0;
		int smax = 0;
		char c;
		int i = 0;
		int n;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			i++;
		}while (c == ',');
		n = i;
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				smax = max;
				max = a[i];
			}
			else if (a[i] < max && a[i]> smax)
			{
				smax = a[i];
			}
		}
		if (smax != 0)
		{
			System.out.printf("%d",smax);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}

