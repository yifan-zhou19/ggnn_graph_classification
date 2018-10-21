package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 0;
		int temp = 1;
		int i;
		int j;
		int k = 0;
		int len;
		int n;
	String total = new String(new char[600]);
	final String a = "";
	final String tall = "";
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   System.in.read();
	   total = new Scanner(System.in).nextLine();
	   len = total.length();
	   for (i = 0;i < len - n + 1;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   a.charAt(i)[j] = total.charAt(i + j);
		   }
	   }
	   for (i = 0;i < len - n + 1;i++)
	   {
		   for (j = i + 1;j < len - n + 1;j++)
		   {
	   if (strcmp(a.charAt(i),a.charAt(j)) == 0)
	   {
		   temp++;
	   }
		   }
	   if (temp > max)
	   {
		   max = temp;
	   }
	   temp = 1;
	   }
		 for (i = 0;i < len - n + 1;i++)
		 {
		   for (j = i + 1;j < len - n + 1;j++)
		   {
	   if (strcmp(a.charAt(i),a.charAt(j)) == 0)
	   {
		   temp++;
	   }
		   }
	   if (temp == max)
	   {
		   tall = tangible.StringFunctions.changeCharacter(tall, k, a.charAt(i),k++);
	   }
	   temp = 1;
		 }
		if (max == 1)
		{
			System.out.print("NO");
		}
	else
	{
		System.out.printf("%d\n",max);
		 for (i = 0;i < k;i++)
		 {
			 System.out.println(tall.charAt(i));
		 }
	}
		 return 0;
	}
}

