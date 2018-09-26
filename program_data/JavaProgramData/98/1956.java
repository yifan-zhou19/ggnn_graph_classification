package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int sum1 = 0;
		int len1;
		int len2;
		int count = 0;
		char[][] a = new char[500][40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{ //??
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = tempVar2.charAt(0);
						 }
		}
		int sum2 = String.valueOf(a[0]).length();

		for (i = 0;i < n - 1;i++)
		{
						 len1 = String.valueOf(a[i]).length();
						 len2 = String.valueOf(a[i + 1]).length();
						 sum1 += len1;
						 sum2 += len2;

						 if (sum2 + count + 1 <= 80)
						 {
							 System.out.printf("%s ",a[i]);
							 count++;
						 }
						 else if (sum2 + count + 1 > 80 && sum1 + count <= 80)
						 {
							  System.out.printf("%s\n",a[i]);
							  count = sum1 = 0;
							  sum2 = String.valueOf(a[i + 1]).length();
						 }
						 else
						 {
							  System.out.print("\n");
							  count = sum1 = 0;
							  i--;
							  sum2 = String.valueOf(a[i]).length();

						 }
		}


		System.out.printf("%s\n",a[n - 1]);



	}


}

