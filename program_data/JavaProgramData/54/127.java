package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		int m;
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
		i = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	begin:
	m = n * i + k;
		  j = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	judge:
	if (n * m % (n - 1) == 0)
	{
			  j++;
			  m = n * m / (n - 1) + k;
			  if (j == n)
			  {
				  System.out.printf("%ld\n",m);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  goto end;
			  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  goto judge;
	}
		   else
		   {
			   i++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto begin;
		   }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
	}

}

