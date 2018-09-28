package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		int count = 0;
		for (k = 0;;k++)
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
			if (m != 0 && n != 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num=(int*)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				int num = (int)malloc((Integer.SIZE / Byte.SIZE) * n); //????
				for (i = 0;i < n;i++)
				{
					*(num + i) = i + 1;
				}

				i = 0;
				for (j = 0;j < n - 1;j++) //??n-1?
				{
					for (;;)
					{
						if (*(num + i) == 0)
						{
							i = (i + 1) % n; //??0????
						}
						else
						{
							count++;
							if (count == m)
							{
								*(num + i) = 0;
								count = 0;
								i = (i + 1) % n;
								break;
							}
							else
							{
								i = (i + 1) % n;
							}
						} //count??????????m???
					}
				}
			   for (i = 0;i < n;i++)
			   {
				   if (*(num + i) != 0)
				   {
					   System.out.printf("%d\n",num[i]); //????0???
					   break;
				   }
			   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			   free(num);
			}
			else
			{
				break;
			}
		}

		return 0;
	}

}

