package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[10000];
	int[] b = new int[10000];
	int n;
	int i;
	int j;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	do
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		i = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		j = Integer.parseInt(tempVar3);
	}
	if ((i + j) != 0)
	{
	a[j] = a[j] + 1;
	b[i] = b[i] + 1;
	}
	} while ((i + j) != 0);
	//for (i=0;i<n;i++){printf("%d %d\n",a[i],b[i]);}
	j = 0;
	for (i = 0;i < n;i++)
	{
		if ((a[i] == (n - 1)) && (b[i] == 0))
		{
		t = i;
		j = j + 1;
		}
	}
	if (j <= 0)
	{
		System.out.print("NOT FOUND\n");
	}
	else
	{
		System.out.printf("%d\n",t);
	}

	//if (j==0)printf("%d\n",j);
	}

}

