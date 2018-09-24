//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = new String(new char[100]); //??????????
		String z = new String(new char[100]);
		char a;
		int sum = 0; //??????
		int x;
		int m;
		int n;
		int t;
		int b;
		int i;
		int k;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		n = p.length(); //p???
		for (i = 0;p.charAt(i) != '\0';i++)
		{
		  a = p.charAt(i);
		  if (a >= 'a')
		  {
			  b = a - 'a' + 10;
		  }
		  else if (a >= 'A')
		  {
			  b = a - 'A' + 10;
		  }
		  else if (a <= '9')
		  {
			  b = a - '0';
		  }
		  sum = sum + (int)(b * Math.pow(m,n - 1));
		  n--;
		} //?p????????
		int r = sum;
		if (sum == 0)
		{
			System.out.print("0");
		}
		int w = 0;
		for (c = 0;r > 0;c++)
		{
			x = r % t;
			r = r / t;
			w++;
		} //?????
		for (k = w - 1;k >= 0;k--)
		{
		  x = sum % t;
		  sum = sum / t;
		  if (x <= 10)
		  {
			 switch (x)
			 {
			 case 0:
				 z = tangible.StringFunctions.changeCharacter(z, k, '0');
				 break;
			 case 1:
				 z = tangible.StringFunctions.changeCharacter(z, k, '1');
				 break;
			 case 2:
				 z = tangible.StringFunctions.changeCharacter(z, k, '2');
				 break;
			 case 3:
				 z = tangible.StringFunctions.changeCharacter(z, k, '3');
				 break;
			 case 4:
				 z = tangible.StringFunctions.changeCharacter(z, k, '4');
				 break;
			 case 5:
				 z = tangible.StringFunctions.changeCharacter(z, k, '5');
				 break;
			 case 6:
				 z = tangible.StringFunctions.changeCharacter(z, k, '6');
				 break;
			 case 7:
				 z = tangible.StringFunctions.changeCharacter(z, k, '7');
				 break;
			 case 8:
				 z = tangible.StringFunctions.changeCharacter(z, k, '8');
				 break;
			 case 9:
				 z = tangible.StringFunctions.changeCharacter(z, k, '9');
				 break;
			 case 10:
				 z = tangible.StringFunctions.changeCharacter(z, k, 'A');
				 break;
			 }
		  }
		  else if (x >= 11 && x <= 20)
		  {
			  switch (x)
			  {
			  case 11:
				  z = tangible.StringFunctions.changeCharacter(z, k, 'B');
				  break;
			  case 12:
				  z = tangible.StringFunctions.changeCharacter(z, k, 'C');
				  break;
			  case 13:
				  z = tangible.StringFunctions.changeCharacter(z, k, 'D');
				  break;
			  case 14:
				  z = tangible.StringFunctions.changeCharacter(z, k, 'E');
				  break;
			  case 15:
				  z = tangible.StringFunctions.changeCharacter(z, k, 'F');
				  break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


