package <missing>;

public class GlobalMembers
{
	public static int f(int a, int j)
	{
		int i;
		int tem;
		//if(j>sqrt(a))return 0;
		int count = 0;
	   for (i = j;i <= Math.sqrt(a);i++)
	   {
		   if (a % i == 0)
		   {
					  j = i;
					  //tem=f(a/i,j);
					  //count=(tem+1)+count;
					  //cout<<"i="<<i<<","<<"f="<<tem<<","<<count<<endl;
					  //cout<<"count="<<count<<endl;
					  //count=(f(a/i,j)+1)+count;
					  //count=count+(f(a/i,j)+1);
					  if (a / i < j)
					  {
						  count += 1;
					  }
					  else
					  {
						  count += (f(a / i, j) + 1);
					  }
					  //cout<<"i="<<i<<","<<count<<endl;
		   }
	   }
	   return count;
	}
	public static int Main()
	{
		int n;
		int a;
		int s;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
						a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						s = f(a, 2) + 1;
						System.out.print(s);
						System.out.print("\n");
		}

		return 0;
	}
}

