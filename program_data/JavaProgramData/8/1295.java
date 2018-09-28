package <missing>;

public class GlobalMembers
{
	/*void f()
	{
		scanf("%d %d",&num1,num2);
		int i;
		for(i=0;i<num1;i++)
		{
			scanf("%d",&word1[i]);
		}
		printf("\n");
		for(i=0;i<num2;i++)
		{
			scanf("%d",&word2[i]);
		}
		printf("\n");
	}
	void g()
	{
		f();
		int j,k,temp;
		for(j=1;j<=num1*num1;j++)
		{
			for(k=0;k<num1-1;k++)
			{
				if(num1[k]>=num1[k+1])
				{
					temp=num1[k];
					num1[k]=num1[k+1];
					num1[k+1]=temp;
				}
			}
		}
		for(j=1;j<=num2*num2;j++)
		{
			for(k=0;k<num2-1;k++)
			{
				if(num2[k]>=num2[k+1])
				{
					temp=num2[k];
					num2[k]=num2[k+1];
					num2[k+1]=temp;
				}
			}
		}
	}
	void A()
	{
		f();
		g();
		int zjword[300],l;
		for(l=0;l<num1+num2;l++)
		{
			if(l<num1)
			{
				zjword[l]=word1[l];
			}else{
				zjword[l]=word2[l-num1];
			}
		}
	}
	void B()
	{
		f();
		g();
		A();
		int m;
		for(m=0;m<num1+num2;m++)
		{
			if(m!=num1+num2-2)
			printf("%d ",zjword[m]);
			else printf("%d",zjword[m]);
		}
	}*/
	public static int Main()
	{
		int[] word1 = new int[100];
		int[] word2 = new int[100];
		int num1;
		int num2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num2 = Integer.parseInt(tempVar2);
		}
		int i;
		for (i = 0;i < num1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				word1[i] = Integer.parseInt(tempVar3);
			}
		}
		System.out.print("\n");
		for (i = 0;i < num2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				word2[i] = Integer.parseInt(tempVar4);
			}
		}
		System.out.print("\n");
		int j;
		int k;
		int temp;
		for (j = 1;j <= num1 * num1;j++)
		{
			for (k = 0;k < num1 - 1;k++)
			{
				if (word1[k] >= word1[k + 1])
				{
					temp = word1[k];
					word1[k] = word1[k + 1];
					word1[k + 1] = temp;
				}
			}
		}
		for (j = 1;j <= num2 * num2;j++)
		{
			for (k = 0;k < num2 - 1;k++)
			{
				if (word2[k] >= word2[k + 1])
				{
					temp = word2[k];
					word2[k] = word2[k + 1];
					word2[k + 1] = temp;
				}
			}
		}
		int[] zjword = new int[300];
		int l;
		for (l = 0;l < num1 + num2;l++)
		{
			if (l < num1)
			{
				zjword[l] = word1[l];
			}
			else
			{
				zjword[l] = word2[l - num1];
			}
		}
		int m;
		for (m = 0;m < num1 + num2;m++)
		{
			if (m != num1 + num2 - 1)
			{
			System.out.printf("%d ",zjword[m]);
			}
			else
			{
				System.out.printf("%d",zjword[m]);
			}
		}
		return 0;
	}


}

