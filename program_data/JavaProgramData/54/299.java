package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int m;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = n + k;;i++)
	{
	   m = i;
	   for (j = 1;j <= n;j++)
	   {
		if ((m - k) % n != 0 || m - k <= 0)
		{
			break;
		}
		else
		{
			m = (m - k) / n * (n - 1);
		}
		  if (j == n)
		  {
			   System.out.printf("%d",i);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto loop;
		  }

	   }
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	System.out.print("\n");
	}

}

