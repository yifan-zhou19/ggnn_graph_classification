package <missing>;

public class GlobalMembers
{
	public static int sushu(int s)
	{
		int k = 0;
		int i;
		if (s != 1)
		{
		for (i = 2;i * i <= s;i++)
		{
			 if (s % i == 0)
			 {
				   k = 1;
				   break;
			 }
		}
		return k;
		}
		else
		{
		return 0;
		}
	}
	public static int huiwen(int s)
	{
		 int p = 0;
		 int r;
		 r = s;
		 for (;s != 0;)
		 {
			  p = p * 10 + s % 10;
			  s = s / 10;
		 }
		 if (r == p)
		 {
		 return 0;
		 }
		 else
		 {
		 return 1;
		 }
	}
	public static int Main()
	{
		  int m;
		  int n;
		  int num = 0;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (i = m;i <= n;i++)
		  {
				   if ((sushu(i) == 0) && (huiwen(i) == 0))
				   {
						num++;
						if (num == 1)
						{
						System.out.printf("%d",i);
						}
						else
						{
						System.out.printf(",%d",i);
						}
				   }
		  }
		  if (num == 0)
		  {
		  System.out.print("no\n");
		  }
		  System.in.read();
		  System.in.read();
	}

}

