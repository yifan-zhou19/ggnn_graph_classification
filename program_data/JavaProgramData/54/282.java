package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	p:
	{
		  m = n * j + k;
		  for (i = 1;i < n;i++)
		  {
			   if ((m - k) % n == 0 && m * n % (n - 1) == 0)
			   {
				m = m * n / (n - 1) + k;
			   }
			else
			{
				break;
			}
		  }
			if (i != n)
			{
				j++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto p;
			}
	}
	  System.out.printf("%d",m);
	}
}

