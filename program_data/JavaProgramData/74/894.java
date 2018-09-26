package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
	int m;
	int n;
	int k = 0;
	int i;
	int sushu = int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead("  ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	i = m;
		for (;i <= n;i++)
		{
			b = i;
		   c = 0;
		   while (b != 0)
		   {
			   c = c * 10 + b % 10;
			b = b / 10;
		   }
		   if ((c == i) && (sushu(c) == 1))
		   {
		if (k == 0)
		{
			System.out.printf("%d",c);
			k = 1;
		}
	else
	{
		System.out.printf(",%d",c);
	}
		   }
		}
			  if (k == 0)
			  {
	System.out.print("no");
			  }
	}



	public static int sushu(int x)
	{
		  int t = 0;
		  int z;
			z = 2;
		for (;z <= (x / 2);z++)
		{
			if (x % z == 0)
			{
				break;
			}
		 else if (z == (x / 2))
		 {
			 t = 1;
		 }
		}
		return (t);
	}
}

