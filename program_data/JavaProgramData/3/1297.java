package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[999999];
	public static int cmp(Object a, Object b)
	{
		return ((int)a) - ((int)b);
	}
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		if (n == 0)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		stable_sort(a,a + n);
		//random_shuffle(a,a+n);
		//qsort(a,n,sizeof a[0],cmp);
		i = 0;
		j = n - 1;
		while (i != j)
		{
			if (a[i] + a[j] > k)
			{
				j--;
				continue;
			}
			else if (a[i] + a[j] < k)
			{
				i++;
				continue;
			}
			else
			{
				System.out.printf("%s","yes");
				//cout<<"YES"<<endl;
				return 0;
			}
		}
		System.out.printf("%s","no");
		//cout<<"NO"<<endl;
		return 0;
	}



}

