package <missing>;

public class GlobalMembers
{
	public static int[] prime = new int[20000];
	public static int[] vis = new int[50001];

	public static int isprime(int x)
	{
		int m = (int)Math.floor(Math.sqrt(x) + 0.5);
		if (x % 2 == 0)
		{
			return 0;
		}
		for (int i = 3;i <= m;i += 2)
		{
		  if (x % i == 0)
		  {
			  return 0;
		  }
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		/*for(int i=3;i<n;i++)
		  if(isprime(i)) prime[k++]=i;
		int s;
		/*for(s=6;s<=n;s+=2)
		for(int j=0;j<k;j++)
		  {
		     if(vis[s]==1) break;
		     for(int z=j;z<k;z++)
		       if(s == (prime[j] + prime[z]) && vis[s]==0)
		            {
		               cout<<s<<"="<<prime[j]<<"+"<<prime[z]<<endl;
		               vis[s]=1;
		               break;
		            }
		  }*/
		for (int i = 6;i <= n;i += 2)
		{
		 for (int j = 3;;j += 2)
		 {
		   if (isprime(j) != 0 && isprime(i - j) != 0)
		   {
			   int z = i - j;
			   System.out.print(i);
			   System.out.print("=");
			   System.out.print(j);
			   System.out.print("+");
			   System.out.print(z);
			   System.out.print("\n");
			   break;
		   }
		 }
		}
		return 0;
	}

}

