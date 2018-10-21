package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
	 int[] num = new int[58];
	 int i;
	 int len;
	 int t = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 str = tempVar.charAt(0);
	 }
	 len = str.length();
	 for (i = 0;i < len;i++)
	 {
	   if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
	   {
		num[str.charAt(i) - 'A']++;
	   }
	 }

	   for (i = 0;i < 58;i++)
	   {
		   if (num[i] != 0)
		   {
			  System.out.printf("%c=%d\n",i + 'A',num[i]);
			 t = 1;
		   }
	   }
		if (t == 0)
		{
		  System.out.print("No\n");
		}
	   return 0;
	}

}

