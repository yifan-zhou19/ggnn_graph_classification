import java.util.*;

// ?????? ???1000010500
// ?????
// 2010-11-24


int total = char[]; //?????
int hign = new int(int[],int[],int); // ????
char[][] t = new char[2][100000];
int main()
{
	int i;
	int j;
	int n;
	int[][] num = new int[2][100000];

	t[0] = new Scanner(System.in).nextLine();
	t[1] = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(num,0,(Integer.SIZE / Byte.SIZE));

	i = 0;
	for (j = 0;t[0][j] != '\0';j++) // ???????
	{
		if (t[0][j] == ',')
		{
				 i += 1;
				 continue;
		}
		num[0][i] = num[0][i] * 10 + t[0][j] - '0';
	}
	n = i;
	i = 0;
	for (j = 0;t[1][j] != '\0';j++) // ???????
	{
		if (t[1][j] == ',')
		{
				 i += 1;
				 continue;
		}

		num[1][i] = num[1][i] * 10 + t[1][j] - '0';
	}

	System.out.print(total(t[0]));
	System.out.print(' ');
	System.out.print(hign(num[0],num[1],n));
	return 0;
}

int total(char t[])
{
	int count = 1; // ????�?�?1
	int i;
	for (i = 0;t[i] != '\0';i++)
	{
		if (t[i] == ',')
		{
			count++;
		}
	}
	return count;
}

int hign(int a[],int b[],int n) // ??????? ???
{
	int i;
	int j;
	int count;
	int max = 0;
	for (i = 0;i < 1000;i++)
	{
		count = 0;
		for (j = 0;j <= n;j++)
		{
			if (a[j] <= i != 0 && b[j] > i) // ?i????
			{
				count++;
			}
			if (count > max)
			{
				max = count;
			}
		}
	}
	return max;
}
