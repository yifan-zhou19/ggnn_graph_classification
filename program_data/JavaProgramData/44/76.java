package <missing>;

public class GlobalMembers
{
	public static int fan(int k)
	{
	   int[] b = new int[100];
	   int j = 0;
	   int len;
	   int result = 0;
	   if (k == 0)
	   {
		 return 0;
	   }
	   else if (k > 0)
	   {
		   while (k > 0)
		   {
			  b[j] = k % 10; //??????????
			   k = k / 10;
			  j++;
		   }
		   len = j;
		   for (j = 0;j <= len - 1;j++)
		   {
			   result = result + b[len - 1 - j] * pow1(j);
		   } //?????10???????
			   return result;
	   }
		else if (k < 0) //k??????k=-k??
		{
			  k = -k;
		   while (k > 0)
		   {
			  b[j] = k % 10;
			   k = k / 10;
			  j++;
		   }
		   len = j;
		   for (j = 0;j <= len - 1;j++)
		   {
			   result = result + b[len - 1 - j] * pow1(j);
		   }
			   return (-result);
		}

	}
	public static int pow1(int n)
	{
	  int result = 1;
	  int i;
		for (i = 1;i <= n;i++)
		{
		result = result * 10;
		}
		return result;
	}
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i <= 5;i++) //??
		{
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		 for (i = 0;i <= 5;i++) //??
		 {
		   System.out.print(fan(a[i]));
		   System.out.print("\n");
		 }


		return 0;
	}
}

