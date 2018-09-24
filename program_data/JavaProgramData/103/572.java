package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[1000]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 str = tempVar.charAt(0);
	 }
	 int sum;
	 int i;
	 sum = 1;
	 for (i = 1;i <= str.length();i++)
	 {
		 if (str.charAt(i) == str.charAt(i - 1) || (str.charAt(i) - 'a') == (str.charAt(i - 1) - 'A') || (str.charAt(i) - 'A') == (str.charAt(i - 1) - 'a'))
		 {
	   sum++;
		 }
	   else
	   {
		   if (str.charAt(i - 1) >= 'a')
		   {
	   System.out.printf("(%c,%d)",str.charAt(i - 1) - 32,sum);
		   }
		else
		{
			System.out.printf("(%c,%d)",str.charAt(i - 1),sum);
		}
		sum = 1;
	   }

	 }

	}

}

