package <missing>;

public class GlobalMembers
{
	//??????????????????????


	public static int getMin(int[] ai, int[] ais) //?????
	{
		int i;
		int min = 0;
		for (i = 1; i < MAX && ai[i] != -1; i++)
		{
			if (ai[i] < ai[min])
			{
				min = i;
			}
		}
		ais[min] = 0;
		return min;
	}
	public static int getMax(int[] bi) //?????
	{
		int i;
		int max = 0;
		for (i = 1; i < MAX && bi[i] != -1; i++)
		{
			if (bi[i] > bi[max])
			{
				max = i;
			}
		}
		return max;
	}
	public static int hasEqual(int a, int[] ai, int[] ais)
	{
		int i;
		for (i = 0; i < MAX; i++)
		{
			if (ai[i] <= a != 0 && ais[i] == 1)
			{
				ais[i] = 0;
				return i;
			}
		}
		return -1;
	}
	public static int Main()
	{
		int[] ai = new int[MAX];
		int[] bi = new int[MAX];
		int[] aischeck = new int[MAX];
		int n = 0;
		int i;
		int temp;
		for (i = 0; i < MAX; i++) //???
		{
			ai[i] = -1;
			bi[i] = -1;
			aischeck[i] = 1;
		}
		int mi;
		int ma;
		int min;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > MAX)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ai[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				bi[i] = Integer.parseInt(tempVar4);
			}
			while (ai[i] > bi[i]) //????????????????
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					ai[i] = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					bi[i] = Integer.parseInt(tempVar6);
				}
			}
		}
		mi = min = getMin(ai, aischeck);
		ma = max = getMax(bi);
		temp = hasEqual(bi[min], ai, aischeck);
		while (temp != -1) //????
		{
			temp = hasEqual(bi[temp], ai, aischeck);
			if (bi[temp] == bi[ma])
			{
				System.out.printf("\n%d %d", ai[mi], bi[ma]);
				return 0;
			}
		}
		System.out.print("no\n");
	}


	/*
	int main(){
	    int n,min,max;
	    int add=0;
	    int a[100000];
	    int b[100000];
	    int sz[100000];
	    scanf("%d",&n);
	    for(int i=0;i<n;i++){
	        scanf("%d%d",&a[i],&b[i]);
	   // printf("%d%d\n",a[i],b[i]);    
	}
	    for(int i=0;i<n;i++){
	        if(i==0)min=a[i];
	        else if(i!=0&&a[i]<min)
	            min=a[i];
	            
	    }
	    for(int i=0;i<n;i++){
	        if(i==0)max=b[i];
	        else if(i!=0&&b[i]>max)
	            max=b[i];
	            
	    }
	    for(int i=min;i<=max;i++){
	        sz[i]=1;
	    }
	    for(int i=0;i<n;i++){
	    for(int j=a[i]+0.5;j<=b[i];j++){
	        sz[j]=0;
	    }
	    }
	    for(int i=min;i<=max;i++){
	        add=add+sz[i];
	    }
	    if(add>0)printf("no");
	    else printf("%d %d",min,max);
	}
	
	
	
	
	*/


}

