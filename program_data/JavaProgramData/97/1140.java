package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int m;
	int j;
	int k;
	int[] A = new int[100];
	int P1 = 0;
	int P2 = 0;
	int P3 = 0;
	int P4 = 0;
	int P5 = 0;
	int P6 = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	P1 = n / 100;
	n = n - (P1 * 100);
	P2 = n / 50;
	n = n - (P2 * 50);
	P3 = n / 20;
	n = n - (P3 * 20);
	P4 = n / 10;
	n = n - 10 * P4;
	P5 = n / 5;
	n = n - 5 * P5;
	P6 = n;


	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",P1,P2,P3,P4,P5,P6);










	/*for(i=0;i<n;i++)
	{
		scanf("%d",&A[i]);
	}
	
	for(i=0;i<n;i++)
	{
		if(A[i]<=18) P1++;
		if((A[i]>=19)&&(A[i]<=35)) P2++;
		if((A[i]>=36)&&(A[i]<=60)) P3++;
		if(A[i]>=61) P4++;
	}
	
	printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",
	(double)100*P1/n,(double)100*P2/n,(double)100*P3/n,(double)100*P4/n);
	*/
	return 0;
	}
}

