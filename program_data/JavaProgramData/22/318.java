package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int max2,max1, a[300]={0},i=0;
		int max2;
		int max1;
		int[] a = new int[300];
		int i = 0;
		int flag = 0;
		int j;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c >= '0' && c <= '9')
			{
					a[i] = a[i] * 10 + c - '0';
			}
			else if (c == ',')
			{
				i = i + 1;
			}
		}


		max1 = a[0];
		max2 = 0;
		for (j = 0;j <= i;j++)
		{
			if (a[j] != max1)
			{
				flag = 1;
			}
			if (a[j] > max1)
			{
				max1 = a[j];
			}
		}
			for (j = 0;j <= i;j++)
			{
				if (a[j] > max2 && a[j] != max1)
				{
					max2 = a[j];
				}
			}


			if (flag == 1)
			{
				System.out.printf("%d",max2);
			}
			else
			{
				System.out.print("No");
			}
	}
}
