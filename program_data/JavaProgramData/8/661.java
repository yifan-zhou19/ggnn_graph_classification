package <missing>;

public class GlobalMembers
{
	public static int la;
	public static int lb;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static void duqu()
	{
		 la = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 lb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 0;i < la;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (int j = 0;j < lb;j++)
		 {
			 b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	} //??????
	public static void paixu()
	{
		 int i;
		 int j;
		 int temp;
		 for (i = 0;i < la - 1;i++)
		 {
			for (j = i + 1;j < la;j++)
			{
			   if (a[i] > a[j])
			   {
							 temp = a[i];
							 a[i] = a[j];
							 a[j] = temp;
			   }
			}
		 }
		 for (i = 0;i < lb - 1;i++)
		 {
			for (j = i + 1;j < lb;j++)
			{
			   if (b[i] > b[j])
			   {
							 temp = b[i];
							 b[i] = b[j];
							 b[j] = temp;
			   }
			}
		 }
	} //???????????
	public static void hebing()
	{
		 for (int i = 0;i < la;i++)
		 {
			 c[i] = a[i];
		 }
		 for (int j = 0;j < lb;j++)
		 {
			 c[la + j] = b[j];
		 }
	} //????????????c?
	public static void shuchu()
	{
		 for (int i = 0;i < la + lb;i++)
		 {
			 System.out.print(c[i]);
			 if (i != la + lb - 1)
			 {
				 System.out.print(' ');
			 }
		 }
	} //??c
	public static int Main()
	{
		duqu();
		paixu();
		hebing();
		shuchu(); //??????
		return 0;
	}
}

