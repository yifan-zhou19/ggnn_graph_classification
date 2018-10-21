package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k = 0;
	int[] P = new int[10000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	/*int*P=(int*)malloc(n*sizeof(int));
	for(i=0;i<n;i++)
	{
	P[i]=0;                
	}*/
	for (;;)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		i = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		j = Integer.parseInt(tempVar3);
	}
	if (i == 0 && j == 0)
	{
	break;
	}
	P[j]++;
	if (P[j] == (n - 1))
	{
	System.out.printf("%d",j);
	k = 1;
	break;
	}

	}
	if (k == 0)
	{
	System.out.print("NOT FOUND");
	}
	}

}

