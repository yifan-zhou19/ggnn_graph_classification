package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int p = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	while (n != 0)
	{
		System.out.printf("%d",n % 10);
	n = n / 10;
	}
	/*for(i=m;i<=n;i++)
	{	if(i%7==0) 
		{if(p==1)
		{putchar(',');p--;}
		printf("%d",i);
		p++;}
	}*/
	}
}

