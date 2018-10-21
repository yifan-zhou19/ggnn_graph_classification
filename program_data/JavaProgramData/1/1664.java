void factor(int,int);
int[] result = new int[9999];
int j = 0;
int main()
{
	int times;
	int k = 1;
	times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (k <= times)
	{
	int num;
	int ansf = 0;
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	factor(2,num);

	for (int i = 0;i < 9999;i++)
	{
		if (result[i] != 0)
		{
			ansf++;
		}
	}
	System.out.print(ansf);
	System.out.print("\n");

	for (int i = 0;i < 9999;i++)
	{
		result[i] = 0;
	}

	k++;
	}


	return 0;
}

void factor(int start,int num)
{
  if (num == 1)
  {
		 result[j] = 1;
		 j++;
  }

   for (int i = start;i <= num;i++)
   {
	   if (num % i == 0)
	   {
		   factor(i,num / i);
	   }
   }
}



