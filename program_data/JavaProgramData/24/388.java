package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sth = new String(new char[N]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = 0;
		String min = null;
		String max = null;
		int flag = 0;
		int sum = 0;
		int sum_max = 0;
		int sum_min = N;
		sth = new Scanner(System.in).nextLine();
		for (p = sth;p <= sth + sth.length();p++)
		{
			if (*p == ' ' || *p == '\0')
			{
				if (flag == 0)
				{
				continue;
				}
			   if (sum > sum_max)
			   {
				   max = p - sum;
				   sum_max = sum;
			   }
			   if (sum < sum_min)
			   {
				   min = p - sum;
				   sum_min = sum;
			   }
			   sum = 0;
			   flag = 0;
			}
		   else
		   {
			   sum++;
			   flag = 1;
		   }
		}
	   for (p = max;p < max.Substring(sum_max);p++)
	   {
		   System.out.printf("%c",*p);
	   }
	   System.out.print("\n");
	   for (p = min;p < min.Substring(sum_min);p++)
	   {
		   System.out.printf("%c",*p);
	   }
	   System.out.print("\n");
	   System.in.read();
	   System.in.read();
	return 0;
	}

}
