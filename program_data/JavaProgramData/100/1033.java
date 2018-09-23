package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[300]);
	   final String letter = "abcdefghijklmnopqrstuvwxyz";
	   int[] num = new int[300];
	   int total = 0;
	   int i;
	   int j;
	   for (i = 0;i < 26;i++)
	   {
		   num[i] = 0;
	   }
	   int len;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str = tempVar.charAt(0);
	   }
	   len = str.length();
	   for (i = 0;i < len;i++)
	   {
		   for (j = 0;j < 26;j++)
		   {
			   if (str.charAt(i) == letter.charAt(j))
			   {
				   num[j]++;
			   }
		   }
	   }
	   for (i = 0;i < 26;i++)
	   {
		   if (num[i] > 0)
		   {
		   System.out.printf("%c=%d\n",letter.charAt(i),num[i]);
		   }
	   }
	   for (i = 0;i < 26;i++)
	   {
		   total += num[i];
	   }
	   if (total == 0)
	   {
		   System.out.print("No\n");
	   }
	   return 0;
	}
}

