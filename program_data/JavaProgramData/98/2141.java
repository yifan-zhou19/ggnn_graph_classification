package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)

	{
		int n;
		int i;
		int len = 0;
		String word = new String(new char[20]);
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
			   word = tempVar2.charAt(0);
		   }
		   len = len + 1 + word.length();
		   if (i == 0)
		   {
			   System.out.printf("%s",word);

		   }
		   else
		   {
			   if (len <= 81)
			   {
			   System.out.printf(" %s",word);
			   }
				else
				{
			   System.out.print("\n");
			   System.out.printf("%s",word);
			   len = word.length() + 1;
				}
		   }
		}
	}
}

