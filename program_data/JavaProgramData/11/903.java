package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  c = Integer.parseInt(tempVar3);
		  }
		  switch (b)
		  {
		   case 1:
			   n = c;
			   break;
		   case 2:
			   n = 31 + c;
			   break;
		   case 3:
			   n = 31 + 28 + c;
			   break;
		   case 4:
			   n = 31 + 28 + 31 + c;
			   break;
		   case 5:
			   n = 31 + 28 + 31 + 30 + c;
			   break;
		   case 6:
			   n = 31 + 28 + 31 + 30 + 31 + c;
			   break;
		   case 7:
			   n = 31 + 28 + 31 + 30 + 31 + 30 + c;
			   break;
		   case 8:
			   n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + c;
			   break;
		   case 9:
			   n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + c;
			   break;
		   case 10:
			   n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
			   break;
		   case 11:
			   n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c;
			   break;
		   case 12:
			   n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c;
			   break;
		  }
		   if (((a % 100 == 0 && a % 400 == 0) || (a % 400 == 0)) && b >= 3)
		   {
		   n = n + 1;
		   }
		   System.out.printf("%d",n);
		   System.in.read();
		   System.in.read();
	}

}

