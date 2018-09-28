package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int n;
	 int sum = 0;
	 String[] letter = {""};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  (letter + i) = tempVar2;
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (i != n - 1)
	  {
		  if (sum == 79 || ((sum + String.valueOf(letter[i]).length()) > 80))
		  {
		  System.out.print("\n");
		  sum = 0;
		  i--;
		  }
	  else
	  {
	   if ((sum + String.valueOf(letter[i]).length() + 1 + String.valueOf(letter[i + 1]).length()) > 80)
	   {
		   sum += String.valueOf(letter[i]).length();
	   System.out.printf("%s",letter[i]);
	   sum++;
	   }
	   else
	   {
		   sum += String.valueOf(letter[i]).length();
	   System.out.printf("%s ",letter[i]);
	   sum++;
	   }
	  }
	  }
	  else
	  {
	  System.out.printf("%s",letter[i]);
	  }
	 }
	}

}

