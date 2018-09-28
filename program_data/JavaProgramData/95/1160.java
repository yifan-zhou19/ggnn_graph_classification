package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
	  int l1;
	  int l2;
	  int l;
	  int i;
	  int[] t = new int[80];
	  str1 = new Scanner(System.in).nextLine();
	  str2 = new Scanner(System.in).nextLine();
	  l1 = str1.length();
	  l2 = str2.length();
	  if (l1 >= l2)
	  {
	  l = l2;
	  }
	  else
	  {
		  l = l1;
	  }
	  for (i = 0;i <= l - 1;i++)
	  {

		if ((str1.charAt(i) >= 65) && (str1.charAt(i) <= 90))
		{
		str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
		}



		if ((str2.charAt(i) >= 65) && (str2.charAt(i) <= 90))
		{
		str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
		}
	  }
	  for (i = 0;i <= l - 1;i++)
	  {
		   if (str1.charAt(i) == str2.charAt(i))
		   {
		   t[i] = 1;
		   }
		   else
		   {
				if (str1.charAt(i) > str2.charAt(i))
				{
				t[i] = 2;
				}
				else
				{
				t[i] = 3;
				}

		   }
	  }
	   i = 0;
	   while ((t[i] == 1) && (i <= l - 2))
	   {
	   i++;
	   }

	   if (t[i] == 1)
	   {
		   System.out.print("=");
	   }
	   else if (t[i] == 2)
	   {
		   System.out.print(">");
	   }
	   else if (t[i] == 3)
	   {
		   System.out.print("<");
	   }


	   return 0;
	}

}

