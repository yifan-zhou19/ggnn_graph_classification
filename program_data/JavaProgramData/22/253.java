package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[50],m2,i,k,max;
		int[] a = new int[50];
		int m2;
		int i;
		int k;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;System.in.read() != '\n';i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		max = a[0];
		for (k = 0;k < i;k++)
		{
			if (a[k] > max)
			{
				max = a[k];
			}
		}
		for (k = 0;k < i;k++)
		{
			if (a[k] == max)
			{
			a[k] = 0;
			}
		}
		m2 = 0;
		for (k = 0;k < i;k++)
		{
			if (a[k] > m2)
			{
				m2 = a[k];
			}
		}
		if (m2 != 0)
		{
		System.out.printf("%d",m2);
		}
		else
		{
			System.out.print("No");
		}








	}


}

