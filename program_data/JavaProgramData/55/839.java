package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int s = 0;
		int i;
		int c;
		int j;
		int k;
		int o;
		int[] number2 = new int[40];
		String number = new String(new char[40]);
		String number1 = new String(new char[40]);
		String number3 = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			number = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}


		 int q1;
		 int p1;
		 p1 = number.length();
		 for (q1 = 0;number.charAt(q1) != '\0';q1++)
		 {
		 number1 = tangible.StringFunctions.changeCharacter(number1, p1 - q1 - 1, number.charAt(q1));
		 }
		 number1 = tangible.StringFunctions.changeCharacter(number1, p1, '\0');



		for (i = 0;number1.charAt(i) != '\0';i++)
		{
		   if (number1.charAt(i) >= 97)
		   {
		   c = number1.charAt(i) - 87;
		   }
		   else
		   {
				if (number1.charAt(i) >= 65)
				{
				c = number1.charAt(i) - 55;
				}
				else
				{
				c = number1.charAt(i) - 48;
				}
		   }
		   o = 1;
		   for (int l = 1;l <= i;l++)
		   {

		   o = o * a;
		   }
		   s = o * c + s;
		}

		if (s == 0)
		{
		System.out.println("0");
		}
		else
		{

		for (j = 0;s != 0;j++)
		{

		   number2[j] = s % b;
			s = s / b;
		}

		 int q2;
		 int p2;
		 p2 = j;
		 for (q2 = 0;q2 < p2;q2++)
		 {
		 if (number2[q2] > 9)
		 {
		 number2[q2] = number2[q2] + 55;
		 }
		 else
		 {
		  number2[q2] = number2[q2] + 48;
		 }
		 number3 = tangible.StringFunctions.changeCharacter(number3, p2 - q2 - 1, number2[q2]);
		 }
		 number3 = tangible.StringFunctions.changeCharacter(number3, p2, '\0');

		System.out.println(number3);

		}

		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}
}

