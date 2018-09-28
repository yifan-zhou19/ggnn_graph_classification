package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a; //???????a?b
	  int b;
	  int[] num = new int[100];
	  int top = 0;
	  String s = new String(new char[100]); //???????s
	  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  s = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int i;
	  for (i = 0;s.charAt(i) != '\0';i++)
	  {
	   if ((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) //???????????????
	   {
		num[i] = s.charAt(i) - 'A' + 10;
	   }
	   else if ((s.charAt(i) >= 90) && (s.charAt(i) <= 122)) //?????????????
	   {
		num[i] = s.charAt(i) - 'a' + 10;
	   }
	   else if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9')) //???????????
	   {
		num[i] = s.charAt(i) - '0';
	   }
	   top++;
	  }
	 int sum = 0; //??sum
	  for (i = 0;i < top;i++) //?sum????
	  {
		 sum = sum * a + num[i];
	  }
	String s1 = new String(new char[10000]); //???????
	  int j; //??j
	  if (sum == 0)
	  {
		  System.out.print("0");
		  System.out.print("\n");
	  }
	  else // ????????
	  {
		  for (j = 0;sum != 0;j++)
		  {
	  if ((sum % b) > 9)
	  {
		  s1 = tangible.StringFunctions.changeCharacter(s1, j, (char)((sum % b) - 10 + 'A'));
	  }
	  else
	  {
		  s1 = tangible.StringFunctions.changeCharacter(s1, j, (char)((sum % b) + '0'));
	  }
	  sum = sum / b;


		  }
	  for (j = j - 1;j >= 0;j--)
	  {
	  System.out.print(s1.charAt(j));

	  }



	  System.out.print("\n");
	  }
	 return 0; //?????
	}


}

