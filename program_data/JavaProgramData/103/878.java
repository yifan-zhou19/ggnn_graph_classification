package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String str = new String(new char[1001]);
		 int len;
		 int i;
		 int temp;
		 int sum = 1;
		 int k = 1;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 str = tempVar.charAt(0);
		 }
		 len = str.length();
		  temp = 0;
		 for (i = 0 ;i <= len + 1 ;i++)
		 {
			 while (str.charAt(k) == str.charAt(temp) || str.charAt(k) == str.charAt(temp) + 32 || str.charAt(k) == str.charAt(temp) - 32)
			 {
				 sum++;
				 k++;
			 }

			   if (str.charAt(temp) >= 'a' && str.charAt(temp) <= 'z')
			   {
			   str.charAt(temp) -= 32;
			   }
			   System.out.printf("(%c,%d)",str.charAt(temp),sum);
			   sum = 1;
			   temp = k;
			   i = k + 1;
			   k = k + 1;
		 }
	}

}

