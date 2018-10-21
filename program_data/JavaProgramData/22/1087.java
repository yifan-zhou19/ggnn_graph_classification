package <missing>;

public class GlobalMembers
{
	public static int turn(String a)
	{
		int sum = 0;
		int i;
	  for (i = 0; !a[i].equals('\0');i++)
	  {
	  sum = sum * 10 + a[i] - '0';
	  }
	return sum;
	}
	public static int Main()
	{
		final String str = "";
		char c;
	   int i;
	   int j;
	   int[] num = new int[300];
	   int max;
	   int nmax;
	   int count;
	   for (i = 0,j = 0;(c = System.in.read()) != '\n';j++)
	   {
		   if (c == ',')
		   {
			   i++;
			   j = -1;
		   }
	   else
	   {
		   str.charAt(i)[j] = c;
	   }
	   }
	   count = i + 1;
	   for (i = 0;i < count;i++)
	   {
		   num[i] = turn(str.charAt(i));
	   }
	   max = num[0];
	   nmax = 0;
	   for (i = 0;i < count - 1;i++)
	   {
			  if (num[i + 1] > max)
			  {
				  nmax = max;
				  max = num[i + 1];
			  }
		   else if ((max - num[i + 1] < max - nmax) && max != num[i + 1])
		   {
			   nmax = num[i + 1];
		   }
	   }
	   for (i = 0;i < count - 1;i++)
	   {
		   if (num[i + 1] != num[i])
		   {
			   break;
		   }
	   }
		   if (i == count - 1)
		   {
			   System.out.print("No\n");
		   }
		   else
		   {
			   System.out.printf("%d\n",nmax);
		   }
		   return 0;
	}

}
