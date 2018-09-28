package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int f;
	  int sum;
	  int s;
	  int m;
	  int h;
	   int i = 0;

	   for (i = 0;i >= 0;i++)
	   {

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
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  d = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  e = Integer.parseInt(tempVar5);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ");
		  if (tempVar6 != null)
		  {
			  f = Integer.parseInt(tempVar6);
		  }
		  if (a == 0)
		  {
			  break;
		  }
		  s = 0 - c;

		  if (s < 0)
		  {
			  s += 60;
			  b++;
		  }
		  m = 0 - b;
		  if (m < 0)
		  {
			  m += 60;
			  a++;
		  }
		  h = 12 - a;
		  h += d;
		  m += e;
		  s += f;

		  sum = h * 3600 + m * 60 + s;

		  System.out.printf("%d\n",sum);

	   }


		return 0;
	}
}

