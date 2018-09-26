package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] x = new int[10100];
	public static int[] y = new int[10100];
	public static String s = new String(new char[101000]);
	public static int ans;
	public static int best;
	public static int[] v = new int[10100];
	public static int Main()
	{
	//    freopen("a.in","r",stdin);
	  //  freopen("a.out","w",stdout);
		s = new Scanner(System.in).nextLine();
		n = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(x,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) == ',')
			{
				n++;
			}
			else
			{
				x[n] = x[n] * 10 + s.charAt(i) - 48;
			}
		}
		s = new Scanner(System.in).nextLine();
		n = 1;
		for (int i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) == ',')
			{
				n++;
			}
			else
			{
				y[n] = y[n] * 10 + s.charAt(i) - 48;
			}
		}
	//    for (int i=1;i<=n;i++) printf("%d %d\n",x[i],y[i]);
	/*    sort(x+1,x+n+1);
	    sort(y+1,y+n+1);
	    ans=0;best=0;
	    int j=1,k=1;
	    for (int i=0;i<=1000;i++)
	    {
	        while (j<=n&&x[j]==i) ans++,j++;
	        while (k<=n&&y[k]==i) ans--,k++;
	        if (ans>best) best=ans;
	    }
	    printf("%d,%d\n",n,best);*/
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(v,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 1;i <= n;i++)
		{
		  for (int j = x[i];j < y[i];j++)
		  {
			  v[j]++;
			  if (v[j] > best)
			  {
				  best = v[j];
			  }
		  }
		}
			System.out.printf("%d %d\n",n,best);
	}

}
