int calculate = int;
int main()
{
	int n;
	int i;
	int j = 0;
	int flag = 0;
	int a;
	int[] str1 = new int[100000];
	int[] str2 = new int[100000];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 0)
	{
		System.out.print("1");
		System.out.print("\n");
		return 0;
	}
	else
	{
		if (n == 1)
		{
			 System.out.print("2");
			 System.out.print("\n");
			 return 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(str1, -1, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(str2, 0, (Integer.SIZE / Byte.SIZE));
	str1[0] = 2;
	for (i = 1; i < n; i++)
	{
		  while (str1[j] != -1)
		  {
				  str2[j] = str1[j] * 2 + str2[j];
				  if (str2[j] >= 10)
				  {
						str2[j] = str2[j] - 10;
						str2[j + 1]++;
				  }
				  j++;
		  }
		  if (i == n - 1)
		  {
				  break;
		  }
		  for (j = 0; j < 1000; j++)
		  {
				  str1[j] = str2[j];
				  str2[j] = 0;
		  }
		  j = 0;
	}
	j = 100000 - 1;
	while (str2[j] == 0)
	{
		  j--;
	}
	for (i = j; i >= 0; i--)
	{
		  System.out.print(str2[i]);
	}
	}
	return 0;
}

