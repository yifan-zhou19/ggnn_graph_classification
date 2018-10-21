package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int x;
	int i;
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
	if (a % 4 == 0 && a % 100 != 0)
	{
	  int[] n = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  for (i = 0,x = 0;i < b - 1;i++)
	  {
		x = x + n[i];
	  }
	}
	if (a % 400 == 0)
	{
	  int[] n = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  for (i = 0,x = 0;i < b - 1;i++)
	  {
		x = x + n[i];
	  }
	}
	else
	{
	  int[] n = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  for (i = 0,x = 0;i < b - 1;i++)
	  {
		x = x + n[i];
	  }
	}
	x = x + c;
	System.out.printf("%d",x);
	return 0;
	}
}

