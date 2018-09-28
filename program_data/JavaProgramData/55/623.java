//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String n = new String(new char[20]);
		String tab = new String(new char[100]);
		int a;
		int b;
		int nlen;
		int k;
		int[] z = new int[10];
		int d = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		 nlen = n.length();
		for (i = 0;i < nlen;i++)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				z[i] = n.charAt(i) - 48;
			}
			else
			{
				if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
				{
					z[i] = n.charAt(i) - 87;
				}
			else
			{
				if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
				{
					z[i] = n.charAt(i) - 55;
				}
			}
			}
		}

		   for (i = 0;i < nlen;i++)
		   {
			k = Math.pow(a,nlen - i - 1);
			d = d + z[i] * k;
		   }
		   if (d == 0)
		   {
			   System.out.print("0");
		   }
		   else
		   {
		   for (i = 0;i < 36;i++)
		   {
			  if (d % b <= 9)
			  {
				tab = tangible.StringFunctions.changeCharacter(tab, i, d % b);
			  }
				switch (d % b)
				{
					 case 10:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'A');
						 break;
					 case 11:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'B');
						 break;
					 case 12:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'C');
						 break;
					 case 13:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'D');
						 break;
					 case 14:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'E');
						 break;
					 case 15:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'F');
						 break;
					 case 16:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'G');
						 break;
					 case 17:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'H');
						 break;
					 case 18:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'I');
						 break;
					 case 19:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'J');
						 break;
					 case 20:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'K');
						 break;
					 case 21:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'L');
						 break;
					 case 22:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'M');
						 break;
					 case 23:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'N');
						 break;
					 case 24:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'O');
						 break;
					 case 25:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'P');
						 break;
					 case 26:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'Q');
						 break;
					 case 27:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'R');
						 break;
					 case 28:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'S');
						 break;
					 case 29:
						 tab = tangible.StringFunctions.changeCharacter(tab, i, 'T');

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


