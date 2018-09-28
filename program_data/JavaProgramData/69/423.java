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
		  int la;
		  int lb;
		  int l;
		  int i;
		  int j;
		  int k;
		  int t;
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  int[] c = new int[1000];
		  String stra = new String(new char[1000]);
		  String strb = new String(new char[1000]);

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  stra = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  strb = tempVar2.charAt(0);
		  }

		  la = stra.length();
		  lb = strb.length();


		  for (i = 0;i <= 1000;i++)
		  {
		   b[i] = 0;
		  }
		   for (i = 0;i <= 1000;i++)
		   {
		   c[i] = 0;
		   }


		  if (la == lb)
		  {
			  for (i = la - 1;i >= 0;i--)
			  {
					  a[i] = stra.charAt(i) + strb.charAt(i) + b[i + 1];

					  if (a[i] >= (106))
					  {
						  a[i] = a[i] - 10;

						  b[i] = 1;

					  }



			  }
				t = 0;
				i = 0;
				while (a[i] == 2 * '0')
				{
					i = i + 1;
				t = t + 1;


				}




				if (b[0] == 1)
				{
				System.out.printf("%d",1);
				}
				for (i = t;i < la;i++)
				{
					System.out.printf("%d",a[i] - 2 * '0');
				}

		  }
			if (la < lb)
			{
			  l = lb - la;



				for (i = la - 1;i >= 0;i--)
				{
					  a[i] = stra.charAt(i) + strb.charAt(i + l) + b[i + 1];

					  if (a[i] >= (106))
					  {
						  a[i] = a[i] - 10;

						  b[i] = 1;


					  }



				}

				if (b[0] == 0)
				{

				   t = 0;
				   i = 0;
				while (strb.charAt(i) == '0')
				{
					i = i + 1;
				t = t + 1;


				}

				 for (i = t;i < l;i++)
				 {
					System.out.printf("%d",strb.charAt(i) - '0');
				 }
				}
				else
				{
					 c[l] = 1;

					for (i = l - 1;i >= 0;i--)
					{

						 strb = tangible.StringFunctions.changeCharacter(strb, i, strb.charAt(i) + c[i + 1]);


						if (strb.charAt(i) >= (58))
						{
						  strb = tangible.StringFunctions.changeCharacter(strb, i, strb.charAt(i) - 10);

						  c[i] = 1;

						}

					}

					  t = 0;
					  i = 0;
					  while (strb.charAt(i) == 2 * '0')
					  {
						  i = i + 1;
							t = t + 1;
					  }
					 if (c[0] == 1)
					 {
					 System.out.printf("%d",1);
					 }
					 for (i = t;i < l;i++)
					 {
					 System.out.printf("%d",strb.charAt(i) - '0');
					 }

				}
				 for (i = 0;i < la;i++)
				 {
					System.out.printf("%d",a[i] - 2 * '0');
				 }

			}



		   if (lb < la)
		  {
			  l = la - lb;



				for (i = lb - 1;i >= 0;i--)
				{
					  a[i] = strb.charAt(i) + stra.charAt(i + l) + b[i + 1];

					  if (a[i] >= (106))
					  {
						  a[i] = a[i] - 10;

						  b[i] = 1;


					  }



				}
				if (b[0] == 0)
				{
					t = 0;
				   i = 0;
				while (stra.charAt(i) == '0')
				{
					i = i + 1;
				   t = t + 1;
				}

				 for (i = t;i < l;i++)
				 {
					System.out.printf("%d",stra.charAt(i) - '0');
				 }
				}
				else
				{
					 c[l] = 1;

					for (i = l - 1;i >= 0;i--)
					{

						 stra = tangible.StringFunctions.changeCharacter(stra, i, stra.charAt(i) + c[i + 1]);


						if (stra.charAt(i) >= (58))
						{
						  stra = tangible.StringFunctions.changeCharacter(stra, i, stra.charAt(i) - 10);

						  c[i] = 1;

						}

					}

					 if (c[0] == 1)
					 {
					 System.out.printf("%d",1);
					 }
					 for (i = 0;i < l;i++)
					 {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


