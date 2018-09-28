package <missing>;

public class GlobalMembers
{
	public static int total;
	public static int i;
	public static int j;
	public static char boy;
	public static char girl;
	public static String child = new String(new char[100]);
	public static int[] flag = new int[100];
	public static void departure()
	{
	   if (total == 0)
	   {
		   return;
	   }
	   else
	   {
		   for (i = 1;i <= total - 1;i++)
		   {

			  if (child.charAt(i) == girl && child.charAt(i - 1) == boy)
			  {
				  System.out.print(flag[i - 1]);
				  System.out.print(' ');
				  System.out.print(flag[i]);
				  System.out.print("\n");
				 if (i != total - 1)
				 {
					 for (j = i + 1;j <= total - 1;j++)
					 {
						 child = tangible.StringFunctions.changeCharacter(child, j - 2, child.charAt(j));
						 flag[j - 2] = flag[j];

					 }
					total -= 2;
				 }
				 else
				 {
					 total -= 2;
				 }
			   departure();
			  }
		   }
	   }
	}

	public static int Main()
	{
		child = ConsoleInput.readToWhiteSpace(true).charAt(0);
		total = child.length();
		boy = child.charAt(0);
		girl = child.charAt(total - 1);
		for (i = 0;i <= total - 1;i++)
		{
			flag[i] = i;
		}
		departure();

		return 0;


	}

}

