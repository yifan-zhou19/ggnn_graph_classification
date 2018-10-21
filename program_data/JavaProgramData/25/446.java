package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] out = new int[50];
	public static int mark = 0;
	public static int count(int a)
	{
		int i;
	   if (a == n)
	   {
		   for (i = 49;i >= 0;i--)
		   {

			   if (out[i] != 0)
			   {
				   mark = 1;
			   }
			   if (mark == 1)
			   {
				   System.out.print(out[i]);
			   }
		   }
		   return 0;
	   }
	   else
	   {
		   for (i = 0;i < 50;i++)
		   {
			   out[i] = out[i] * 2;

		   }
		   for (i = 0;i < 50;i++)
		   {
			   if (out[i] >= 10)
			   {
				  out[i + 1] += out[i] / 10;
				  out[i] = out[i] % 10;
			   }
		   }
		   count(a + 1);
	   }
	   return 0;
	}


	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		out[0] = 1;
		count(0);
			return 0;
	}
}

