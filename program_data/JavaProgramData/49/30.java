package <missing>;

public class GlobalMembers
{
	public static void Main()
	{


		String a = new String(new char[501]);

		int i;
		int j;
		int k;
		int z;
		int n;

		 a = new Scanner(System.in).nextLine();


		 n = a.length();

	   for (j = 1;j < n;j++)
	   {

	   for (i = 0;i < n - j;i++)
	   {
		   for (k = 0;k <= j / 2;k++)
		   {
			   if (a.charAt(i + k) != a.charAt(i + j - k))
			   {
				   break;
			   }
		   }

		   if (k == j / 2 + 1)
		   {
			   for (z = i;z <= i + j;z++)
			   {
				   System.out.printf("%c",a.charAt(z));

			   }
		   System.out.print("\n");
		   }
	   }
	   }
	}


}
