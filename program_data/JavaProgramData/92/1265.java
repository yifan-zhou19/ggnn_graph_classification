package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
	int i;
	int j;
	int k;
	int[] a = new int[1001];
	int[] b = new int[1001];
	int sum = 0;
	int win;
	int draw;
	int t;
	int as;
	int ae;
	int bs;
	int be;

	for (k = 0;;k++)
	{

	   sum = 0;

	win = 0;

	draw = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

		if (n == 0)
		{
			break;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{

		   for (j = i + 1;j < n;j++)
		   {

				if (a[i] < a[j])
				{

					t = a[j];

					a[j] = a[i];

					a[i] = t;

				}

	if (b[i] < b[j])

	{

	 t = b[j];

	  b[j] = b[i];

					b[i] = t;


	}

		   }

		}

	 //cong da dao xiao

	   //test sort
		//for(i=0;i<n;i++)
		//    printf("a:%d,b:%d\n",a[i],b[i]);
		//test end
		as = 0; //amax
		ae = n - 1; //amin
		bs = 0; //bmax
		be = n - 1; //bmin
		while (as <= ae)
		{
			if (a[as] > b[bs])
			{
				as++;
				bs++;
				win++;
			}
			else if (a[ae] > b[be])
			{
				ae--;
				be--;
				win++;
			}
			else
			{
				if (a[ae] == b[bs])
				{
					ae--;
					bs++;
					draw++;
				}
				else
				{
					ae--;
					bs++;
				}
			}

		}
		sum = win * 200 - (n - win - draw) * 200;
		//printf("win:%d;draw:%d;\n",win,draw);
		System.out.printf("%d\n",sum);
	}
	return 0;
	}

}

