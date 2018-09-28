String beichushu = new String(new char[150]);
int[] beichu = new int[150]; //???????
int[] chu = new int[150]; //???????????
int[] chu1 = new int[250]; //???????????
int[] shang = new int[200]; //?????
void subtract(int *,int *); //???????????????
int compare = new int(int *,int *); //????????
int wei = int * ; //??????
void fangda(int *, int); //?????10?n???
int main()
{
	int i;
	int j;
	int k;
	int n;
	int max;

		int x = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			beichushu = tempVar.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(beichu,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(chu,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(chu1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(shang,0,(Integer.SIZE / Byte.SIZE));

		for (i = beichushu.length() - 1,j = 0;i >= 0;i--)
		{
			beichu[j++] = beichushu.charAt(i) - '0';
		}
		chu[0] = 3;
		chu[1] = 1;
		chu1[0] = 3;
		chu1[1] = 1;
		k = wei(beichu) - wei(chu); //k????????????
		max = k; //?????????????max???????????
		int a = compare(beichu,chu); //????????????0
		fangda(chu1,k); //????
		while (compare(beichu,chu))
		{
			while (compare(beichu,chu1))
			{
				subtract(beichu,chu1);
				m++;
			}
			shang[x] = m;
			x++;
			m = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(chu1,0,(Integer.SIZE / Byte.SIZE));
			chu1[0] = 3;
			chu1[1] = 1;
			k--;
			if (k >= 1)
			{
				fangda(chu1,k);
			}
		}
		if (shang[0] == 0)
		{
			for (i = 1;i <= max;i++)
			{
				System.out.printf("%d",shang[i]);
			}
		}
		else if (shang[0] > 0)
		{
			for (i = 0;i <= max;i++)
			{
				System.out.printf("%d",shang[i]);
			}
		}
		if (a == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		if (beichu[1] == 1)
		{
		for (i = 1;i >= 0;i--)
		{
			System.out.printf("%d",beichu[i]);
		}
		}
		else
		{
			System.out.printf("%d",beichu[0]);
		}
	return 0;
}

void subtract(int beichu[0],int chu1[0])
{
	int i;
	for (i = 0;i < 120;i++)
	{
		beichu[i] = beichu[i] - chu1[i];
		if (beichu[i] < 0)
		{
			beichu[i] += 10;
			beichu[i + 1]--;
		}
	}
}
int compare(int beichu[0],int chu1[0])
{
	if (wei(beichu) > wei(chu1))
	{
		return 1;
	}
	else if (wei(beichu) < wei(chu1))
	{
		return 0;
	}
	else
	{
		int i;
		for (i = 149;;i--)
		{
			if (beichu[i] > chu1[i])
			{
				return 1;
			}
			else if (beichu[i] < chu1[i])
			{
				return 0;
			}
		}
	}
	return 1;
}
int wei(int * a)
{
	int i;
	int post;
	for (i = 149;i >= 0;i--)
	{
		if (a[i] > 0)
		{
			post = i + 1;
				return post;
		}
	}
}
void fangda(int * c,int n)
{
	int i;
	for (i = 100;i >= 0;i--)
	{
		c[i + n] = c[i];
	}
	for (i = 0;i < n;i++)
	{
		c[i] = 0;
	}
}

