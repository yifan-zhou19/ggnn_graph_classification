package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{
		   if (n % i == 0)
		   {
			break;
		   }
		}
		if (i == n)
		{
		 return 1;
		}
		else
		{
		 return 0;
		}
	}
	public static int huiwenshu(int m)
	{
		int d;
		int m1;
		 m1 = m;
		  for (d = 0;m != 0;)
		  {
			   d = d * 10 + m % 10;
			   m = m / 10;
		  }
		  if (m1 == d)
		  {
		   return 1;
		  }
		  else
		  {
		   return 0;
		  }
	}
	public static int Main()
	{
		 int m;
		 int n;
		 int i;
		 int count = 0;
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
			  if (huiwenshu(i) == 1)
			  {
					if (sushu(i) == 1)
					{
					  if (count == 0)
					  {
						System.out.printf("%d",i);
						count++;
					  }
					  else
					  {
					   System.out.printf(",%d",i);
					  }
					}
			  }
		 }
		 if (count == 0)
		 {
		   System.out.print("no");
		 }
		 System.in.read();
		 System.in.read();
	}


}

