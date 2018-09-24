package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[6];
	int i;
	int reverse = int dividend;
	for (i = 0;i < 6;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}

	System.out.printf("%d\n",reverse(a[i]));
	}
	}

	public static int reverse(int devidend)
	{
	int result = 0;
	int remainder;

	if (devidend < 0)
	{
		devidend = Math.abs(devidend);

		 while (devidend > 0)
		 {
		 remainder = devidend % 10;
		 result = result * 10 + remainder;
		 devidend = devidend / 10;
		 }

		result = -result;
	}

	   else if (devidend >= 0)
	   {
		   do
		   {
	   remainder = devidend % 10;
	   result = result * 10 + remainder;
	   devidend = devidend / 10;
		   } while (devidend > 0);
	   }
	return (result);
	}
}

