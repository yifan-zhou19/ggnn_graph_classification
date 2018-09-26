package <missing>;

public class GlobalMembers
{
	public static int King(int a,int b)
	{
	  int monkey;
	  int num;
	  int i;
	  int j;
	  int countor;

	/*scanf("%d%d",&monkey,&num);*/
	monkey = a;
	num = b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *Monkey =(int*)malloc(monkey *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	int Monkey = (int)malloc(monkey * (Integer.SIZE / Byte.SIZE));
	for (i = 0;i < monkey;i++)
	{
		*(Monkey + i) = 0;
	   // printf("%d\n",*(Monkey+i));
	}

	for (i = 0,j = 0,countor = 1;j < monkey - 1;)
	{
		 if (*(Monkey + i % monkey) == -1)
		 {
			 i++;
			 continue;
		 }
		 if (countor == num)
		 {
				*(Monkey + i % monkey) = -1;
			   // printf("No.%d is %d\n",i%monkey+1,*(Monkey+i%monkey));
				j++;
				i++;
				countor = 1;
				//printf("i=%d j=%d countor=%d\n",i,j,countor);
				continue;
		 }
		 i++;
		 countor++;
		 //printf("//i=%d j=%d countor=%d\n",i,j,countor);
	}



	//for(i=0;i<monkey;i++) printf("%d\n",*(Monkey+i));
	 for (i = 0;i < monkey;i++)
	 {
			if (*(Monkey + i) != -1)
			{
				return (i + 1);
			}
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(Monkey);
	}
	public static int Main()
	{
		int[] king = new int[100];
		int a;
		int b;
		int n = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		while (a != 0 && b != 0)
		{
		   king[n] = King(a, b);
		   n++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}

		}
		for (k = 0;k < n;k++)
		{
			System.out.printf("%d\n",king[k]);
		}
		return 0;
	}

}

