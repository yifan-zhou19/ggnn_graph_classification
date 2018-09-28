package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		   int number;





		   int reversed_number = 0;





		   int remainder = 0;



		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   number = Integer.parseInt(tempVar);
		   }


		   while (number != 0)
		   {

				  remainder = number % 10;

				  reversed_number *= 10;

				  reversed_number += remainder;

				  number /= 10;

		   }





		   System.out.printf("%d\n",reversed_number);





	}

}

