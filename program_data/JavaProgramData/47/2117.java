package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n; //i???????
	   int i;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] s = new int[n];
	   int[] m = new int[n];
	   for (i = 0;i <= n - 1;i++)
	   {
	   s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
	   m[i] = s[n - 1 - i];
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
	   if (i != 0)
	   {
	   System.out.print(" ");
	   System.out.print(m[i]);
	   }
	   if (i == 0)
	   {
	   System.out.print(m[0]);
	   }
	   }



	return 0;
	}

}

