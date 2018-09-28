package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n; //m????????
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String a = new String(new char[100]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String b = new String(new char[100]);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		int i;
		int j;
		int k;
		int count1 = 0;
		int count2 = 0;
		int count = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		count1++;
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
		count2++;
		}
		//printf("%d %d\n",count1,count2);

		if (count1 != count2)
		{
		System.out.print("error");
		}
		else
		{
		   for (j = 0;j < count1;j++)
		   {
			  if ((a.charAt(j) == 'A' || a.charAt(j) == 'T' || a.charAt(j) == 'C' || a.charAt(j) == 'G') && (b.charAt(j) == 'A' || b.charAt(j) == 'T' || b.charAt(j) == 'C' || b.charAt(j) == 'G'))
			  {
				 if (a.charAt(j) == b.charAt(j))
				 {
				  count++;
				 }
				  if (j == (count1 - 1))
				  {
					 m = ((double) count / (double)count1);
					// printf("%lf\n",m);
					//printf("%lf\n",n);
					 if (m >= n)
					 {
					 System.out.print("yes");
					 }
					 else
					 {
					 System.out.print("no");
					 }
				  }
			  }
			  else
			  {
				 System.out.print("error");
					break;
			  }
		   }

		}

	}





}

