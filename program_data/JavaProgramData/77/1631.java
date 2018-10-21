package <missing>;

public class GlobalMembers
{
	public static String queue = new String(new char[100]);
	public static char boy;
	public static char girl;
	public static int stop = 0;
	public static int length;
	public static int Main()
	{

	   queue = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   boy = queue.charAt(0);
	   length = queue.length();
	   int number;
	   for (int i = 0;i < length;i++)
	   {
		 if (queue.charAt(i) != boy)
		 {
				 girl = queue.charAt(i);
				 number = i;
				 break;
		 }
	   }
	   void handinhand(int);
	   handinhand(number);
	}


	public static void handinhand(int number)
	{
		 if (stop == length)
		 {
			 return;
		 }

		 int theotherside = 0;
		 for (int a = 1;;a++)
		 {
			 if (queue.charAt(number - a) == boy)
			 {
					 theotherside = number - a;
					 break;
			 }

		 }
		 System.out.print(theotherside);
		 System.out.print(' ');
		 System.out.print(number);
		 System.out.print("\n");
		 queue = tangible.StringFunctions.changeCharacter(queue, number, ' ');
		 queue = tangible.StringFunctions.changeCharacter(queue, theotherside, ' ');
		 stop = stop + 2;

		 for (int i = number + 1;;i++)
		 {
				 if (queue.charAt(i) == girl)
				 {
					  handinhand(i);
					  break;
				 }

		 }


	}
}

