package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int suma = 0;
		int sumb = 0;
		int n;
		int i;
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
			   a = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b = Integer.parseInt(tempVar3);
		   }
		   if (a == 0 && b == 1)
		   {
			   suma = suma + 1;
		   }
		   if (a == 0 && b == 2)
		   {
			   sumb = sumb + 1;
		   }
		   if (a == 1 && b == 2)
		   {
			   suma = suma + 1;
		   }
		   if (a == 1 && b == 0)
		   {
			   sumb = sumb + 1;
		   }
		   if (a == 2 && b == 0)
		   {
			   suma = suma + 1;
		   }
		   if (a == 2 && b == 1)
		   {
			   sumb = sumb + 1;
		   }
		   if (a == b)
		   {
			   continue;
		   }
		}
		if (suma > sumb)
		{
			 System.out.print("A");
		}
		if (suma < sumb)
		{
			 System.out.print("B");
		}
		if (suma == sumb)
		{
			 System.out.print("Tie");
		}
		return 0;
	}

}

