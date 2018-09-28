package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int m;
	  int n;
	  int a100 = 0;
	  int a50 = 0;
	  int a20 = 0;
	  int a10 = 0;
	  int a5 = 0;
	  int a1 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (;m >= 100;)
	{
	  m = m - 100;
	 a100++;
	}
	for (;m >= 50;)
	{
	  m = m - 50;
	 a50++;
	}
	for (;m >= 20;)
	{
	  m = m - 20;
	 a20++;
	}
	for (;m >= 10;)
	{
	  m = m - 10;
	 a10++;
	}
	for (;m >= 5;)
	{
	  m = m - 5;
	 a5++;
	}
	for (;m >= 1;)
	{
	  m = m - 1;
	 a1++;
	}
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a100,a50,a20,a10,a5,a1);



	}
}

