package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   char[] str = {'E', 'n', 'd', '\0', '\0'};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   i = Integer.parseInt(tempVar);
	   }
	   while (i != 1)
	   {
		   if (i % 2 == 0)
		   {
			   System.out.printf("%d/2=%d\n",i,i / 2);
			   i = i / 2;
		   }
		   else
		   {
			   System.out.printf("%d*3+1=%d\n",i,i * 3 + 1);
			   i = i * 3 + 1;
		   }
	   }
	   System.out.printf("%s",str);
	}

}

