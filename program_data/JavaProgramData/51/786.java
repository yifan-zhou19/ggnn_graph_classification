package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[500]);
	int[] b = new int[500];
	int n;
	int i;
	int j;
	int k;
	int len;
	int q = 0;
	int time = 0;
	int max;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	len = a.length();

	 for (j = 0;j < len - n + 1;j++)
	 {
			  for (i = 0;i <= j;i++)
			  {

					for (k = 0;k < n;k++)
					{
					 if (a.charAt(j + k) == a.charAt(i + k))
					 {
					 q++;
					 }
					 else
					 {
						 q = 0;
						 break;
					 }
					}
				  if (q == n)
				  {
					  b[i]++;
					  q = 0;
					  break;
				  }
				  else
				  {
				  q = 0;
				  }

			  }

	 }
	//for(i=0;i<len-n+1;i++)
	//printf("%d",b[i]);


	max = b[0];
	for (i = 1;i < len - n + 1;i++)
	{
	  if (b[i] > max)
	  {
	  max = b[i];
	  }
	  else
	  {
		  ;
	  }
	}


	if (max == 1)
	{
	System.out.print("NO");
	}
	else
	{
		System.out.printf("%d\n",max);
		for (i = 0;i < len - n + 1;i++)
		{
		 if (max == b[i])
		 {
		 for (k = 0;k < n;k++)
		 {
				 System.out.printf("%c",a.charAt(i + k));
		 }
		 }
		 System.out.print("\n");
		}
	}
	return 0;
	}

}

