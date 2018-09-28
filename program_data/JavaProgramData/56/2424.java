package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[5]; //a[5]???????????,i,k????,num?????????
	   int i = 0;
	   int k;
	   int num;
	   num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   do
	   {
			a[i] = num % 10;
			num = num / 10;
			i++;
	   }while (num != 0);
	   k = i;
	   for (i = 0;i < k;i++)
	   {
		 System.out.print(a[i]);
	   }
	}


}

