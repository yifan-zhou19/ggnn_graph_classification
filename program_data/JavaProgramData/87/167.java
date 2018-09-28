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
		int s1;
		int s2;
		int s3;
		int s;
		int x = 0;
		int i;

		for (i = 0;x != 1;i++)
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
		  if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
		  {
		   x = 1;
		  return 0;
		  }
		  else
		  {
		  s = 0;
		  d = d + 12;
		  if (f >= c)
		  {
			s3 = f - c;
		  }
		  else
		  {
			s3 = 60 + f - c;
			e--;
		  }
		  if (e >= b)
		  {
			s2 = (e - b) * 60;
		  }
		  else
		  {
			s2 = (60 + e - b) * 60;
			d--;
		  }
		  s1 = (d - a) * 3600;
		  s = s1 + s2 + s3;
		  System.out.printf("%d\n",s);
		  }

		}


		return 0;
	}

}

