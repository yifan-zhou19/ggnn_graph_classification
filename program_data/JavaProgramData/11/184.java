package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   int sum = 0;
	   int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   c = Integer.parseInt(tempVar3);
	   }
	   for (int i = 0;i < b;i++)
	   {
		   sum = sum + month[i];
	   }
	   sum = sum + c;
	   if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
	   {
		   sum = sum + 1;
	   }
	   System.out.printf("%d\n",sum);
	   return 0;
	}
}

