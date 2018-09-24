package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int[] a = new int[6];
		int[] b = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			b[i] = reverse(a[i]);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
	}
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static reverse(int a)
	{
		int j;
		int p;
		int l = 0;
		int c = a;
		int z = 0;
	if (a >= 0)
	{
			for (;c > 0;)
			{
				c = c / 10;
				l++;
			}
			 for (j = l - 1;j >= 0;j--)
			 {
			  p = a / (int)Math.pow(10,j);
			  z = z + p * (int)Math.pow(10,l - j - 1);
			  a = a - p * Math.pow(10,j);
			 }
	}
	else
	{
			 for (;c < 0;)
			 {
				 c = c / 10;
				l++;
			 }
			 for (j = l - 1;j >= 0;j--)
			 {
			  p = a / (int)Math.pow(10,j);
			  z = z + p * (int)Math.pow(10,l - j - 1);
			  a = a - p * Math.pow(10,j);
			 }
	}
			return z;
	}
}

