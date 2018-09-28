package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] result = new int[32];
		int carry = 0;
		int i;
		int j;
		int key = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
		   System.out.print("1");
		}
		else
		{
		   result[0] = 1;
		   for (i = 1;i <= n;i++)
		   {
			   for (j = 0;j < 32;j++)
			   {
				   result[j] = result[j] * 2 + carry;
				   carry = 0;
				   if (result[j] >= 10)
				   {
				   result[j] = result[j] - 10;
				   carry = 1;
				   }
			   }
		   }
		   for (i = 31;i >= 0;i--)
		   {
				   if (result[i] != 0)
				   {
				   System.out.printf("%d",result[i]);
				   i--;
				   break;
				   }
		   }
		   for (;i >= 0;i--)
		   {
				   System.out.printf("%d",result[i]);
		   }
		}

		return 0;
	}
}

