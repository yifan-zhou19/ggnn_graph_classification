package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int j;
		int e;
		int[] a = new int[50000];
		int[] b = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
		}
		for (j = 1;j <= n;j++)
		{
				for (i = 0;i < n - j;i++)
				{
						  if (a[i] > a[i + 1])
						  {
								   e = a[i + 1];
								   a[i + 1] = a[i];
								   a[i] = e;
								   e = b[i + 1];
								   b[i + 1] = b[i];
								   b[i] = e;
						  }
						  else if (a[i] == a[i + 1])
						  {
								   if (b[i] > b[i + 1])
								   {
									   e = b[i + 1];
									   b[i + 1] = b[i];
									   b[i] = e;
								   }
						  }
				}
		}


		int tmp = b[0];
		for (i = 1; i < n; i++)
		{
			if (a[i] > tmp)
			{
					System.out.print("no\n");
					return 0;
			}
			if (tmp < b[i])
			{
				tmp = b[i];
			}
		}


		/*j=0;
		for(i=0;i<n-1;i++){
		        if(b[i]<a[i+1])
		        {
		            printf("no");
		            break;
		        }
		        else j++;
		}
		
		if(j==n-1) */
		System.out.printf("%d %d",a[0],tmp);
		//scanf("%d",&n);
		return 0;
	}
}

