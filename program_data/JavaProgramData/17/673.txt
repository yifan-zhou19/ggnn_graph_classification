package <missing>;

public class GlobalMembers
{
	/*
	  Name: ??????
	  Copyright: 
	  Author: 
	  Date: 20/11/12 21:21
	  Description: ????????????100?????????????????
	  ????????????????????????????????????
	  ????????????????????????????????????
	  ????????????????????????????????????
	  ??"$"??,?????????"?"?? 
	*/
	public static int Main()
	{
	   final String str = "";
	   int m = 0;
	   int i; //????
	   int j;
	   int t;
	   int a = 0; //???????
	   int b = 0;
	   int[] c = new int[100];

	   while ((str[m] = ConsoleInput.readToWhiteSpace(true)).length() > 0)
	   {

			   for (j = 0;j < String.valueOf(str.charAt(m)).length();j++)
			   {
				  if (str.charAt(m)[j] == '(')
				  {
					 if (j == String.valueOf(str.charAt(m)).length() - 1)
					 {
						c[j] = 1;
					 }
					 else
					 {
						 for (t = j;;t++)
						 {
							if (str.charAt(m)[t] == '(')
							{
							   a++;
							}
							else if (str.charAt(m)[t] == ')')
							{
							   b++;
							}
							if (t == String.valueOf(str.charAt(m)).length() - 1 || (a == b && a != 0))
							{
								break;
							}
						 }

							if (a > b) // �(�?�?�??????�?�????
							{
							   c[j] = 1;
							}
							a = b = 0;
					 }
				  }
				  else if (str.charAt(m)[j] == ')')
				  {
					 if (j == 0)
					 {
						c[j] = 2;
					 }
					 else
					 {
						 for (t = j;;t--)
						 {
							if (str.charAt(m)[t] == '(')
							{
							   a++;
							}
							else if (str.charAt(m)[t] == ')')
							{
							   b++;
							}
							if (t == 0 || (a == b && a != 0))
							{
							   break;
							}
						 }

						 if (a < b) //�?�?�?�???�?�??
						 {
							   c[j] = 2;
						 }
						 a = b = 0;
					 }
				  }
				  else
				  {
					 continue;
				  }
			   }

			   System.out.print(str.charAt(m));
			   System.out.print("\n");

			   for (j = 0;j <= String.valueOf(str.charAt(m)).length() - 1;j++)
			   {
				  if (c[j] == 0)
				  {
					 System.out.print(' ');
				  }
				  else if (c[j] == 1)
				  {
					 System.out.print('$');
				  }
				  else if (c[j] == 2)
				  {
					 System.out.print('?');
				  }
			   }
				System.out.print("\n");

				   a = 0;
				   b = 0;
				   for (j = 0;j < 100;j++) //??
				   {
					  c[j] = 0;
				   }

			   m++;

	   }
	   return 0;
	}


}

