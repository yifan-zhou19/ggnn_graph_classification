package <missing>;

public class GlobalMembers
{
	public static int huiwen(int n)
	{
	int a;
	int b;
	b = 0;
	a = n;
	while (a != 0)
	{
	b = b + a % 10;
	a = (int)a / 10;
	b = b * 10;
	}
	b = b / 10;
	if (b == n)
	{
	return 1;

	}
	return 0;


	}
	public static int shushu(int n)
	{
	int i;
	for (i = 2;i < n;i++)
	{
	if (n % i == 0)
	{
	return 0;
	}

	}
	 return 1;

	}
	public static int Main()
	{
	 int m;
	 int n;
	 int t;
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
	 int i;
	 int count = 0;
	 for (i = m;i <= n;i++)
	 {


	  if (huiwen(i) != 0 && shushu(i) != 0)
	  {
		  count++;
	   System.out.printf("%d",i);
	   t = i;
	   break;


	  }


	 }
	  for (i = t + 1;i <= n;i++)
	  {


	  if (huiwen(i) != 0 && shushu(i) != 0)
	  {
		  count++;
	   System.out.printf(",%d",i);
	   t = i;



	  }


	  }


	if (count == 0)
	{
		System.out.print("no");
	}
	return 0;


	}
}

