package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int flag;
	 int[] a = new int[20001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(a[1]);
		  for (i = 2;i <= n;i++) //???????????2?n????????????
		  {
				flag = 0; //??????flag???0????????a[i]??????flag??0
			   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 for (j = 1;j < i;j++)
				 {
					   if (a[j] == a[i])
					   {
						   flag = 1;
					   }
				 } //????a[i]?????????flag???1
				 if (flag == 0)
				 {
					 System.out.print(" ");
					 System.out.print(a[i]);
				 }
		  }

		  return 0;
	}
}

