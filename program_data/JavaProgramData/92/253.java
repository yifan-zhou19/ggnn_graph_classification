package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1002];
	public static int[] b = new int[1002];
	public static int n;
	public static int sum;
	public static int cas;
	public static int cmp1(Object a, Object b)
	{
	 int i;
		 i = ((int)a) - ((int)b);
	 return i;
	}
	public static int cmp2(Object a, Object b)
	{
	 int i;
		 i = ((int)b) - ((int)a);
	 return i;
	}
	public static void solve()
	{
		int i;
		int j;
		int k;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if ((b[j] < a[i]) && (b[j] != -1) && (a[i] != -1))
				{
					sum++;
					b[j] = -1;
					a[i] = -1;
					break;
				}
				/*if ((b[j]==a[i])&&(b[j]!=-1)&&(a[i]!=-1))
				{
					cas--;
					b[j]=-1;
					a[i]=-1;
					break;
				}*/
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if ((b[j] == a[i]) && (b[j] != -1) && (a[i] != -1))
				{
					cas++;
					b[j] = -1;
					a[i] = -1;
					break;
				}
			}
		}
	//	cout<<"cas="<<cas<<endl;
	//	cout<<"sum="<<sum<<endl;

		System.out.print(200 * (sum - (n - cas - sum)));
		System.out.print("\n");
	}

	public static int Main()
	{
		int i;
		while (scanf("%d",n))
		{
			if (n == 0)
			{
				break;
			}
			sum = 0;
			cas = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(a[1],n,(Integer.SIZE / Byte.SIZE),cmp1);
			qsort(b[1],n,(Integer.SIZE / Byte.SIZE),cmp2);
			/*for (i=1;i<=n;i++)
				cout<<a[i]<<" ";
			cout<<endl;
			for (i=1;i<=n;i++)
				cout<<b[i]<<" ";
			cout<<endl;*/
			solve();
		}
	}
}

