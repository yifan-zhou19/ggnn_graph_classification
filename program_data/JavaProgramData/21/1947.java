package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,i,a,tot=0,min=65535,max=0;
		int n;
		int i;
		int a;
		int tot = 0;
		int min = 65535;
		int max = 0;
		float avg;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			tot += a;
			if (min > a)
			{
				min = a;
			}
			if (max < a)
			{
				max = a;
			}
		}
		avg = (float)tot / n;
		if (avg - min >= max - avg)
		{
			System.out.printf("%d",min);
			if (avg - min == max - avg)
			{
				System.out.printf(",%d",max);
			}
		}
		else
		{
			System.out.printf("%d",max);
		}
	}
}

