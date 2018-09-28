package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] in = new int[320]; //????
		int i;
		int num; //????
		int last;
		while (1 > 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if ((n == 0) || (m == 0))
			{
				break;
			}
			else
			{
				for (i = 1;i <= n;i++)
				{
					in[i] = i; //?????
				//	printf("%d\n",in[i]);  //debug
				}
				//??????
				last = 1;
				num = n;
				while (num != 1)
				{
					last += m - 1; //??????
				//	printf("%d",last);   //debug
					while (last > num)
					{
						last = last - num;
					}
				//	printf("   %d\n",last);//debug
					num--;
					for (i = last;i <= n;i++)
					{
						in[i] = in[i + 1];
					}
				//	printf("\n%d",num);  //debug
				/*	for(i=1;i<=num;i++)
					{
						printf(" %d",in[i]);
					}
					printf("\n");  */
					//debug
				}
				System.out.printf("%d\n",in[1]);
			}
		}
		return 0;
	}
}

