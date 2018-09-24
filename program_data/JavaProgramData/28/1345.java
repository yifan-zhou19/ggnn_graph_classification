package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] str = new char[300][10];
	   char c;
	   int[] num = new int[300];
	   int n;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str[0] = tempVar.charAt(0);
	   }
	   num[0] = String.valueOf(str[0]).length();
	   for (i = 1;c = System.in.read() != '\n';i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  str[i] = tempVar2.charAt(0);
		  }
		  num[i] = String.valueOf(str[i]).length();
	   }
		n = i;
		System.out.printf("%d",num[0]);
		for (i = 1;i < n;i++)
		{
		  System.out.printf(",%d",num[i]);
		}
	}

}

