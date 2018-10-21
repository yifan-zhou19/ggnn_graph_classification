package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] a = new int[20000];
	   int[] b = new int[101];
	   int i;
	   int num = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 0;i < n;i++)
	   {
		b[a[i]]++;
		if (b[a[i]] == 1)
		{
		num++;
		if (num == 1)
		{
		System.out.print(a[i]);
		}
		if (num != 1)
		{
		System.out.print(" ");
		System.out.print(a[i]);
		}
		}
	   }
	  return 0;
	}


}

