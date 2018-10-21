double myaverage = double * ;
double quaresum = double * ;
double junfangcha = double * ;

int n;
double[] sz = new double[100];

int main(int argc, char * argv[])
{
	int k;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0 ; i < k ; i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (j = 0 ; j < n ; j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[j] = Double.parseDouble(tempVar3);
			}
		}
		System.out.printf("%.5f\n",junfangcha(sz));
	}
	return 0;
}

double myaverage(double sz[0])
{
	double x = 0.0;
	int i;
	for (i = 0 ; i < n ; i++)
	{
		x += sz[i];
	}
	x /= n;
	return x;
}

double quaresum(double sz[0])
{
	double x = 0.0;
	double a;
	int i;
	a = myaverage(sz);
	for (i = 0 ; i < n ; i++)
	{
		x += (sz[i] - a) * (sz[i] - a);
	}
	return x;
}

double junfangcha(double sz[0])
{
	return Math.sqrt(quaresum(sz) / n);
}

