package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String z = new String(new char[300]);
	   int sum;
	   int i;
	   int num = 0;

	   char n;
	   z = new Scanner(System.in).nextLine();
	   for (n = 'a';n <= 'z';n++)
	   {
		   sum = 0;
		   for (i = 0;i < z.length();i++)
		   {
			   if (z.charAt(i) == n)
			   {
				   sum++;
			   }

			   num += sum;
		   }
		   if (sum != 0)
		   {
				   System.out.printf("%c=%d\n",n,sum);
		   }
	   }
	   if (num == 0)
	   {
		   System.out.print("No");
	   }



	   return 0;


	}
}
