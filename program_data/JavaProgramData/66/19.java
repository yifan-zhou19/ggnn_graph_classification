package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

	  int n = 0;
	  int x;
	  int y;
	  int z;
	  int i;
	  int l;
	  int v;
	  int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  y = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  z = Integer.parseInt(tempVar3);
	  }

	  {
		  if (x % 400 == 0)
		  {
		v = 400;
		  }
		  else
		  {
			  v = x % 400;
		  }
  }

	  for (i = 1;i < y;i++)
	  {
		  n += d[i - 1];
	  }
	  n = n + z;
	  n = n + (v - 1) * 365;
	  for (i = 3;i < v;i++)
	  {
		  if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		  {
			  n = n + 1;
		  }
		  else
		  {
			  n = n;
		  }
	  }
	   if (((v % 4 == 0 && v % 100 != 0) || v % 400 == 0) && (y > 2))
	   {
		   n = n + 1;
	   }
		else
		{
			n = n;
		}
	   l = n % 7;
	   switch (l)
	   {
		case 1:
		   System.out.print("Mon.");
		   break;
		case 2:
		   System.out.print("Tue.");
		   break;
		case 3:
		   System.out.print("Wed.");
		   break;
		   case 4:
		   System.out.print("Thu.");
		   break;
		case 5:
		   System.out.print("Fri.");
		   break;
		case 6:
		   System.out.print("Sat.");
		   break;
		case 0:
		   System.out.print("Sun.");
		   break;
	   }
	}



}

