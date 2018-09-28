package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char[][] a = new char[1000][50]; //????
		int i;
		int[] b = new int[1000];
		int sum = 0;
		int p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			b[i] = String.valueOf(a[i]).length();
		} //???????????????
	   for (i = 0;i < n;i++)
	   {

		   if (p != 0)
		   {
			   System.out.print(" ");
		   }
		   System.out.print(a[i]);
		   p = 1;
		   sum = sum + b[i] + 1;
		   if (sum + b[i + 1] > 80)
		   {
			   System.out.print("\n");
			   sum = 0;
			   p = 0;
		   } //?????80????
	   }
		return 0;
	}

}

